package com.vk.downloader.vkalbumdownloader.client;

import java.nio.file.Path;
import java.util.List;
import java.util.Random;

import com.vk.downloader.vkalbumdownloader.model.ImgurAlbumCreateResponse;
import com.vk.downloader.vkalbumdownloader.model.ImgurImageUploadResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class ImgurClientImpl implements ImgurClient {

    private List<String> clientIdList;
    private final String IMGUR_BASE_URL = "https://api.imgur.com/3";
    private final String IMAGE_UPLOAD_URL = "/upload";
    private final String ALBUM_CREATE_URL = "/album";

    
    @Autowired
    private RestTemplate restTemplate;

    public ImgurClientImpl(List<String> clientIdList){
        this.clientIdList = clientIdList;
    }

    private String getRandomClientId() {
        Random rand = new Random();
        return clientIdList.get(rand.nextInt(clientIdList.size()));
    }

    @Override
    public ImgurImageUploadResponse upload(Path filePath, String albumDeleteHash) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.set("Authorization", "Client-ID " + getRandomClientId());
        MultiValueMap<String, Object> body= new LinkedMultiValueMap<>();
        body.add("image", new FileSystemResource(filePath));
        body.add("album", albumDeleteHash);

        HttpEntity<MultiValueMap<String, Object>> requestEntity  = new HttpEntity<>(body, headers);
        
        ResponseEntity<ImgurImageUploadResponse> response = restTemplate.postForEntity(IMGUR_BASE_URL + IMAGE_UPLOAD_URL, requestEntity, ImgurImageUploadResponse.class);
        return response.getBody();
    }

    @Override
    public ImgurAlbumCreateResponse createAlbum(String title, String description) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        headers.set("Authorization", "Client-ID " + getRandomClientId());
        MultiValueMap<String, Object> body= new LinkedMultiValueMap<>();
        body.add("title", title);
        body.add("description", description);
        body.add("cover", "Sample_cover_id");
        HttpEntity<MultiValueMap<String, Object>> requestEntity  = new HttpEntity<>(body, headers);

        ResponseEntity<ImgurAlbumCreateResponse> response = 
        restTemplate.postForEntity(IMGUR_BASE_URL + ALBUM_CREATE_URL, requestEntity, ImgurAlbumCreateResponse.class);
        return response.getBody();   
     }
    
}
