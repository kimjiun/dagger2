package com.kimjiun.dagger2;

import dagger.BindsInstance;
import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentComponent {
    void inject(MainFragment fragment);

    @Subcomponent.Builder
    interface Builder{
        MainFragmentComponent.Builder setMoudle(MainFragmentModule module);
        @BindsInstance
        MainFragmentComponent.Builder setFragment(MainFragment fragment);
        MainFragmentComponent build();
    }
}
