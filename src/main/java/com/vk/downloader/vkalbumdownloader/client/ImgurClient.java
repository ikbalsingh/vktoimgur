package com.vk.downloader.vkalbumdownloader.client;

import java.nio.file.Path;

import com.vk.downloader.vkalbumdownloader.model.ImgurAlbumCreateResponse;
import com.vk.downloader.vkalbumdownloader.model.ImgurImageUploadResponse;

public interface ImgurClient {
    ImgurImageUploadResponse upload(Path filePath, String albumDeleteHash);
    ImgurAlbumCreateResponse createAlbum(String title, String description);
}
