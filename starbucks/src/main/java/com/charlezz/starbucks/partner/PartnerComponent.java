package com.charlezz.starbucks.partner;

import dagger.Subcomponent;

@PartnerScope
@Subcomponent(modules = PartnerModule.class)
public interface PartnerComponent {
    @Subcomponent.Builder
    interface Builder{
        Builder partnerModule(PartnerModule module);
        PartnerComponent build();
    }
    void inject(Partner partner);
}
