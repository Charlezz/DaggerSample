package com.charlezz.basic;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {
    @Provides
    String provideName(){
        return "Charles";
    }
}