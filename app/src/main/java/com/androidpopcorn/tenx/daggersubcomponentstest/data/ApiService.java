package com.androidpopcorn.tenx.daggersubcomponentstest.data;

import android.content.Context;

import com.androidpopcorn.tenx.daggersubcomponentstest.data.model.PhotoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    String BASE_URL = "https://picsum.photos/";


    @GET("/list")
    Call<List<PhotoResponse>> getPhotos();



}
