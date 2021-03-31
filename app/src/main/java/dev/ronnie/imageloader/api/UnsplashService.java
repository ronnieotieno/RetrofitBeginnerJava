package dev.ronnie.imageloader.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * created by Ronnie Otieno on 31-Mar-21.
 **/
public interface UnsplashService {

    @GET("photos?per_page=25")
    Call<List<ImagesReponse>> getImages();
}
