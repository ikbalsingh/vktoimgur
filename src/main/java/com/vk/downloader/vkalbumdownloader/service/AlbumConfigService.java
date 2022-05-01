package com.vk.downloader.vkalbumdownloader.service;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.vk.downloader.vkalbumdownloader.model.AlbumConfig;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class AlbumConfigService {

    public List<AlbumConfig> getAlbumConfigs() {

        ObjectMapper objectMapper = new ObjectMapper();
        List<AlbumConfig> albumConfigs = new ArrayList<>();

        try {
            File file = new ClassPathResource("/album-config.json").getFile();
            InputStream is = new FileInputStream(file);
            albumConfigs = objectMapper.readValue(is, new TypeReference<List<AlbumConfig>>() {
            });
            albumConfigs.forEach(albumConfig -> {
                try {
                    URL vkAlbumUrl = new URL(albumConfig.getVkAlbumUrl());
                    String[] ownerAndAlbumId = vkAlbumUrl.getPath().replace("/album", "").split("_");
                    albumConfig.setOwner(Integer.parseInt(ownerAndAlbumId[0]));
                    albumConfig.setAlbumId(ownerAndAlbumId[1]);
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return albumConfigs;
    }
}
