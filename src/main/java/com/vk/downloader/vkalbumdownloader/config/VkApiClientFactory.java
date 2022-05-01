package com.vk.downloader.vkalbumdownloader.config;

import com.google.gson.Gson;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class VkApiClientFactory {
    @Bean
    public VkApiClient getClient(){
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient, new Gson(), 2);
        return vk;
    }
}
