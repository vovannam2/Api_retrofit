package com.example.retrofit_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
        @GET("categories.php")
        Call<List<Category>> getCategoryAll();
}
