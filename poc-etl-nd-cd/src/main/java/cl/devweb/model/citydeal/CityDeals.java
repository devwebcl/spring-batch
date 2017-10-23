package cl.devweb.model.citydeal;

import java.util.Date;

import org.postgresql.util.PGInterval;

public class CityDeals {

    private long cd_id;
    private long cd_ptc_city_id;
    private String cd_meta_title;
    private String cd_meta_description;
    private String cd_meta_keywords;
    private String cd_title;
    private String cd_short_description;
    private String cd_short_highlights;
    private String cd_long_description;
    private String cd_image_big;
    private String cd_image_small;
    private long cd_merchant_id;
    private Double cd_original_price_gross;
    private double cd_special_price_gross;
    private double cd_special_price_tax;
    private long cd_participant_minimum;
    private long cd_participant_maximum;
    private Date cd_deal_start_time;
    private Date cd_deal_end_time;
    private long cd_deal_status;
    private String cd_newsletter_subject;
    private String cd_newsletter_textblock;
    private long cd_participant_current;
    private String cd_image_newsletter;
    private String cd_title_for_url_permalink;
    private long cd_deal_email_type;
    private Date cd_coupon_valid_from;
    private Date cd_coupon_valid_until;
    private long cd_dlg_id;
    private Date cd_last_modified;
    private boolean cd_scheduled_for_newsletter;
    private long cd_customer_index_max;
    private long cd_deal_type_id;
    private String cd_salesforce_id;
    private String cd_deal_title_coupon;
    private long cd_coupon_how_it_works;
    private long cd_appdomain_id;
    private String cd_sidedeal_image;
    private long cd_deal_priority;
    private String cd_newsletter_title;
    private String cd_newsletter_side_deal_title;
    private String cd_multideal_type;
    private long cd_multideal_parent;
    private boolean cd_voucher_send_by_sms;
    private String cd_voucher_delivery_event;
    private String cd_sms_prefix;
    private String cd_mobile_description;
    private String cd_mvc_pool_id;
    private boolean cd_mulligan_enabled;
	private long cd_mulligan_parent;
    private String cd_canonical_tag;
    private String cd_salesforce_scheduling_detail_id;
    private long cd_dpc_id;
    private long cd_buy_limit_per_user;
    private String cd_salesforce_feature_id;
    private Date cd_created;
    private boolean cd_blacklisted;
    private long cd_drdrt_id;
    private String cd_redirect_url;
    private PGInterval cd_expiration_period;


