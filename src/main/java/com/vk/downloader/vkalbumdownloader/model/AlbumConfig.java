package com.vk.downloader.vkalbumdownloader.model;

/**
 * AlbumConfig
 */
public class AlbumConfig {

    private String vkAlbumUrl;
    private String imgurAlbumTitle;
    private String imgurAlbumDescription;
    private Integer owner;
    private String albumId;


    public String getVkAlbumUrl() {
        return vkAlbumUrl;
    }
    public void setVkAlbumUrl(String vkAlbumUrl) {
        this.vkAlbumUrl = vkAlbumUrl;
    }
    public String getImgurAlbumTitle() {
        return imgurAlbumTitle;
    }
    public void setImgurAlbumTitle(String imgurAlbumTitle) {
        this.imgurAlbumTitle = imgurAlbumTitle;
    }
    public String getImgurAlbumDescription() {
        return imgurAlbumDescription;
    }
    public void setImgurAlbumDescription(String imgurAlbumDescription) {
        this.imgurAlbumDescription = imgurAlbumDescription;
    }
    public Integer getOwner() {
        return owner;
    }
    public void setOwner(Integer owner) {
        this.owner = owner;
    }
    public String getAlbumId() {
        return albumId;
    }
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    } 

    

    
}