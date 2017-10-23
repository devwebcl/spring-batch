package cl.devweb.model.decorator.builder;

import java.util.UUID;

import cl.devweb.model.citydeal.ParticipantCities;
import cl.devweb.model.decorator.CityDecorator;
import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.model.devwebish.Location;
import cl.devweb.model.devwebish.enums.CountryEnum;

public class CityDecoratorBuilder {

    private CityDecorator cityDecorator;

    private CityDecoratorBuilder() {
        this.cityDecorator = new CityDecorator();
    }

    public static CityDecoratorBuilder create(Location location) {
        CityDecoratorBuilder cityDecoratorBuilder = new CityDecoratorBuilder();
        cityDecoratorBuilder.cityDecorator.setCityPivot(
                getCityPivot(location)
        );
        cityDecoratorBuilder.cityDecorator.setParticipantCities(
                getParticipantCities(
                        cityDecoratorBuilder.cityDecorator.getCityPivot()
                )
        );
        return cityDecoratorBuilder;
    }

    private static ParticipantCities getParticipantCities(CityPivot cityPivot) {
        return new ParticipantCities(
                CountryEnum.getCountryEnumById(cityPivot.getN_country_id()),
                cityPivot.getN_name(),
                cityPivot.getN_slug(),
                cityPivot.getN_latitude(),
                cityPivot.getN_longitude(),
                UUID.fromString(cityPivot.getCd_city_uuid())
        );
    }

    private static CityPivot getCityPivot(Location location) {
        CityPivot cityPivot;
        if (location.getId() != 0) {
            cityPivot = new CityPivot(
                    location.getCity().getId(),
                    location.getId(),
                    location.getLat(),
                    location.getLng(),
                    String.format("%s-%s",location.getCity().getSlug(), location.getSlug()),
                    String.format("%s, %s",location.getName(), location.getCity().getName()),
                    location.getCity().getCountry()
            );
        } else {
            cityPivot = new CityPivot(
                    location.getCity().getId(),
                    location.getId(),
                    location.getCity().getLat(),
                    location.getCity().getLng(),
                    location.getCity().getSlug(),
                    location.getCity().getName(),
                    location.getCity().getCountry()
            );
        }

        return cityPivot;
    }

    public CityDecorator build() {
        return this.cityDecorator;
    }

}
