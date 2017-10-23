package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

public class DealMerchantRedemptionLocation {

    private Integer dmrl_id;
    private Date dmrl_created;
    private Date dmrl_last_modified;
    private String dmrl_address;
    private Double dmrl_latitude;
    private Double dmrl_longitude;
    private Integer dmrl_radius;
    private Integer dmrl_dm_id;
    private Integer dmrl_status;
    private UUID dmrl_guid;
    private String dmrl_phone;

    public Integer getDmrl_id() {
        return dmrl_id;
    }

    public void setDmrl_id(Integer dmrl_id) {
        this.dmrl_id = dmrl_id;
    }

    public Date getDmrl_created() {
        return dmrl_created;
    }

    public void setDmrl_created(Date dmrl_created) {
        this.dmrl_created = dmrl_created;
    }

    public Date getDmrl_last_modified() {
        return dmrl_last_modified;
    }

    public void setDmrl_last_modified(Date dmrl_last_modified) {
        this.dmrl_last_modified = dmrl_last_modified;
    }

    public String getDmrl_address() {
        return dmrl_address;
    }

    public void setDmrl_address(String dmrl_address) {
        this.dmrl_address = dmrl_address;
    }

    public Double getDmrl_latitude() {
        return dmrl_latitude;
    }

    public void setDmrl_latitude(Double dmrl_latitude) {
        this.dmrl_latitude = dmrl_latitude;
    }

    public Double getDmrl_longitude() {
        return dmrl_longitude;
    }

    public void setDmrl_longitude(Double dmrl_longitude) {
        this.dmrl_longitude = dmrl_longitude;
    }

    public Integer getDmrl_radius() {
        return dmrl_radius;
    }

    public void setDmrl_radius(Integer dmrl_radius) {
        this.dmrl_radius = dmrl_radius;
    }

    public Integer getDmrl_dm_id() {
        return dmrl_dm_id;
    }

    public void setDmrl_dm_id(Integer dmrl_dm_id) {
        this.dmrl_dm_id = dmrl_dm_id;
    }

    public Integer getDmrl_status() {
        return dmrl_status;
    }

    public void setDmrl_status(Integer dmrl_status) {
        this.dmrl_status = dmrl_status;
    }

    public UUID getDmrl_guid() {
        return dmrl_guid;
    }

    public void setDmrl_guid(UUID dmrl_guid) {
        this.dmrl_guid = dmrl_guid;
    }

    public String getDmrl_phone() {
        return dmrl_phone;
    }

    public void setDmrl_phone(String dmrl_phone) {
        this.dmrl_phone = dmrl_phone;
    }

}
