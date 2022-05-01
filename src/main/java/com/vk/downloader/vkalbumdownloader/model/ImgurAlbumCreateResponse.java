package com.vk.downloader.vkalbumdownloader.model;

public class ImgurAlbumCreateResponse {
    private Integer status;
    private Boolean success;
    private ImgurAlbumCreateData data;

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public ImgurAlbumCreateData getData() {
        return data;
    }
    public void setData(ImgurAlbumCreateData data) {
        this.data = data;
    } 
    

}
