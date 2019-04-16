package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;


import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;

import com.androidpopcorn.tenx.daggersubcomponentstest.ViewModelFactory;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.ActivityContext;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.PerActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainModule {




//    @Binds
//    @PerActivity
//    @ActivityContext
//    abstract Context bindContext(Activity activity);

    @Provides
    @PerActivity
    static ViewModelFactory provideVMFactory(ApiService apiService){
        return new ViewModelFactory<MainViewModel>(new MainViewModel(apiService),apiService);
    }


    @Provides
    @PerActivity
    static MainViewModel provideVM(ViewModelFactory factory, Activity activity){
        return ViewModelProviders.of((MainActivity) activity, factory).get(MainViewModel.class);
    }


}
