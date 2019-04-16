package com.androidpopcorn.tenx.daggersubcomponentstest.di;


import android.app.Application;
import android.content.Context;

import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.ApplicationContext;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {


    @Binds
    @Singleton
    @ApplicationContext
    abstract Context provideContext(Application application);


//    @Binds
//    @Singleton
//    abstract Application provideApplication(Application application);

    @Provides
    @Singleton
    static ApiService provideApiService(@ApplicationContext Context context){
        return new ApiService(context);
    }
}
