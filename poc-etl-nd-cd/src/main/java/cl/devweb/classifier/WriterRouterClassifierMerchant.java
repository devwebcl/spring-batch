package cl.devweb.classifier;

import org.springframework.batch.support.annotation.Classifier;

import cl.devweb.model.citydeal.MerchantCD;

public class WriterRouterClassifierMerchant {
    
    @Classifier
   public String classify(MerchantCD classifiable) {
       return classifiable.getOperation();
   }
}
