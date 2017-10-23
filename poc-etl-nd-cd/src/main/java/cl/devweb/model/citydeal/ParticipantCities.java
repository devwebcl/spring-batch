package cl.devweb.model.citydeal;

import java.util.UUID;

import cl.devweb.model.devwebish.enums.CountryEnum;

public class ParticipantCities {

    private int ptc_id;
    private String ptc_city_name;
    private int ptc_appdomain;
    private short ptc_status;
    private String ptc_city_url_name;
    private double ptc_latitude;
    private double ptc_longitude;
    private Integer ptc_menu_sort_order;
    private Integer ptc_parent_city;
    private boolean ptc_top_city;
    private String ptc_locale;
    private int ptc_city_group_id;
    private String ptc_timezone;
    private boolean ptc_is_nationwide_mapped;
    private boolean ptc_devweb_now_enabled;
    private boolean ptc_is_deal_bank;
    private boolean ptc_is_smartdeals_enabled;
    private boolean ptc_external_city_deal_url_enabled;
    private UUID ptc_guid;

    public ParticipantCities(int ptc_id, UUID ptc_guid) {
        this.ptc_id = ptc_id;
        this.ptc_guid = ptc_guid;
    }

    public ParticipantCities(CountryEnum countryEnum) {
        this.ptc_devweb_now_enabled = true;
        this.ptc_status = 0;
        this.ptc_appdomain = countryEnum.getCdAppDomainId();
        this.ptc_locale = countryEnum.getLocale();
        this.ptc_timezone = countryEnum.getTimeZoneId();
    }

    public ParticipantCities(CountryEnum countryEnum, String ptc_city_name, String ptc_city_url_name, double ptc_latitude, double ptc_longitude, UUID ptc_guid) {
        this(countryEnum);
        this.ptc_city_name = ptc_city_name;
        this.ptc_city_url_name = ptc_city_url_name;
        this.ptc_latitude = ptc_latitude;
        this.ptc_longitude = ptc_longitude;
        this.ptc_guid = ptc_guid;
    }

    public int getPtc_id() {
        return ptc_id;
    }

    public void setPtc_id(int ptc_id) {
        this.ptc_id = ptc_id;
    }

    public String getPtc_city_name() {
        return ptc_city_name;
    }

    public void setPtc_city_name(String ptc_city_name) {
        this.ptc_city_name = ptc_city_name;
    }

    public int getPtc_appdomain() {
        return ptc_appdomain;
    }

    public void setPtc_appdomain(int ptc_appdomain) {
        this.ptc_appdomain = ptc_appdomain;
    }

    public short getPtc_status() {
        return ptc_status;
    }

    public void setPtc_status(short ptc_status) {
        this.ptc_status = ptc_status;
    }

    public String getPtc_city_url_name() {
        return ptc_city_url_name;
    }

    public void setPtc_city_url_name(String ptc_city_url_name) {
        this.ptc_city_url_name = ptc_city_url_name;
    }

    public double getPtc_latitude() {
        return ptc_latitude;
    }

    public void setPtc_latitude(double ptc_latitude) {
        this.ptc_latitude = ptc_latitude;
    }

    public double getPtc_longitude() {
        return ptc_longitude;
    }

    public void setPtc_longitude(double ptc_longitude) {
        this.ptc_longitude = ptc_longitude;
    }

    public Integer getPtc_menu_sort_order() {
        return ptc_menu_sort_order;
    }

    public void setPtc_menu_sort_order(Integer ptc_menu_sort_order) {
        this.ptc_menu_sort_order = ptc_menu_sort_order;
    }

    public Integer getPtc_parent_city() {
        return ptc_parent_city;
    }

    public void setPtc_parent_city(Integer ptc_parent_city) {
        this.ptc_parent_city = ptc_parent_city;
    }

    public boolean isPtc_top_city() {
        return ptc_top_city;
    }

    public void setPtc_top_city(boolean ptc_top_city) {
        this.ptc_top_city = ptc_top_city;
    }

    public String getPtc_locale() {
        return ptc_locale;
    }

    public void setPtc_locale(String ptc_locale) {
        this.ptc_locale = ptc_locale;
    }

    public int getPtc_city_group_id() {
        return ptc_city_group_id;
    }

    public void setPtc_city_group_id(int ptc_city_group_id) {
        this.ptc_city_group_id = ptc_city_group_id;
    }

    public String getPtc_timezone() {
        return ptc_timezone;
    }

    public void setPtc_timezone(String ptc_timezone) {
        this.ptc_timezone = ptc_timezone;
    }

    public boolean isPtc_is_nationwide_mapped() {
        return ptc_is_nationwide_mapped;
    }

    public void setPtc_is_nationwide_mapped(boolean ptc_is_nationwide_mapped) {
        this.ptc_is_nationwide_mapped = ptc_is_nationwide_mapped;
    }

    public boolean isPtc_devweb_now_enabled() {
        return ptc_devweb_now_enabled;
    }

    public void setPtc_devweb_now_enabled(boolean ptc_devweb_now_enabled) {
        this.ptc_devweb_now_enabled = ptc_devweb_now_enabled;
    }

    public boolean isPtc_is_deal_bank() {
        return ptc_is_deal_bank;
    }

    public void setPtc_is_deal_bank(boolean ptc_is_deal_bank) {
        this.ptc_is_deal_bank = ptc_is_deal_bank;
    }

    public boolean isPtc_is_smartdeals_enabled() {
        return ptc_is_smartdeals_enabled;
    }

    public void setPtc_is_smartdeals_enabled(boolean ptc_is_smartdeals_enabled) {
        this.ptc_is_smartdeals_enabled = ptc_is_smartdeals_enabled;
    }

    public boolean isPtc_external_city_deal_url_enabled() {
        return ptc_external_city_deal_url_enabled;
    }

    public void setPtc_external_city_deal_url_enabled(boolean ptc_external_city_deal_url_enabled) {
        this.ptc_external_city_deal_url_enabled = ptc_external_city_deal_url_enabled;
    }

    public UUID getPtc_guid() {
        return ptc_guid;
    }

    public void setPtc_guid(UUID ptc_guid) {
        this.ptc_guid = ptc_guid;
    }
}


