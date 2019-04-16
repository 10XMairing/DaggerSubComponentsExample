package com.androidpopcorn.tenx.daggersubcomponentstest.ui.main;


import android.app.Activity;
import android.content.Context;

import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.ActivityContext;
import com.androidpopcorn.tenx.daggersubcomponentstest.di.scopes.PerActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {




    @Binds
    @PerActivity
    @ActivityContext
    abstract Context bindContext(Activity activity);


}
