package com.kimjiun.dagger2.practice;

import javax.inject.Inject;

public class PersonB {
    @Inject // 필드 주입
    String name;
    private int age;

    @Inject // 메소드 주입
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
