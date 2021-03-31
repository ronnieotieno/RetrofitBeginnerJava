package dev.ronnie.imageloader.api;

/**
 * created by Ronnie Otieno on 31-Mar-21.
 **/
public class ImagesReponse {

    String id;
    String color;
    String likes;
    String description;
    PictureUrl urls;

    public ImagesReponse(String id, String color, String likes, String description, PictureUrl urls) {
        this.id = id;
        this.color = color;
        this.likes = likes;
        this.description = description;
        this.urls = urls;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PictureUrl getUrls() {
        return urls;
    }

    public void setUrls(PictureUrl urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "ImagesReponse{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", likes='" + likes + '\'' +
                ", description='" + description + '\'' +
                ", urls=" + urls +
                '}';
    }
}
