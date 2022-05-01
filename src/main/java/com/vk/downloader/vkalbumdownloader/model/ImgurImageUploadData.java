package com.vk.downloader.vkalbumdownloader.model;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "deletehash",
        "account_id",
        "account_url",
        "ad_type",
        "ad_url",
        "title",
        "description",
        "name",
        "type",
        "width",
        "height",
        "size",
        "views",
        "section",
        "vote",
        "bandwidth",
        "animated",
        "favorite",
        "in_gallery",
        "in_most_viral",
        "has_sound",
        "is_ad",
        "nsfw",
        "link",
        "tags",
        "datetime",
        "mp4",
        "hls"
})
@Generated("jsonschema2pojo")
public class ImgurImageUploadData {

    @JsonProperty("id")
    private String id;
    @JsonProperty("deletehash")
    private String deletehash;
    @JsonProperty("account_id")
    private Object accountId;
    @JsonProperty("account_url")
    private Object accountUrl;
    @JsonProperty("ad_type")
    private Object adType;
    @JsonProperty("ad_url")
    private Object adUrl;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("section")
    private Object section;
    @JsonProperty("vote")
    private Object vote;
    @JsonProperty("bandwidth")
    private Integer bandwidth;
    @JsonProperty("animated")
    private Boolean animated;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("in_gallery")
    private Boolean inGallery;
    @JsonProperty("in_most_viral")
    private Boolean inMostViral;
    @JsonProperty("has_sound")
    private Boolean hasSound;
    @JsonProperty("is_ad")
    private Boolean isAd;
    @JsonProperty("nsfw")
    private Object nsfw;
    @JsonProperty("link")
    private String link;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("datetime")
    private Integer datetime;
    @JsonProperty("mp4")
    private String mp4;
    @JsonProperty("hls")
    private String hls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("deletehash")
    public String getDeletehash() {
        return deletehash;
    }

    @JsonProperty("deletehash")
    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    @JsonProperty("account_id")
    public Object getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Object accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("account_url")
    public Object getAccountUrl() {
        return accountUrl;
    }

    @JsonProperty("account_url")
    public void setAccountUrl(Object accountUrl) {
        this.accountUrl = accountUrl;
    }

    @JsonProperty("ad_type")
    public Object getAdType() {
        return adType;
    }

    @JsonProperty("ad_type")
    public void setAdType(Object adType) {
        this.adType = adType;
    }

    @JsonProperty("ad_url")
    public Object getAdUrl() {
        return adUrl;
    }

    @JsonProperty("ad_url")
    public void setAdUrl(Object adUrl) {
        this.adUrl = adUrl;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("section")
    public Object getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(Object section) {
        this.section = section;
    }

    @JsonProperty("vote")
    public Object getVote() {
        return vote;
    }

    @JsonProperty("vote")
    public void setVote(Object vote) {
        this.vote = vote;
    }

    @JsonProperty("bandwidth")
    public Integer getBandwidth() {
        return bandwidth;
    }

    @JsonProperty("bandwidth")
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    @JsonProperty("animated")
    public Boolean getAnimated() {
        return animated;
    }

    @JsonProperty("animated")
    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    @JsonProperty("favorite")
    public Boolean getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("in_gallery")
    public Boolean getInGallery() {
        return inGallery;
    }

    @JsonProperty("in_gallery")
    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    @JsonProperty("in_most_viral")
    public Boolean getInMostViral() {
        return inMostViral;
    }

    @JsonProperty("in_most_viral")
    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    @JsonProperty("has_sound")
    public Boolean getHasSound() {
        return hasSound;
    }

    @JsonProperty("has_sound")
    public void setHasSound(Boolean hasSound) {
        this.hasSound = hasSound;
    }

    @JsonProperty("is_ad")
    public Boolean getIsAd() {
        return isAd;
    }

    @JsonProperty("is_ad")
    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    @JsonProperty("nsfw")
    public Object getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("datetime")
    public Integer getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("mp4")
    public String getMp4() {
        return mp4;
    }

    @JsonProperty("mp4")
    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    @JsonProperty("hls")
    public String getHls() {
        return hls;
    }

    @JsonProperty("hls")
    public void setHls(String hls) {
        this.hls = hls;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImgurImageUploadData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("deletehash");
        sb.append('=');
        sb.append(((this.deletehash == null) ? "<null>" : this.deletehash));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null) ? "<null>" : this.accountId));
        sb.append(',');
        sb.append("accountUrl");
        sb.append('=');
        sb.append(((this.accountUrl == null) ? "<null>" : this.accountUrl));
        sb.append(',');
        sb.append("adType");
        sb.append('=');
        sb.append(((this.adType == null) ? "<null>" : this.adType));
        sb.append(',');
        sb.append("adUrl");
        sb.append('=');
        sb.append(((this.adUrl == null) ? "<null>" : this.adUrl));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null) ? "<null>" : this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(((this.views == null) ? "<null>" : this.views));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null) ? "<null>" : this.section));
        sb.append(',');
        sb.append("vote");
        sb.append('=');
        sb.append(((this.vote == null) ? "<null>" : this.vote));
        sb.append(',');
        sb.append("bandwidth");
        sb.append('=');
        sb.append(((this.bandwidth == null) ? "<null>" : this.bandwidth));
        sb.append(',');
        sb.append("animated");
        sb.append('=');
        sb.append(((this.animated == null) ? "<null>" : this.animated));
        sb.append(',');
        sb.append("favorite");
        sb.append('=');
        sb.append(((this.favorite == null) ? "<null>" : this.favorite));
        sb.append(',');
        sb.append("inGallery");
        sb.append('=');
        sb.append(((this.inGallery == null) ? "<null>" : this.inGallery));
        sb.append(',');
        sb.append("inMostViral");
        sb.append('=');
        sb.append(((this.inMostViral == null) ? "<null>" : this.inMostViral));
        sb.append(',');
        sb.append("hasSound");
        sb.append('=');
        sb.append(((this.hasSound == null) ? "<null>" : this.hasSound));
        sb.append(',');
        sb.append("isAd");
        sb.append('=');
        sb.append(((this.isAd == null) ? "<null>" : this.isAd));
        sb.append(',');
        sb.append("nsfw");
        sb.append('=');
        sb.append(((this.nsfw == null) ? "<null>" : this.nsfw));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null) ? "<null>" : this.link));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("datetime");
        sb.append('=');
        sb.append(((this.datetime == null) ? "<null>" : this.datetime));
        sb.append(',');
        sb.append("mp4");
        sb.append('=');
        sb.append(((this.mp4 == null) ? "<null>" : this.mp4));
        sb.append(',');
        sb.append("hls");
        sb.append('=');
        sb.append(((this.hls == null) ? "<null>" : this.hls));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
