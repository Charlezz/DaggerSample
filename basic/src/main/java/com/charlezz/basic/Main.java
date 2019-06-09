package com.charlezz.basic;

import javax.inject.Inject;

public class Main{ //필드에 주입하는 예제
    @Inject AA aa;
    @Inject BB bb;
    @Inject CC cc;

    public Main(){
        DaggerMyComponent.create().inject(this);
    }
}