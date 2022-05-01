package com.vk.downloader.vkalbumdownloader.service;

import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.UserAuthResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private static final Integer APP_ID = 0; // VK_APP_ID
    private static final String CLIENT_SECRET = "VK_CLIENT_SECRET";
    private static final String REDIRECT_URI = "VK_REDIRECT_URI";
    @Autowired
    private VkApiClient vk;

    public UserActor authenticate (){
        String code = "VK_CODE";
        UserAuthResponse authResponse = new UserAuthResponse();
        try {
            authResponse = vk.oAuth().userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code).execute();
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
        System.out.println(actor.getAccessToken());
        return actor;
    }
}