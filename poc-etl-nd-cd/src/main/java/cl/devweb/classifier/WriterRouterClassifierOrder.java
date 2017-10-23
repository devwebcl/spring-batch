package cl.devweb.classifier;

import org.springframework.batch.support.annotation.Classifier;

import cl.devweb.model.citydeal.OrderCD;


public class WriterRouterClassifierOrder {

    @Classifier
    public String classify(OrderCD classifiable) {
        return classifiable.getOperation();
    }


}

