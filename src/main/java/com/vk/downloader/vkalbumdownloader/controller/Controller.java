package com.vk.downloader.vkalbumdownloader.controller;

import java.util.List;

import com.vk.downloader.vkalbumdownloader.service.DownloadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private DownloadService service;

    @GetMapping("/imgur/upload")
    public List<String> downloadAlbums(){
        return service.downloadAlbums();
    }
}
