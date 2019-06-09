package com.charlezz.basic;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {
    @Provides
    AA provideAA(){ //AA 오브젝트를 컴포넌트에게 제공
        return new AA();
    }

    @Provides
    BB provideBB(AA aa){ //위에서 제공하는 AA를 컴포넌트로 부터 인자로 전달받아 BB를 제공
        return new BB(aa);
    }
}