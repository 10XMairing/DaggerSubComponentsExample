package com.androidpopcorn.tenx.daggersubcomponentstest;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.ui.main.MainViewModel;

public class ViewModelFactory<V> implements ViewModelProvider.Factory {

    private V viewModel;
    private final ApiService apiService;

    public ViewModelFactory(V viewModel, ApiService apiService) {
        this.viewModel = viewModel;
        this.apiService = apiService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(viewModel.getClass())) {
            return (T) viewModel;
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
