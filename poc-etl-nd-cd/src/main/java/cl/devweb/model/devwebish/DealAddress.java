package cl.devweb.model.devwebish;

import java.util.Date;

public class DealAddress {

    private long id;
    private long deal_id;
    private long country_id;
    private long city_id;
    private long location_id;
    private String address;
    private Double lat;
    private Double lng;
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(long deal_id) {
        this.deal_id = deal_id;
    }

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
