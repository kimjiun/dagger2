package com.kimjiun.dagger2;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = MainActivityComponent.class)
public class AppModule {
    @Provides
    @Singleton
    SharedPreferences provideSharedPref(App app){
        return app.getSharedPreferences("default", Context.MODE_PRIVATE);
    }
}
