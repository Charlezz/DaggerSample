package com.charlezz.starbucks.Ingredient;

import dagger.Module;
import dagger.Provides;

@Module
public class IngredientModule {
    @Provides
    CoffeeBean provideCoffeeBean(){
        return new CoffeeBean();
    }

    @Provides
    Water provideWater(){
        return new Water();
    }

    @Provides
    Milk provideMilk(){
        return new Milk();
    }
}
