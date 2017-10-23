package cl.devweb.processor.location;

import org.springframework.batch.item.ItemProcessor;

import cl.devweb.model.decorator.CityDecorator;
import cl.devweb.model.devwebish.CityPivot;

public class CityPivotToCityPivotProcessor implements ItemProcessor<CityPivot, CityDecorator> {

    @Override
    public CityDecorator process(CityPivot cityPivot) throws Exception {
        CityDecorator cityDecorator = new CityDecorator();
        cityDecorator.setCityPivot(cityPivot);
        return cityDecorator;
    }
}
