package com.kimjiun.dagger2.practice;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    @Provides
    String provideName(){
        return "JIUN";
    }

    @Provides
    int provideAge(){
        return 100;
    }
}
