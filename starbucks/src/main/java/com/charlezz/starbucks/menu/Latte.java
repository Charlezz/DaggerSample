package com.charlezz.starbucks.menu;

import javax.inject.Inject;

import com.charlezz.starbucks.Ingredient.Milk;

public class Latte implements Drink {
    private Espresso espresso;
    private Milk milk;

    @Inject
    public Latte(Espresso espresso, Milk milk) {
        this.espresso = espresso;
        this.milk = milk;
    }
}
