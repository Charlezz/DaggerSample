package com.charlezz.starbucks.partner;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import com.charlezz.starbucks.menu.Drink;

public class Partner {
    @Inject
    @Named("partnerId")
    String partnerId;

    @Inject
    Map<Class<?>, Provider<Drink>> menuMap;

    @Inject
    public Partner(PartnerComponent.Builder builder){
        builder.partnerModule(new PartnerModule()).build().inject(this);
    }

    public <T extends Drink> T makeDrink(Class<T> t){
        return (T) menuMap.get(t).get();
    }

    public String getId(){
        return partnerId;
    }
}
