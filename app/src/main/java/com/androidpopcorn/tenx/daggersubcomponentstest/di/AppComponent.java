package com.androidpopcorn.tenx.daggersubcomponentstest.di;




import android.app.Application;

import com.androidpopcorn.tenx.daggersubcomponentstest.BaseApplication;
import com.androidpopcorn.tenx.daggersubcomponentstest.ui.main.MainComponent;
import com.androidpopcorn.tenx.daggersubcomponentstest.ui.main.MainModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BaseApplication baseApplication);

    MainComponent.Builder mainBuilder();

    @Component.Builder
    interface Builder {
        AppComponent build();



        @BindsInstance
        Builder application(Application application);


    }

}
