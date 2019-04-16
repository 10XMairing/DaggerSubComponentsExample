package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidpopcorn.tenx.daggersubcomponentstest.BaseApplication;
import com.androidpopcorn.tenx.daggersubcomponentstest.R;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BaseApplication) getApplication()).getAppComponent().mainBuilder().activity(this).build().inject(this);


        if(apiService == null){
            Log.d("TEST", "onCreate: main: null");
        }else {
            Log.d("TEST", "onCreate: main: NOT null");
        }

    }
}
