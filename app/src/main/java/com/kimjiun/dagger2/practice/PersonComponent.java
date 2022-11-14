package com.kimjiun.dagger2.practice;

import dagger.Component;

@Component(modules = PersonModule.class)
public interface PersonComponent {
    PersonA getPerson();

    void inject(PersonB personB);
}
