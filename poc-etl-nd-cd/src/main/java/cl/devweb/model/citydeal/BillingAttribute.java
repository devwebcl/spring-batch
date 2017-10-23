package cl.devweb.model.citydeal;

import java.util.Date;

public class BillingAttribute {

    private Long ba_id;
    private Date ba_created;
    private Date ba_last_modified;
    private Long ba_ubh_id;

    //workaround to insert twice:
    //user_agent:
    private String ba_attribute_useragent;  //ba_attribute
    private String ba_value_useragent;      //ba_value

    //clienttype:
    private String ba_attribute_clienttype; //ba_attribute
    private String ba_value_clienttype;     //ba_value

    public Long getBa_id() {
        return ba_id;
    }

    public void setBa_id(Long ba_id) {
        this.ba_id = ba_id;
    }

    public Date getBa_created() {
        return ba_created;
    }

    public void setBa_created(Date ba_created) {
        this.ba_created = ba_created;
    }

    public Date getBa_last_modified() {
        return ba_last_modified;
    }

    public void setBa_last_modified(Date ba_last_modified) {
        this.ba_last_modified = ba_last_modified;
    }

    public Long getBa_ubh_id() {
        return ba_ubh_id;
    }

    public void setBa_ubh_id(Long ba_ubh_id) {
        this.ba_ubh_id = ba_ubh_id;
    }

    public String getBa_attribute_useragent() {
        return ba_attribute_useragent;
    }

    public void setBa_attribute_useragent(String ba_attribute_useragent) {
        this.ba_attribute_useragent = ba_attribute_useragent;
    }

    public String getBa_value_useragent() {
        return ba_value_useragent;
    }

    public void setBa_value_useragent(String ba_value_useragent) {
        this.ba_value_useragent = ba_value_useragent;
    }

    public String getBa_attribute_clienttype() {
        return ba_attribute_clienttype;
    }

    public void setBa_attribute_clienttype(String ba_attribute_clienttype) {
        this.ba_attribute_clienttype = ba_attribute_clienttype;
    }

    public String getBa_value_clienttype() {
        return ba_value_clienttype;
    }

    public void setBa_value_clienttype(String ba_value_clienttype) {
        this.ba_value_clienttype = ba_value_clienttype;
    }

}
