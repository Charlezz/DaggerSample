package com.charlezz.starbucks.partner;

import java.util.UUID;

import javax.inject.Named;

import com.charlezz.starbucks.Ingredient.Milk;
import com.charlezz.starbucks.Ingredient.Water;
import com.charlezz.starbucks.menu.Americano;
import com.charlezz.starbucks.menu.Drink;
import com.charlezz.starbucks.menu.Espresso;
import com.charlezz.starbucks.menu.Latte;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public class PartnerModule {

    @Provides
    @PartnerScope
    @Named("partnerId")
    String providePartnerId() {
        return UUID.randomUUID().toString();
    }

    @Provides
    @IntoMap
    @ClassKey(Americano.class)
    Drink provideAmericano(Espresso espresso, Water water) {
        return new Americano(espresso, water);
    }

    @Provides
    @IntoMap
    @ClassKey(Espresso.class)
    Drink provideEspresso(Espresso espresso){
        return espresso;
    }

    @Provides
    @IntoMap
    @ClassKey(Latte.class)
    Drink providelatte(Espresso espresso, Milk milk) {
        return new Latte(espresso, milk);
    }

}
