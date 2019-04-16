package com.androidpopcorn.tenx.daggersubcomponentstest;

import android.app.Application;
import android.util.Log;

import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.AppComponent;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.DaggerAppComponent;

import javax.inject.Inject;

public class BaseApplication extends Application {

    private AppComponent appComponent;


    @Inject
    ApiService apiService;




    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);


        if(apiService == null){
            Log.d("TEST", "onCreate: NULL");;
        }else {
            Log.d("TEST", "onCreate: not null ");
        }



    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
