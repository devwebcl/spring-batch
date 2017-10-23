package cl.devweb.model.decorator;


import cl.devweb.model.citydeal.ParticipantCities;
import cl.devweb.model.devwebish.CityPivot;

public class CityDecorator {
    private CityPivot cityPivot;
    private ParticipantCities participantCities;

    public CityDecorator() {

    }

    public CityPivot getCityPivot() {
        return cityPivot;
    }

    public void setCityPivot(CityPivot cityPivot) {
        this.cityPivot = cityPivot;
    }

    public ParticipantCities getParticipantCities() {
        return participantCities;
    }

    public void setParticipantCities(ParticipantCities participantCities) {
        this.participantCities = participantCities;
    }
}
