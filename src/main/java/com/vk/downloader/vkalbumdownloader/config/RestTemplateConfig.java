package com.vk.downloader.vkalbumdownloader.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfig {
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
