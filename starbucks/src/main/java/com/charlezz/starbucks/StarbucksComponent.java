package com.charlezz.starbucks;

import javax.inject.Singleton;

import com.charlezz.starbucks.Ingredient.IngredientModule;

import dagger.Component;
@Singleton
@Component(modules = {IngredientModule.class, StarbucksModule.class})
public interface StarbucksComponent {
    void inject(Starbucks starbucks);
}
