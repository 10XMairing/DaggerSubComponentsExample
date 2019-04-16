package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;

import com.androidpopcorn.tenx.daggersubcomponentstest.BaseViewModel;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;

public class MainViewModel extends BaseViewModel {

    public MainViewModel(ApiService apiService) {
        super(apiService);
    }


}
