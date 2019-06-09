package com.charlezz.starbucks;

import java.util.Date;

import javax.inject.Singleton;

import com.charlezz.starbucks.partner.Partner;
import com.charlezz.starbucks.partner.PartnerComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = PartnerComponent.class)
public class StarbucksModule {

    @Provides
    Partner partner(PartnerComponent.Builder builder){
        return new Partner(builder);
    }

    @Singleton
    @Provides
    String provideName(){
        return "Charles's Stabucks";
    }

    @Singleton
    @Provides
    Date provideOpenDate(){
        return new Date();
    }

}
