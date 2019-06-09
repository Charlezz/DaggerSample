package com.charlezz.starbucks.menu;

import javax.inject.Inject;

import com.charlezz.starbucks.Ingredient.CoffeeBean;
import com.charlezz.starbucks.Ingredient.Water;

public class Espresso implements Drink {
    private Water water;
    private CoffeeBean coffeeBean;

    @Inject
    public Espresso(Water water, CoffeeBean coffeeBean) {
        this.water = water;
        this.coffeeBean = coffeeBean;
    }
}
