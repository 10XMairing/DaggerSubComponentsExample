package com.androidpopcorn.tenx.daggersubcomponentstest.di;


import android.app.Application;
import android.content.Context;

import com.androidpopcorn.tenx.daggersubcomponentstest.ViewModelFactory;
import com.androidpopcorn.tenx.daggersubcomponentstest.data.ApiService;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.ApplicationContext;
import com.androidpopcorn.tenx.daggersubcomponentstest.ui.main.MainComponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(subcomponents = MainComponent.class)
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
    static ApiService provideApiService(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addNetworkInterceptor(new HttpLoggingInterceptor());

        Retrofit retrofit = new Retrofit.Builder()
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ApiService.BASE_URL).build();

                return retrofit.create(ApiService.class);
    }


}
