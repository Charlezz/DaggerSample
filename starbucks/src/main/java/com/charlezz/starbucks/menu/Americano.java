package com.charlezz.starbucks.menu;

import javax.inject.Inject;

import com.charlezz.starbucks.Ingredient.Water;

public class Americano implements Drink {

    private Espresso espresso;
    private Water water;

    @Inject
    public Americano(Espresso espresso, Water water) {
        this.espresso = espresso;
        this.water = water;
    }

}
