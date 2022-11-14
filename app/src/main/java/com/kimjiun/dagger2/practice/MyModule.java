package com.kimjiun.dagger2.practice;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
    @Provides
    @Named("name")
    String provideName(){
        return "JIUN";
    }

    @Provides
    @Named("world")
    String provideWorld(){return "World";}

    @Provides
    @Hello
    String provideHello(){return "Hello";}

    @Provides
    int provideAge(){
        return 100;
    }

    @Provides
    Person providePerson(String name, int age){
        return new Person(name, age);
    }

    // 싱글톤 스코프
    @Provides
    @Singleton // @Reusable
    Object provideObject(){return new Object();}

    // 커스텀 스코프
    @Provides
    @UserScope
    Object provideUserObject(){return new Object();}
}