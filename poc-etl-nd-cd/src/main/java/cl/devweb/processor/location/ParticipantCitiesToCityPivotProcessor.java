package cl.devweb.processor.location;

import org.springframework.batch.item.ItemProcessor;

import cl.devweb.model.citydeal.ParticipantCities;
import cl.devweb.model.devwebish.CityPivot;

public class ParticipantCitiesToCityPivotProcessor implements ItemProcessor<ParticipantCities, CityPivot> {

    @Override
    public CityPivot process(ParticipantCities participantCities) throws Exception {
        CityPivot cityPivot = new CityPivot();
        cityPivot.setCd_city_id(participantCities.getPtc_id());
        cityPivot.setCd_city_uuid(participantCities.getPtc_guid().toString());
        return cityPivot;
    }
}
