package com.example.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myaplication.model.Articles;
import com.example.myaplication.model.MutipleArticles;
import com.example.myaplication.utils.NetworkHelper;
import com.squareup.picasso.Picasso;

import java.net.NetworkInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ImageView imageView = findViewById(R.id.imgView);
        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHPHV0j5HE7nNGbRAmkdPqwLC8tVaQ5rp48ZgIQDa5yH6Qhm8")
                .into(imageView);*/


        NetworkHelper.getInstance()
                .getArticles().enqueue(new Callback<MutipleArticles>() {

            @Override
            public void onResponse(Call<MutipleArticles> call, Response<MutipleArticles> response) {
                if(response.isSuccessful()){
                    MutipleArticles mutipleArticles = response.body();
                    Toast.makeText(getApplicationContext(), ""+mutipleArticles.getArticlesCount(),Toast.LENGTH_SHORT).show();

                    final MyAdapter adapter = new MyAdapter(mutipleArticles.getArticles());
                    ListView listView = findViewById(R.id.listView);
                    listView.setAdapter(adapter);

                }else{
                    Toast.makeText(MainActivity.this, ""+response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MutipleArticles> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
