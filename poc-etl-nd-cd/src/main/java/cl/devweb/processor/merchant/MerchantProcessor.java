package cl.devweb.processor.merchant;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.citydeal.DealMerchant;
import cl.devweb.model.citydeal.DealMerchantRedemptionLocation;
import cl.devweb.model.citydeal.MerchantCD;
import cl.devweb.model.devwebish.MerchantND;
import cl.devweb.model.devwebish.enums.CountryEnum;

import java.util.Date;
import org.springframework.batch.item.ItemProcessor;

public class MerchantProcessor implements ItemProcessor<MerchantND, MerchantCD> {

    //save last payment_id to check 1:n relationship
    private long last_merchant_id = -1;
    
    @Override
    public MerchantCD process(MerchantND merchant) throws Exception {
        MerchantCD merchantCD = new MerchantCD();
        
        DealMerchant dm = new DealMerchant();
        DealMerchantRedemptionLocation dmrl = new DealMerchantRedemptionLocation();
        
        Date created = merchant.getCompany().getCreated() != null ? merchant.getCompany().getCreated() : new Date();
        Date modified = merchant.getCompany().getModified() != null ? merchant.getCompany().getModified() : created;
                
        if (last_merchant_id != merchant.getCompany().getId()) {
            merchantCD.setOperation("1");
            
            CountryEnum countryEnum = CountryEnum.getCountryEnumById((int) merchant.getDeal().getCountry_id());
            
            dm.setDm_merchant_company_name(merchant.getCompany().getName());
            dm.setDm_merchant_homepage(merchant.getCompany().getWebsite());
            dm.setDm_merchant_logo(merchant.getCompany().getLogo_url());
            dm.setDm_merchant_opening_hours(merchant.getCompany().getDescription());
            
            dm.setDm_appdomain_id(countryEnum.getCdAppDomainId().shortValue());
            dm.setDm_guid(Generators.randomBasedGenerator().generate());
            //FA: status val is 0: active or 99: deleted
            dm.setDm_status((short) 0);
            dm.setDm_mulligan_enabled(Boolean.TRUE);
            
            dm.setDm_created(created);
            dm.setDm_last_modified(modified);
            
            dmrl.setDmrl_address(merchant.getDealAddress().getAddress());
            dmrl.setDmrl_latitude(merchant.getDealAddress().getLat());
            dmrl.setDmrl_longitude(merchant.getDealAddress().getLng());
            //FA: status val is 0: active or 99: deleted
            dmrl.setDmrl_status(0);
            dmrl.setDmrl_guid(Generators.randomBasedGenerator().generate());
            
            dmrl.setDmrl_created(created);
            dmrl.setDmrl_last_modified(modified);
        } else {
            merchantCD.setOperation("2");
            dmrl.setDmrl_address(merchant.getDealAddress().getAddress());
            dmrl.setDmrl_latitude(merchant.getDealAddress().getLat());
            dmrl.setDmrl_longitude(merchant.getDealAddress().getLng());
            //FA: status val is 0: active or 99: deleted
            dmrl.setDmrl_status(0);
            dmrl.setDmrl_guid(Generators.randomBasedGenerator().generate());
            dmrl.setDmrl_created(created);
            dmrl.setDmrl_last_modified(modified);
        }
        
        last_merchant_id = merchant.getCompany().getId();
        
        merchantCD.setN_company_id(merchant.getCompany().getId());
        merchantCD.setDm(dm);
        merchantCD.setDmrl(dmrl);
                
        return merchantCD;
    }
}
