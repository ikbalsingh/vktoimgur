package com.vk.downloader.vkalbumdownloader.config;

import java.util.Arrays;

import com.vk.downloader.vkalbumdownloader.client.ImgurClient;
import com.vk.downloader.vkalbumdownloader.client.ImgurClientImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ImgurClientFactory {
    @Bean
    public ImgurClient imgurClient() {
        return new ImgurClientImpl(Arrays.asList("IMGUR_CLIENT_SECRET"));
    }
}
