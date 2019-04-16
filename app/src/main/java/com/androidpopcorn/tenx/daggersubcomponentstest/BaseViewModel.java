package com.androidpopcorn.tenx.daggersubcomponentstest;

import android.arch.lifecycle.ViewModel;

import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;

public class BaseViewModel extends ViewModel {

    private final ApiService apiService;

    public BaseViewModel(ApiService apiService) {
        this.apiService = apiService;
    }

    public ApiService getApiService() {
        return apiService;
    }



}
