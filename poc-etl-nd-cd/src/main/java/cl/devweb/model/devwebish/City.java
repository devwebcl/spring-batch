package cl.devweb.model.devwebish;

import cl.devweb.model.devwebish.enums.CountryEnum;

public class City {

    private int id;
    private int countryId;
    private String name;
    private String slug;
    private float lat;
    private float lng;
    private CountryEnum country;

    public City(int countryId) {
        this.countryId = countryId;
        this.country = CountryEnum.getCountryEnumById(countryId);
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public CountryEnum getCountry() {
        return country;
    }

}