	public long getCd_id() {
		return cd_id;
	}
	public void setCd_id(long cd_id) {
		this.cd_id = cd_id;
	}
	public long getCd_ptc_city_id() {
		return cd_ptc_city_id;
	}
	public void setCd_ptc_city_id(long cd_ptc_city_id) {
		this.cd_ptc_city_id = cd_ptc_city_id;
	}
	public String getCd_meta_title() {
		return cd_meta_title;
	}
	public void setCd_meta_title(String cd_meta_title) {
		this.cd_meta_title = cd_meta_title;
	}
	public String getCd_meta_description() {
		return cd_meta_description;
	}
	public void setCd_meta_description(String cd_meta_description) {
		this.cd_meta_description = cd_meta_description;
	}
	public String getCd_meta_keywords() {
		return cd_meta_keywords;
	}
	public void setCd_meta_keywords(String cd_meta_keywords) {
		this.cd_meta_keywords = cd_meta_keywords;
	}
	public String getCd_title() {
		return cd_title;
	}
	public void setCd_title(String cd_title) {
		this.cd_title = cd_title;
	}
	public String getCd_short_description() {
		return cd_short_description;
	}
	public void setCd_short_description(String cd_short_description) {
		this.cd_short_description = cd_short_description;
	}
	public String getCd_short_highlights() {
		return cd_short_highlights;
	}
	public void setCd_short_highlights(String cd_short_highlights) {
		this.cd_short_highlights = cd_short_highlights;
	}
	public String getCd_long_description() {
		return cd_long_description;
	}
	public void setCd_long_description(String cd_long_description) {
		this.cd_long_description = cd_long_description;
	}
	public String getCd_image_big() {
		return cd_image_big;
	}
	public void setCd_image_big(String cd_image_big) {
		this.cd_image_big = cd_image_big;
	}
	public String getCd_image_small() {
		return cd_image_small;
	}
	public void setCd_image_small(String cd_image_small) {
		this.cd_image_small = cd_image_small;
	}
	public long getCd_merchant_id() {
		return cd_merchant_id;
	}
	public void setCd_merchant_id(long cd_merchant_id) {
		this.cd_merchant_id = cd_merchant_id;
	}
	public Double getCd_original_price_gross() {
		return cd_original_price_gross;
	}
	public void setCd_original_price_gross(Double cd_original_price_gross) {
		this.cd_original_price_gross = cd_original_price_gross;
	}
	public double getCd_special_price_gross() {
		return cd_special_price_gross;
	}
	public void setCd_special_price_gross(double cd_special_price_gross) {
		this.cd_special_price_gross = cd_special_price_gross;
	}
	public double getCd_special_price_tax() {
		return cd_special_price_tax;
	}
	public void setCd_special_price_tax(double cd_special_price_tax) {
		this.cd_special_price_tax = cd_special_price_tax;
	}
	public long getCd_participant_minimum() {
		return cd_participant_minimum;
	}
	public void setCd_participant_minimum(long cd_participant_minimum) {
		this.cd_participant_minimum = cd_participant_minimum;
	}
	public long getCd_participant_maximum() {
		return cd_participant_maximum;
	}
	public void setCd_participant_maximum(long cd_participant_maximum) {
		this.cd_participant_maximum = cd_participant_maximum;
	}
	public Date getCd_deal_start_time() {
		return cd_deal_start_time;
	}
	public void setCd_deal_start_time(Date cd_deal_start_time) {
		this.cd_deal_start_time = cd_deal_start_time;
	}
	public Date getCd_deal_end_time() {
		return cd_deal_end_time;
	}
	public void setCd_deal_end_time(Date cd_deal_end_time) {
		this.cd_deal_end_time = cd_deal_end_time;
	}
	public long getCd_deal_status() {
		return cd_deal_status;
	}
	public void setCd_deal_status(long cd_deal_status) {
		this.cd_deal_status = cd_deal_status;
	}
	public String getCd_newsletter_subject() {
		return cd_newsletter_subject;
	}
	public void setCd_newsletter_subject(String cd_newsletter_subject) {
		this.cd_newsletter_subject = cd_newsletter_subject;
	}
	public String getCd_newsletter_textblock() {
		return cd_newsletter_textblock;
	}
	public void setCd_newsletter_textblock(String cd_newsletter_textblock) {
		this.cd_newsletter_textblock = cd_newsletter_textblock;
	}
	public long getCd_participant_current() {
		return cd_participant_current;
	}
	public void setCd_participant_current(long cd_participant_current) {
		this.cd_participant_current = cd_participant_current;
	}
	public String getCd_image_newsletter() {
		return cd_image_newsletter;
	}
	public void setCd_image_newsletter(String cd_image_newsletter) {
		this.cd_image_newsletter = cd_image_newsletter;
	}
	public String getCd_title_for_url_permalink() {
		return cd_title_for_url_permalink;
	}
	public void setCd_title_for_url_permalink(String cd_title_for_url_permalink) {
		this.cd_title_for_url_permalink = cd_title_for_url_permalink;
	}
	public long getCd_deal_email_type() {
		return cd_deal_email_type;
	}
	public void setCd_deal_email_type(long cd_deal_email_type) {
		this.cd_deal_email_type = cd_deal_email_type;
	}
	public Date getCd_coupon_valid_from() {
		return cd_coupon_valid_from;
	}
	public void setCd_coupon_valid_from(Date cd_coupon_valid_from) {
		this.cd_coupon_valid_from = cd_coupon_valid_from;
	}
	public Date getCd_coupon_valid_until() {
		return cd_coupon_valid_until;
	}
	public void setCd_coupon_valid_until(Date cd_coupon_valid_until) {
		this.cd_coupon_valid_until = cd_coupon_valid_until;
	}
	public long getCd_dlg_id() {
		return cd_dlg_id;
	}
	public void setCd_dlg_id(long cd_dlg_id) {
		this.cd_dlg_id = cd_dlg_id;
	}
	public Date getCd_last_modified() {
		return cd_last_modified;
	}
	public void setCd_last_modified(Date cd_last_modified) {
		this.cd_last_modified = cd_last_modified;
	}
	public boolean isCd_scheduled_for_newsletter() {
		return cd_scheduled_for_newsletter;
	}
	public void setCd_scheduled_for_newsletter(boolean cd_scheduled_for_newsletter) {
		this.cd_scheduled_for_newsletter = cd_scheduled_for_newsletter;
	}
	public long getCd_customer_index_max() {
		return cd_customer_index_max;
	}
	public void setCd_customer_index_max(long cd_customer_index_max) {
		this.cd_customer_index_max = cd_customer_index_max;
	}
	public long getCd_deal_type_id() {
		return cd_deal_type_id;
	}
	public void setCd_deal_type_id(long cd_deal_type_id) {
		this.cd_deal_type_id = cd_deal_type_id;
	}
	public String getCd_salesforce_id() {
		return cd_salesforce_id;
	}
	public void setCd_salesforce_id(String cd_salesforce_id) {
		this.cd_salesforce_id = cd_salesforce_id;
	}
	public String getCd_deal_title_coupon() {
		return cd_deal_title_coupon;
	}
	public void setCd_deal_title_coupon(String cd_deal_title_coupon) {
		this.cd_deal_title_coupon = cd_deal_title_coupon;
	}
	public long getCd_coupon_how_it_works() {
		return cd_coupon_how_it_works;
	}
	public void setCd_coupon_how_it_works(long cd_coupon_how_it_works) {
		this.cd_coupon_how_it_works = cd_coupon_how_it_works;
	}
	public long getCd_appdomain_id() {
		return cd_appdomain_id;
	}
	public void setCd_appdomain_id(long cd_appdomain_id) {
		this.cd_appdomain_id = cd_appdomain_id;
	}
	public String getCd_sidedeal_image() {
		return cd_sidedeal_image;
	}
	public void setCd_sidedeal_image(String cd_sidedeal_image) {
		this.cd_sidedeal_image = cd_sidedeal_image;
	}
	public long getCd_deal_priority() {
		return cd_deal_priority;
	}
	public void setCd_deal_priority(long cd_deal_priority) {
		this.cd_deal_priority = cd_deal_priority;
	}
	public String getCd_newsletter_title() {
		return cd_newsletter_title;
	}
	public void setCd_newsletter_title(String cd_newsletter_title) {
		this.cd_newsletter_title = cd_newsletter_title;
	}
	public String getCd_newsletter_side_deal_title() {
		return cd_newsletter_side_deal_title;
	}
	public void setCd_newsletter_side_deal_title(String cd_newsletter_side_deal_title) {
		this.cd_newsletter_side_deal_title = cd_newsletter_side_deal_title;
	}
	public String getCd_multideal_type() {
		return cd_multideal_type;
	}
	public void setCd_multideal_type(String cd_multideal_type) {
		this.cd_multideal_type = cd_multideal_type;
	}
	public long getCd_multideal_parent() {
		return cd_multideal_parent;
	}
	public void setCd_multideal_parent(long cd_multideal_parent) {
		this.cd_multideal_parent = cd_multideal_parent;
	}
	public boolean isCd_voucher_send_by_sms() {
		return cd_voucher_send_by_sms;
	}
	public void setCd_voucher_send_by_sms(boolean cd_voucher_send_by_sms) {
		this.cd_voucher_send_by_sms = cd_voucher_send_by_sms;
	}
	public String getCd_voucher_delivery_event() {
		return cd_voucher_delivery_event;
	}
	public void setCd_voucher_delivery_event(String cd_voucher_delivery_event) {
		this.cd_voucher_delivery_event = cd_voucher_delivery_event;
	}
	public String getCd_sms_prefix() {
		return cd_sms_prefix;
	}
	public void setCd_sms_prefix(String cd_sms_prefix) {
		this.cd_sms_prefix = cd_sms_prefix;
	}
	public String getCd_mobile_description() {
		return cd_mobile_description;
	}
	public void setCd_mobile_description(String cd_mobile_description) {
		this.cd_mobile_description = cd_mobile_description;
	}
	public String getCd_mvc_pool_id() {
		return cd_mvc_pool_id;
	}
	public void setCd_mvc_pool_id(String cd_mvc_pool_id) {
		this.cd_mvc_pool_id = cd_mvc_pool_id;
	}
	public boolean isCd_mulligan_enabled() {
		return cd_mulligan_enabled;
	}
	public void setCd_mulligan_enabled(boolean cd_mulligan_enabled) {
		this.cd_mulligan_enabled = cd_mulligan_enabled;
	}
	public long getCd_mulligan_parent() {
		return cd_mulligan_parent;
	}
	public void setCd_mulligan_parent(long cd_mulligan_parent) {
		this.cd_mulligan_parent = cd_mulligan_parent;
	}
	public String getCd_canonical_tag() {
		return cd_canonical_tag;
	}
	public void setCd_canonical_tag(String cd_canonical_tag) {
		this.cd_canonical_tag = cd_canonical_tag;
	}
	public String getCd_salesforce_scheduling_detail_id() {
		return cd_salesforce_scheduling_detail_id;
	}
	public void setCd_salesforce_scheduling_detail_id(String cd_salesforce_scheduling_detail_id) {
		this.cd_salesforce_scheduling_detail_id = cd_salesforce_scheduling_detail_id;
	}
	public long getCd_dpc_id() {
		return cd_dpc_id;
	}
	public void setCd_dpc_id(long cd_dpc_id) {
		this.cd_dpc_id = cd_dpc_id;
	}
	public long getCd_buy_limit_per_user() {
		return cd_buy_limit_per_user;
	}
	public void setCd_buy_limit_per_user(long cd_buy_limit_per_user) {
		this.cd_buy_limit_per_user = cd_buy_limit_per_user;
	}
	public String getCd_salesforce_feature_id() {
		return cd_salesforce_feature_id;
	}
	public void setCd_salesforce_feature_id(String cd_salesforce_feature_id) {
		this.cd_salesforce_feature_id = cd_salesforce_feature_id;
	}
	public Date getCd_created() {
		return cd_created;
	}
	public void setCd_created(Date cd_created) {
		this.cd_created = cd_created;
	}
	public boolean isCd_blacklisted() {
		return cd_blacklisted;
	}
	public void setCd_blacklisted(boolean cd_blacklisted) {
		this.cd_blacklisted = cd_blacklisted;
	}
	public long getCd_drdrt_id() {
		return cd_drdrt_id;
	}
	public void setCd_drdrt_id(long cd_drdrt_id) {
		this.cd_drdrt_id = cd_drdrt_id;
	}
	public String getCd_redirect_url() {
		return cd_redirect_url;
	}
	public void setCd_redirect_url(String cd_redirect_url) {
		this.cd_redirect_url = cd_redirect_url;
	}
	public PGInterval getCd_expiration_period() {
		return cd_expiration_period;
	}
	public void setCd_expiration_period(PGInterval cd_expiration_period) {
		this.cd_expiration_period = cd_expiration_period;
	}



}
