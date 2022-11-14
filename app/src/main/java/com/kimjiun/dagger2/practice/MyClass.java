package com.kimjiun.dagger2.practice;

import javax.inject.Inject;
import javax.inject.Named;

public class MyClass {
    @Inject
    @Named("name")
    String nameStr;

    @Inject
    @Hello
    String helloStr;

    @Inject
    @Named("world")
    String worldStr;

    public String getHelloStr() {
        return helloStr;
    }

    public String getNameStr() {
        return nameStr;
    }

    public String getWorldStr() {
        return worldStr;
    }
}
