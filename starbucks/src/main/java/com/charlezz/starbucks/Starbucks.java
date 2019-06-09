package com.charlezz.starbucks;

import javax.inject.Inject;
import javax.inject.Provider;

import com.charlezz.starbucks.logger.Logger;
import com.charlezz.starbucks.menu.Americano;
import com.charlezz.starbucks.partner.Partner;

public class Starbucks {

    public static final String TAG = Starbucks.class.getSimpleName();

    @Inject
    Provider<Partner> partnerProvider;

    public Starbucks(Logger logger) {
        System.out.println("스타벅스 Grand Opening");
        StarbucksComponent starbucksComponent = DaggerStarbucksComponent.create();
        starbucksComponent.inject(this);

        Partner partner1 = partnerProvider.get();
        Partner partner2 = partnerProvider.get();

        logger.e(TAG, "partner1:"+partner1.getId());
        logger.e(TAG, "partner2:"+partner2.getId());

        for(int i=0;i<10;i++){
            Americano americano = partner1.makeDrink(Americano.class);
            logger.e(TAG, "아메리카노:"+americano);
        }


    }

}
