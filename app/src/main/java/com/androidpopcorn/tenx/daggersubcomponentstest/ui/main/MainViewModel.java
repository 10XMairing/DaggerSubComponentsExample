package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;

import android.util.Log;

import com.androidpopcorn.tenx.daggersubcomponentstest.BaseViewModel;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.model.PhotoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends BaseViewModel {

    private ApiService apiService;

    public MainViewModel(ApiService apiService) {
        super(apiService);
        this.apiService = apiService;
    }

    public void loadData(){
        apiService.getPhotos().enqueue(new Callback<List<PhotoResponse>>() {
            @Override
            public void onResponse(Call<List<PhotoResponse>> call, Response<List<PhotoResponse>> response) {
                Log.d("TEST", "onResponse: "+response);
            }

            @Override
            public void onFailure(Call<List<PhotoResponse>> call, Throwable t) {

            }
        });
    }



}
