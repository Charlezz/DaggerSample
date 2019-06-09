package com.charlezz.basic;

import javax.inject.Inject;

public class CC {
    AA aa;
    BB bb;
    @Inject
    public CC(AA aa, BB bb){//생성자에 주입하는 예제
        this.aa = aa;
        this.bb = bb;
    }
}