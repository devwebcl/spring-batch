package cl.devweb.model.citydeal;

import java.util.UUID;

public class UserAddressCD {

    private long ua_u_id;
    private String ua_first_name;
    private String ua_last_name;
    private String ua_street;
    private String ua_street_number;
    private String ua_city;
    private String ua_postal_code;
    private String ua_country;
    private String ua_phone_number;
    private String ua_personal_identification_number;
    private String ua_additional_information;
    private UUID ua_uuid;

    public long getUa_u_id() {
        return ua_u_id;
    }

    public void setUa_u_id(long ua_u_id) {
        this.ua_u_id = ua_u_id;
    }

    public String getUa_first_name() {
        return ua_first_name;
    }

    public void setUa_first_name(String ua_first_name) {
        this.ua_first_name = ua_first_name;
    }

    public String getUa_last_name() {
        return ua_last_name;
    }

    public void setUa_last_name(String ua_last_name) {
        this.ua_last_name = ua_last_name;
    }

    public String getUa_street() {
        return ua_street;
    }

    public void setUa_street(String ua_street) {
        this.ua_street = ua_street;
    }

    public String getUa_street_number() {
        return ua_street_number;
    }

    public void setUa_street_number(String ua_street_number) {
        this.ua_street_number = ua_street_number;
    }

    public String getUa_city() {
        return ua_city;
    }

    public void setUa_city(String ua_city) {
        this.ua_city = ua_city;
    }

    public String getUa_postal_code() {
        return ua_postal_code;
    }

    public void setUa_postal_code(String ua_postal_code) {
        this.ua_postal_code = ua_postal_code;
    }

    public String getUa_country() {
        return ua_country;
    }

    public void setUa_country(String ua_country) {
        this.ua_country = ua_country;
    }

    public String getUa_phone_number() {
        return ua_phone_number;
    }

    public void setUa_phone_number(String ua_phone_number) {
        this.ua_phone_number = ua_phone_number;
    }

    public String getUa_personal_identification_number() {
        return ua_personal_identification_number;
    }

    public void setUa_personal_identification_number(String ua_personal_identification_number) {
        this.ua_personal_identification_number = ua_personal_identification_number;
    }

    public String getUa_additional_information() {
        return ua_additional_information;
    }

    public void setUa_additional_information(String ua_additional_information) {
        this.ua_additional_information = ua_additional_information;
    }

    public UUID getUa_uuid() {
        return ua_uuid;
    }

    public void setUa_uuid(UUID ua_uuid) {
        this.ua_uuid = ua_uuid;
    }
}
