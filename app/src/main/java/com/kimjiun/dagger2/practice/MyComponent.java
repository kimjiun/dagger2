package com.kimjiun.dagger2.practice;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
@UserScope
public interface MyComponent{
    //String getString(); // 프로비전 메소드, 바인드된 모듈로부터 의존성을 제공
    //Object getObject();

    void inject(MyClass myClass);

    //MembersInjector<MyClass> getInjector();

    /*
    @Component.Builder
    interface Builder{
        Builder myModule(MyModule mm);
        @BindsInstance
        Builder foo(Foo foo);
        MyComponent build();
    }

    @Component.Factory
    interface Factory{
        MyComponent newMyComponent(MyModule mm, @BindsInstance Foo foo);
    }
     */
}
