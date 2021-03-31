package dev.ronnie.imageloader;

/**
 * created by Ronnie Otieno on 31-Mar-21.
 **/
public class Image {
    String id;
    String color;
    String likes;
    String description;
    String imageUrl;

    public Image(String id, String color, String likes, String description, String imageUrl) {
        this.id = id;
        this.color = color;
        this.likes = likes;
        this.description = description;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", likes='" + likes + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
