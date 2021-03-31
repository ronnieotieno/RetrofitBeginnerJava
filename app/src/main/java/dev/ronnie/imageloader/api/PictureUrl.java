package dev.ronnie.imageloader.api;

/**
 * created by Ronnie Otieno on 31-Mar-21.
 **/
public class PictureUrl {

    String regular;

    public PictureUrl(String regular) {
        this.regular = regular;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "PictureUrl{" +
                "regular='" + regular + '\'' +
                '}';
    }
}
