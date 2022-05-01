package com.vk.downloader.vkalbumdownloader.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.photos.PhotoSizes;
import com.vk.api.sdk.objects.photos.responses.GetResponse;
import com.vk.api.sdk.queries.photos.PhotosGetQuery;
import com.vk.downloader.vkalbumdownloader.client.ImgurClient;
import com.vk.downloader.vkalbumdownloader.model.AlbumConfig;
import com.vk.downloader.vkalbumdownloader.model.ImgurAlbumCreateResponse;
import com.vk.downloader.vkalbumdownloader.model.ImgurImageUploadResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DownloadService {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private VkApiClient vk;

    @Autowired
    private ImgurClient imgurClient;

    @Autowired
    private AlbumConfigService albumConfigService;

    public List<String> downloadAlbums() {

        List<AlbumConfig> albumConfigs = albumConfigService.getAlbumConfigs();
        List<String> imgurAlbumList = new ArrayList<>();
        UserActor actor = authenticationService.authenticate();

        
        albumConfigs
        .stream()
        .filter(albumConfig -> albumConfig.getVkAlbumUrl().contains("album"))
        .forEach(albumConfig -> {

            System.out.println("Starting album ::" +  albumConfig.getVkAlbumUrl());

            ImgurAlbumCreateResponse imgurAlbumCreateResponse = 
            imgurClient.createAlbum(albumConfig.getImgurAlbumTitle(), albumConfig.getImgurAlbumDescription());

            

            PhotosGetQuery photosGetQuery = 
            vk.photos()
            .get(actor)
            .ownerId(albumConfig.getOwner())
            .albumId(albumConfig.getAlbumId())
            .extended(false)
            .rev(false)
            .photoSizes(false)
            .count(1000);

            try {
                GetResponse getResponse = photosGetQuery.execute();
                int index = 0;
                System.out.println("Image Count :: " + getResponse.getCount());
                for(Photo photo: getResponse.getItems()){
                    PhotoSizes maxPhotoSize = photo.getSizes().get(photo.getSizes().size() - 1);
                    uploadImagesToImgur(maxPhotoSize, index++, imgurAlbumCreateResponse);
                }
                String albumUrl = "https://imgur.com/a/" + imgurAlbumCreateResponse.getData().getId();
                System.out.println("Imgur Album URL :: " + albumUrl);
                imgurAlbumList.add(albumUrl);
            } catch (ApiException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClientException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        
        return imgurAlbumList;
    }

    private void uploadImagesToImgur(PhotoSizes size, int index, ImgurAlbumCreateResponse imgurAlbumCreateResponse) throws IOException, MalformedURLException { 
        String baseUrl = "STATIC_PATH\\image";
        String filePath = baseUrl + index + ".jpg";
        try(InputStream in = size.getUrl().toURL().openStream()){
            Files.copy(in, Paths.get(filePath));
        }
        ImgurImageUploadResponse response = imgurClient.upload(Paths.get(filePath), imgurAlbumCreateResponse.getData().getDeletehash());
        System.out.println("Image :: " + index + "  ID :: " + response.getData().getId());
        Files.delete(Paths.get(filePath));
    }
    
}
