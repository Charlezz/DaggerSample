package com.charlezz.basic;

import dagger.Component;

@Component(modules = {AModule.class, BModule.class})
public interface MyComponent {
    //provision 메소드
    AA makeAA();

    //member-injection 메소드
    void inject(Main target);

}
