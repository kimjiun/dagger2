package com.kimjiun.dagger2.practice;

import dagger.Module;
import dagger.Provides;

@Module(includes = MyModule.class)
public class ModuleB {
    @Provides
    Double provideDouble(){
        return 0.0;
    }
}
