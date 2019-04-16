package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;


import android.app.Activity;

import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.PerActivity;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;


@PerActivity
@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);



    @Subcomponent.Builder
    interface Builder {
        MainComponent build();

        @BindsInstance
        Builder activity( Activity activity);

    }


}
