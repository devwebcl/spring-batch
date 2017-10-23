package cl.devweb.classifier;

import org.springframework.batch.support.annotation.Classifier;

import cl.devweb.model.citydeal.DealCD;
import cl.devweb.model.citydeal.OrderCD;


public class WriterRouterClassifierDeal {

   @Classifier
   public String classify(DealCD classifiable) {
       return classifiable.getOperation();
   }


}

