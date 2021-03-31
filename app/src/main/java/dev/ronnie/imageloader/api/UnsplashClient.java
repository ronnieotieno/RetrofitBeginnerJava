package dev.ronnie.imageloader.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UnsplashClient {
    private static Retrofit retrofit = null;

    public static Retrofit getUnsplashClient() {
        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(chain -> {
                        Request newRequest = chain.request().newBuilder()
                                .addHeader("Authorization", "Client-ID " + Config.unsplash_access_key)
                                .build();
                        return chain.proceed(newRequest);
                    }).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(Config.BASE_URL_UNSPLASH)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}