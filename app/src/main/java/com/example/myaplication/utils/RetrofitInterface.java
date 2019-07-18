package com.example.myaplication.utils;

import com.example.myaplication.model.MutipleArticles;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {
    @GET("/api/articles")
    Call<MutipleArticles> getArticles();


}
