package cl.devweb.model.devwebish;

import com.fasterxml.uuid.Generators;

import cl.devweb.model.devwebish.enums.CountryEnum;

public class CityPivot {

    private int id;
    private int n_city_id;
    private int n_location_id;
    private float n_latitude;
    private float n_longitude;
    private String n_slug;
    private String n_name;
    private int n_country_id;
    private int cd_appdomain_id;
    private Integer cd_city_id;
    private String cd_city_uuid;
    private CountryEnum countryEnum;

    public CityPivot() {
    }

    public CityPivot(CountryEnum countryEnum) {
        this.n_country_id = countryEnum.getId();
        this.cd_appdomain_id = countryEnum.getCdAppDomainId();
        this.countryEnum = countryEnum;
    }

    public CityPivot(int n_city_id, int n_location_id, float n_latitude, float n_longitude, String n_slug, String n_name, CountryEnum countryEnum) {
        this(countryEnum);
        this.n_city_id = n_city_id;
        this.n_location_id = n_location_id;
        this.n_latitude = n_latitude;
        this.n_longitude = n_longitude;
        this.n_slug = n_slug;
        this.n_name = n_name;
        this.cd_city_uuid = Generators.randomBasedGenerator().generate().toString();
    }

    public CityPivot(int n_city_id, int n_location_id, float n_latitude, float n_longitude, String n_slug, String n_name, int n_country_id, int cd_appdomain_id, Integer cd_city_id, String cd_city_uuid) {
        this.n_city_id = n_city_id;
        this.n_location_id = n_location_id;
        this.n_latitude = n_latitude;
        this.n_longitude = n_longitude;
        this.n_slug = n_slug;
        this.n_name = n_name;
        this.n_country_id = n_country_id;
        this.cd_appdomain_id = cd_appdomain_id;
        this.cd_city_id = cd_city_id;
        this.cd_city_uuid = cd_city_uuid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getN_city_id() {
        return n_city_id;
    }

    public void setN_city_id(int n_city_id) {
        this.n_city_id = n_city_id;
    }

    public int getN_location_id() {
        return n_location_id;
    }

    public void setN_location_id(int n_location_id) {
        this.n_location_id = n_location_id;
    }

    public float getN_latitude() {
        return n_latitude;
    }

    public void setN_latitude(float n_latitude) {
        this.n_latitude = n_latitude;
    }

    public float getN_longitude() {
        return n_longitude;
    }

    public void setN_longitude(float n_longitude) {
        this.n_longitude = n_longitude;
    }

    public String getN_slug() {
        return n_slug;
    }

    public void setN_slug(String n_slug) {
        this.n_slug = n_slug;
    }

    public String getN_name() {
        return n_name;
    }

    public void setN_name(String n_name) {
        this.n_name = n_name;
    }

    public int getN_country_id() {
        return n_country_id;
    }

    public void setN_country_id(int n_country_id) {
        this.n_country_id = n_country_id;
    }

    public int getCd_appdomain_id() {
        return cd_appdomain_id;
    }

    public void setCd_appdomain_id(int cd_appdomain_id) {
        this.cd_appdomain_id = cd_appdomain_id;
    }

    public Integer getCd_city_id() {
        return cd_city_id;
    }

    public void setCd_city_id(Integer cd_city_id) {
        this.cd_city_id = cd_city_id;
    }

    public String getCd_city_uuid() {
        return cd_city_uuid;
    }

    public void setCd_city_uuid(String cd_city_uuid) {
        this.cd_city_uuid = cd_city_uuid;
    }

    public CountryEnum getCountryEnum() {
        return countryEnum;
    }
}
