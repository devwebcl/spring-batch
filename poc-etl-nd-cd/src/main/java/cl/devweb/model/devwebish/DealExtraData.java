package cl.devweb.model.devwebish;

import java.util.Date;

public class DealExtraData {

    private long id;
    private long deal_id;
    private Date init_coupon_date;
    private Date created;
    private Date modified;
    private long gender_code;
    private long template_deal_id;
    private boolean sharing_stock;
    private String dealbank_status;
    private String business_unit;
    private long coupon_duration;
    private String reviews;
    private boolean payment_offline;
    private long num_migrated_image_id;

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

    public Date getInit_coupon_date() {
        return init_coupon_date;
    }

    public void setInit_coupon_date(Date init_coupon_date) {
        this.init_coupon_date = init_coupon_date;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public long getGender_code() {
        return gender_code;
    }

    public void setGender_code(long gender_code) {
        this.gender_code = gender_code;
    }

    public long getTemplate_deal_id() {
        return template_deal_id;
    }

    public void setTemplate_deal_id(long template_deal_id) {
        this.template_deal_id = template_deal_id;
    }

    public boolean isSharing_stock() {
        return sharing_stock;
    }

    public void setSharing_stock(boolean sharing_stock) {
        this.sharing_stock = sharing_stock;
    }

    public String getDealbank_status() {
        return dealbank_status;
    }

    public void setDealbank_status(String dealbank_status) {
        this.dealbank_status = dealbank_status;
    }

    public String getBusiness_unit() {
        return business_unit;
    }

    public void setBusiness_unit(String business_unit) {
        this.business_unit = business_unit;
    }

    public long getCoupon_duration() {
        return coupon_duration;
    }

    public void setCoupon_duration(long coupon_duration) {
        this.coupon_duration = coupon_duration;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public boolean isPayment_offline() {
        return payment_offline;
    }

    public void setPayment_offline(boolean payment_offline) {
        this.payment_offline = payment_offline;
    }

    public long getNum_migrated_image_id() {
        return num_migrated_image_id;
    }

    public void setNum_migrated_image_id(long num_migrated_image_id) {
        this.num_migrated_image_id = num_migrated_image_id;
    }

}
