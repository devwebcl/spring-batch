package cl.devweb.processor.location;

        import com.google.common.base.Preconditions;

import cl.devweb.model.decorator.CityDecorator;
import cl.devweb.model.decorator.builder.CityDecoratorBuilder;
import cl.devweb.model.devwebish.Location;

import org.springframework.batch.item.ItemProcessor;


public class CityProcessor implements ItemProcessor<Location, CityDecorator> {

    @Override
    public CityDecorator process(Location location) throws Exception {
        Preconditions.checkNotNull(location);
        Preconditions.checkNotNull(location.getCity());
        return CityDecoratorBuilder.create(location).build();
    }

}

