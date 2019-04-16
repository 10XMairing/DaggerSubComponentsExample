package com.androidpopcorn.tenx.daggersubcomponentstest.di;




import android.app.Application;

import com.androidpopcorn.tenx.daggersubcomponentstest.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BaseApplication baseApplication);

    @Component.Builder
    interface Builder {
        AppComponent build();

        @BindsInstance
        Builder application(Application application);


    }

}
