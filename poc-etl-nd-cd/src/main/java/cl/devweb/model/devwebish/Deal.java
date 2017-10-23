package cl.devweb.model.devwebish;

import java.util.Date;

public class Deal {

    private Long id;
    private long brand_id;
    private String status;
    private Date date;
    private Long deal_type_id;
    private Long parent_deal_id;
    private long country_id;
    private long city_id;
    private String type;
    private String type2;
    private long local;
    private Double value;
    private long discount;
    private Double final_price;
    private Byte reward;
    private String title;
    private String short_title;
    private String coupon_title;
    private String nl_title;
    private String slug;
    private String remark;
    private String description;
    private Date due_date;
    private String details;
    private long company_id;
    private String picture;
    private String contract;
    private long tipping_point;
    private Date created;
    private Date modified;
    private long sold_qty;
    private Date expiration_date;
    private String redeem_at;
    private long max_coupons;
    private long shipping;
    private boolean expiration_alert;
    private String shipping_data;
    private long shipping_weight;
    private long shipping_long;
    private long shipping_height;
    private long shipping_width;
    private String shipping_content;
    private String shipping_delivery;
    private String shipping_contact;
    private String shipping_contact_address;
    private String shipping_contact_position;
    private String shipping_contact_phone;
    private String shipping_contact_email;
    private long shipping_courier;
    private long shipping_partner_price; //Big_decimal
    private long shipping_total_price; //Big_decimal
    private long shipping_client_price; //Big_decimal
    private double commission;
    private double commission_tax;
    private Boolean applicable_tax;
    private long seller_id;
    private long init_coupons;
    private String highlights;
    private String redeem_type;
    private long importance;
    private String salesforce_id;
    private String so_salesforce_id;
    private boolean additional_info;
    private long max_coupons_per_buy;
    private Boolean settlements_from_mg;
    private String partner_country;
    private long partner_original_price; //Big_decimal
    private long partner_special_price; //Big_decimal
    private Date flash_time;
    private boolean deal_addon;
    private long category_id;
    private Boolean restricted;
    private Boolean mulligan;
    private long mulligan_days;
    private long mulligan_time;
    private long extend_from_id;
    private Date shipping_ended_date;
    private String shipping_ended_address;
    private String shipping_ended_name;
    private String shipping_ended_hours;
    private Date shipping_delivery_date;
    private Date shipping_real_delivery_date;
    private Date shipping_product_delivery_date;
    private Date shipping_real_product_delivery_date;
    private long shipping_delivery_zone_id;
    private boolean instant_sending;
    private Boolean sending_coupons;
    private Boolean sync_additional_info;
    private Boolean stock_management;
    private long mg_partner_id;
    private String permalink;


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDeal_type_id() {
		return deal_type_id;
	}
	public void setDeal_type_id(Long deal_type_id) {
		this.deal_type_id = deal_type_id;
	}
	public Long getParent_deal_id() {
		return parent_deal_id;
	}
	public void setParent_deal_id(Long parent_deal_id) {
		this.parent_deal_id = parent_deal_id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public long getLocal() {
		return local;
	}
	public void setLocal(long local) {
		this.local = local;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public Double getFinal_price() {
		return final_price;
	}
	public void setFinal_price(Double final_price) {
		this.final_price = final_price;
	}
	public Byte getReward() {
		return reward;
	}
	public void setReward(Byte reward) {
		this.reward = reward;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShort_title() {
		return short_title;
	}
	public void setShort_title(String short_title) {
		this.short_title = short_title;
	}
	public String getCoupon_title() {
		return coupon_title;
	}
	public void setCoupon_title(String coupon_title) {
		this.coupon_title = coupon_title;
	}
	public String getNl_title() {
		return nl_title;
	}
	public void setNl_title(String nl_title) {
		this.nl_title = nl_title;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public long getTipping_point() {
		return tipping_point;
	}
	public void setTipping_point(long tipping_point) {
		this.tipping_point = tipping_point;
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
	public long getSold_qty() {
		return sold_qty;
	}
	public void setSold_qty(long sold_qty) {
		this.sold_qty = sold_qty;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getRedeem_at() {
		return redeem_at;
	}
	public void setRedeem_at(String redeem_at) {
		this.redeem_at = redeem_at;
	}
	public long getMax_coupons() {
		return max_coupons;
	}
	public void setMax_coupons(long max_coupons) {
		this.max_coupons = max_coupons;
	}
	public long getShipping() {
		return shipping;
	}
	public void setShipping(long shipping) {
		this.shipping = shipping;
	}
	public boolean isExpiration_alert() {
		return expiration_alert;
	}
	public void setExpiration_alert(boolean expiration_alert) {
		this.expiration_alert = expiration_alert;
	}
	public String getShipping_data() {
		return shipping_data;
	}
	public void setShipping_data(String shipping_data) {
		this.shipping_data = shipping_data;
	}
	public long getShipping_weight() {
		return shipping_weight;
	}
	public void setShipping_weight(long shipping_weight) {
		this.shipping_weight = shipping_weight;
	}
	public long getShipping_long() {
		return shipping_long;
	}
	public void setShipping_long(long shipping_long) {
		this.shipping_long = shipping_long;
	}
	public long getShipping_height() {
		return shipping_height;
	}
	public void setShipping_height(long shipping_height) {
		this.shipping_height = shipping_height;
	}
	public long getShipping_width() {
		return shipping_width;
	}
	public void setShipping_width(long shipping_width) {
		this.shipping_width = shipping_width;
	}
	public String getShipping_content() {
		return shipping_content;
	}
	public void setShipping_content(String shipping_content) {
		this.shipping_content = shipping_content;
	}
	public String getShipping_delivery() {
		return shipping_delivery;
	}
	public void setShipping_delivery(String shipping_delivery) {
		this.shipping_delivery = shipping_delivery;
	}
	public String getShipping_contact() {
		return shipping_contact;
	}
	public void setShipping_contact(String shipping_contact) {
		this.shipping_contact = shipping_contact;
	}
	public String getShipping_contact_address() {
		return shipping_contact_address;
	}
	public void setShipping_contact_address(String shipping_contact_address) {
		this.shipping_contact_address = shipping_contact_address;
	}
	public String getShipping_contact_position() {
		return shipping_contact_position;
	}
	public void setShipping_contact_position(String shipping_contact_position) {
		this.shipping_contact_position = shipping_contact_position;
	}
	public String getShipping_contact_phone() {
		return shipping_contact_phone;
	}
	public void setShipping_contact_phone(String shipping_contact_phone) {
		this.shipping_contact_phone = shipping_contact_phone;
	}
	public String getShipping_contact_email() {
		return shipping_contact_email;
	}
	public void setShipping_contact_email(String shipping_contact_email) {
		this.shipping_contact_email = shipping_contact_email;
	}
	public long getShipping_courier() {
		return shipping_courier;
	}
	public void setShipping_courier(long shipping_courier) {
		this.shipping_courier = shipping_courier;
	}
	public long getShipping_partner_price() {
		return shipping_partner_price;
	}
	public void setShipping_partner_price(long shipping_partner_price) {
		this.shipping_partner_price = shipping_partner_price;
	}
	public long getShipping_total_price() {
		return shipping_total_price;
	}
	public void setShipping_total_price(long shipping_total_price) {
		this.shipping_total_price = shipping_total_price;
	}
	public long getShipping_client_price() {
		return shipping_client_price;
	}
	public void setShipping_client_price(long shipping_client_price) {
		this.shipping_client_price = shipping_client_price;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getCommission_tax() {
		return commission_tax;
	}
	public void setCommission_tax(double commission_tax) {
		this.commission_tax = commission_tax;
	}
	public Boolean getApplicable_tax() {
		return applicable_tax;
	}
	public void setApplicable_tax(Boolean applicable_tax) {
		this.applicable_tax = applicable_tax;
	}
	public long getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(long seller_id) {
		this.seller_id = seller_id;
	}
	public long getInit_coupons() {
		return init_coupons;
	}
	public void setInit_coupons(long init_coupons) {
		this.init_coupons = init_coupons;
	}
	public String getHighlights() {
		return highlights;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public String getRedeem_type() {
		return redeem_type;
	}
	public void setRedeem_type(String redeem_type) {
		this.redeem_type = redeem_type;
	}
	public long getImportance() {
		return importance;
	}
	public void setImportance(long importance) {
		this.importance = importance;
	}
	public String getSalesforce_id() {
		return salesforce_id;
	}
	public void setSalesforce_id(String salesforce_id) {
		this.salesforce_id = salesforce_id;
	}
	public String getSo_salesforce_id() {
		return so_salesforce_id;
	}
	public void setSo_salesforce_id(String so_salesforce_id) {
		this.so_salesforce_id = so_salesforce_id;
	}
	public boolean isAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(boolean additional_info) {
		this.additional_info = additional_info;
	}
	public long getMax_coupons_per_buy() {
		return max_coupons_per_buy;
	}
	public void setMax_coupons_per_buy(long max_coupons_per_buy) {
		this.max_coupons_per_buy = max_coupons_per_buy;
	}
	public Boolean getSettlements_from_mg() {
		return settlements_from_mg;
	}
	public void setSettlements_from_mg(Boolean settlements_from_mg) {
		this.settlements_from_mg = settlements_from_mg;
	}
	public String getPartner_country() {
		return partner_country;
	}
	public void setPartner_country(String partner_country) {
		this.partner_country = partner_country;
	}
	public long getPartner_original_price() {
		return partner_original_price;
	}
	public void setPartner_original_price(long partner_original_price) {
		this.partner_original_price = partner_original_price;
	}
	public long getPartner_special_price() {
		return partner_special_price;
	}
	public void setPartner_special_price(long partner_special_price) {
		this.partner_special_price = partner_special_price;
	}
	public Date getFlash_time() {
		return flash_time;
	}
	public void setFlash_time(Date flash_time) {
		this.flash_time = flash_time;
	}
	public boolean isDeal_addon() {
		return deal_addon;
	}
	public void setDeal_addon(boolean deal_addon) {
		this.deal_addon = deal_addon;
	}
	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}
	public Boolean getRestricted() {
		return restricted;
	}
	public void setRestricted(Boolean restricted) {
		this.restricted = restricted;
	}
	public Boolean getMulligan() {
		return mulligan;
	}
	public void setMulligan(Boolean mulligan) {
		this.mulligan = mulligan;
	}
	public long getMulligan_days() {
		return mulligan_days;
	}
	public void setMulligan_days(long mulligan_days) {
		this.mulligan_days = mulligan_days;
	}
	public long getMulligan_time() {
		return mulligan_time;
	}
	public void setMulligan_time(long mulligan_time) {
		this.mulligan_time = mulligan_time;
	}
	public long getExtend_from_id() {
		return extend_from_id;
	}
	public void setExtend_from_id(long extend_from_id) {
		this.extend_from_id = extend_from_id;
	}
	public Date getShipping_ended_date() {
		return shipping_ended_date;
	}
	public void setShipping_ended_date(Date shipping_ended_date) {
		this.shipping_ended_date = shipping_ended_date;
	}
	public String getShipping_ended_address() {
		return shipping_ended_address;
	}
	public void setShipping_ended_address(String shipping_ended_address) {
		this.shipping_ended_address = shipping_ended_address;
	}
	public String getShipping_ended_name() {
		return shipping_ended_name;
	}
	public void setShipping_ended_name(String shipping_ended_name) {
		this.shipping_ended_name = shipping_ended_name;
	}
	public String getShipping_ended_hours() {
		return shipping_ended_hours;
	}
	public void setShipping_ended_hours(String shipping_ended_hours) {
		this.shipping_ended_hours = shipping_ended_hours;
	}
	public Date getShipping_delivery_date() {
		return shipping_delivery_date;
	}
	public void setShipping_delivery_date(Date shipping_delivery_date) {
		this.shipping_delivery_date = shipping_delivery_date;
	}
	public Date getShipping_real_delivery_date() {
		return shipping_real_delivery_date;
	}
	public void setShipping_real_delivery_date(Date shipping_real_delivery_date) {
		this.shipping_real_delivery_date = shipping_real_delivery_date;
	}
	public Date getShipping_product_delivery_date() {
		return shipping_product_delivery_date;
	}
	public void setShipping_product_delivery_date(Date shipping_product_delivery_date) {
		this.shipping_product_delivery_date = shipping_product_delivery_date;
	}
	public Date getShipping_real_product_delivery_date() {
		return shipping_real_product_delivery_date;
	}
	public void setShipping_real_product_delivery_date(Date shipping_real_product_delivery_date) {
		this.shipping_real_product_delivery_date = shipping_real_product_delivery_date;
	}
	public long getShipping_delivery_zone_id() {
		return shipping_delivery_zone_id;
	}
	public void setShipping_delivery_zone_id(long shipping_delivery_zone_id) {
		this.shipping_delivery_zone_id = shipping_delivery_zone_id;
	}
	public boolean isInstant_sending() {
		return instant_sending;
	}
	public void setInstant_sending(boolean instant_sending) {
		this.instant_sending = instant_sending;
	}
	public Boolean getSending_coupons() {
		return sending_coupons;
	}
	public void setSending_coupons(Boolean sending_coupons) {
		this.sending_coupons = sending_coupons;
	}
	public Boolean getSync_additional_info() {
		return sync_additional_info;
	}
	public void setSync_additional_info(Boolean sync_additional_info) {
		this.sync_additional_info = sync_additional_info;
	}
	public Boolean getStock_management() {
		return stock_management;
	}
	public void setStock_management(Boolean stock_management) {
		this.stock_management = stock_management;
	}
	public long getMg_partner_id() {
		return mg_partner_id;
	}
	public void setMg_partner_id(long mg_partner_id) {
		this.mg_partner_id = mg_partner_id;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}



    /*
     @Override
     public String toString() {
     return "Deal [id =" + id + " date=" + this.date + "; salesforce_id=" + this.salesforce_id + "; status=" + this.status + "; type2=" + this.type2 + "]";
     }
     */
}
