package dev.ronnie.imageloader;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import dev.ronnie.imageloader.api.ImagesReponse;
import dev.ronnie.imageloader.api.UnsplashClient;
import dev.ronnie.imageloader.api.UnsplashService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We need to call this method to get data from api
        //For now dont worry about it. with time utaelewa.
        getDataFromApi();


    }

    //Write your recyclerview code here, first add recyclerview to the layout and create adapter
    //Make sure you load the image using piccaso
    private void setAdapter(List<Image> images) {

    }

    private void getDataFromApi() {
        UnsplashService unsplashService = UnsplashClient.getUnsplashClient().create(UnsplashService.class);

        unsplashService.getImages().enqueue(new Callback<List<ImagesReponse>>() {
            @Override
            public void onResponse(Call<List<ImagesReponse>> call, Response<List<ImagesReponse>> response) {
                if (response.isSuccessful()) {

                    List<ImagesReponse> imagesReponses = response.body();
                    List<Image> images = new ArrayList<>();
                    for (ImagesReponse imagesReponse : imagesReponses) {
                        Image image = new Image(imagesReponse.getId(), imagesReponse.getColor(), imagesReponse.getLikes(), imagesReponse.getDescription(), imagesReponse.getUrls().getRegular());
                        images.add(image);
                    }
                    setAdapter(images);
                    Log.d("MainActivity", response.body().toString());
                    Toast.makeText(MainActivity.this, String.valueOf(response.body().size()), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, String.valueOf(response.code()), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ImagesReponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}