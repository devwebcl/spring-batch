package cl.devweb.model.citydeal;

import java.util.Date;
import org.postgresql.util.PGInterval;

public class Appdomains {


	 private long app_id;
     private String app_info;
     private String app_url_domain;
     private String app_currency;
     private Long[] app_payment_provider;  //TODO: check :::  smallint[]
     private long app_reward_units;

     //PGInterval or  org.joda.time.Period ???
     private PGInterval app_reward_delay_interval;   //TODO: check :::  interval DEFAULT '7 days'::interval,
     private PGInterval app_reward_expire_interval;  //TODO: check :::  interval DEFAULT '1 year'::interval,
     private PGInterval app_reward_pending_interval; //TODO: check :::  interval DEFAULT '72:00:00'::interval NOT NULL,

     private Date app_last_modified;
     private String app_bonus_payment_name;
     private long app_incentive_reward_amount;
     private boolean app_double_optin;
     private String app_default_locale;
     private Date app_created;
     private Date app_ihq_optin_date;
     private String[] app_locales;                  //TODO: check :::  text[],
     private boolean app_order_value_currency_symbol;
     private boolean app_order_street_street_number;
     private boolean app_order_zip_city;
     private boolean app_landing_page_enabled;
     private long app_number_of_top_cities;
     private String app_media_plex_id;
     private String app_zone;
     private Double[] app_tax_rate; //TODO: check :::  double precision[],
     private boolean app_delay_capturing;
     private boolean app_nsoq_create_enabled;


	public long getApp_id() {
		return app_id;
	}
	public void setApp_id(long app_id) {
		this.app_id = app_id;
	}
	public String getApp_info() {
		return app_info;
	}
	public void setApp_info(String app_info) {
		this.app_info = app_info;
	}
	public String getApp_url_domain() {
		return app_url_domain;
	}
	public void setApp_url_domain(String app_url_domain) {
		this.app_url_domain = app_url_domain;
	}
	public String getApp_currency() {
		return app_currency;
	}
	public void setApp_currency(String app_currency) {
		this.app_currency = app_currency;
	}
	public Long[] getApp_payment_provider() {
		return app_payment_provider;
	}
	public void setApp_payment_provider(Long[] app_payment_provider) {
		this.app_payment_provider = app_payment_provider;
	}
	public long getApp_reward_units() {
		return app_reward_units;
	}
	public void setApp_reward_units(long app_reward_units) {
		this.app_reward_units = app_reward_units;
	}
	public PGInterval getApp_reward_delay_interval() {
		return app_reward_delay_interval;
	}
	public void setApp_reward_delay_interval(PGInterval app_reward_delay_interval) {
		this.app_reward_delay_interval = app_reward_delay_interval;
	}
	public PGInterval getApp_reward_expire_interval() {
		return app_reward_expire_interval;
	}
	public void setApp_reward_expire_interval(PGInterval app_reward_expire_interval) {
		this.app_reward_expire_interval = app_reward_expire_interval;
	}
	public PGInterval getApp_reward_pending_interval() {
		return app_reward_pending_interval;
	}
	public void setApp_reward_pending_interval(PGInterval app_reward_pending_interval) {
		this.app_reward_pending_interval = app_reward_pending_interval;
	}
	public Date getApp_last_modified() {
		return app_last_modified;
	}
	public void setApp_last_modified(Date app_last_modified) {
		this.app_last_modified = app_last_modified;
	}
	public String getApp_bonus_payment_name() {
		return app_bonus_payment_name;
	}
	public void setApp_bonus_payment_name(String app_bonus_payment_name) {
		this.app_bonus_payment_name = app_bonus_payment_name;
	}
	public long getApp_incentive_reward_amount() {
		return app_incentive_reward_amount;
	}
	public void setApp_incentive_reward_amount(long app_incentive_reward_amount) {
		this.app_incentive_reward_amount = app_incentive_reward_amount;
	}
	public boolean isApp_double_optin() {
		return app_double_optin;
	}
	public void setApp_double_optin(boolean app_double_optin) {
		this.app_double_optin = app_double_optin;
	}
	public String getApp_default_locale() {
		return app_default_locale;
	}
	public void setApp_default_locale(String app_default_locale) {
		this.app_default_locale = app_default_locale;
	}
	public Date getApp_created() {
		return app_created;
	}
	public void setApp_created(Date app_created) {
		this.app_created = app_created;
	}
	public Date getApp_ihq_optin_date() {
		return app_ihq_optin_date;
	}
	public void setApp_ihq_optin_date(Date app_ihq_optin_date) {
		this.app_ihq_optin_date = app_ihq_optin_date;
	}
	public String[] getApp_locales() {
		return app_locales;
	}
	public void setApp_locales(String[] app_locales) {
		this.app_locales = app_locales;
	}
	public boolean isApp_order_value_currency_symbol() {
		return app_order_value_currency_symbol;
	}
	public void setApp_order_value_currency_symbol(boolean app_order_value_currency_symbol) {
		this.app_order_value_currency_symbol = app_order_value_currency_symbol;
	}
	public boolean isApp_order_street_street_number() {
		return app_order_street_street_number;
	}
	public void setApp_order_street_street_number(boolean app_order_street_street_number) {
		this.app_order_street_street_number = app_order_street_street_number;
	}
	public boolean isApp_order_zip_city() {
		return app_order_zip_city;
	}
	public void setApp_order_zip_city(boolean app_order_zip_city) {
		this.app_order_zip_city = app_order_zip_city;
	}
	public boolean isApp_landing_page_enabled() {
		return app_landing_page_enabled;
	}
	public void setApp_landing_page_enabled(boolean app_landing_page_enabled) {
		this.app_landing_page_enabled = app_landing_page_enabled;
	}
	public long getApp_number_of_top_cities() {
		return app_number_of_top_cities;
	}
	public void setApp_number_of_top_cities(long app_number_of_top_cities) {
		this.app_number_of_top_cities = app_number_of_top_cities;
	}
	public String getApp_media_plex_id() {
		return app_media_plex_id;
	}
	public void setApp_media_plex_id(String app_media_plex_id) {
		this.app_media_plex_id = app_media_plex_id;
	}
	public String getApp_zone() {
		return app_zone;
	}
	public void setApp_zone(String app_zone) {
		this.app_zone = app_zone;
	}
	public Double[] getApp_tax_rate() {
		return app_tax_rate;
	}
	public void setApp_tax_rate(Double[] app_tax_rate) {
		this.app_tax_rate = app_tax_rate;
	}
	public boolean isApp_delay_capturing() {
		return app_delay_capturing;
	}
	public void setApp_delay_capturing(boolean app_delay_capturing) {
		this.app_delay_capturing = app_delay_capturing;
	}
	public boolean isApp_nsoq_create_enabled() {
		return app_nsoq_create_enabled;
	}
	public void setApp_nsoq_create_enabled(boolean app_nsoq_create_enabled) {
		this.app_nsoq_create_enabled = app_nsoq_create_enabled;
	}






}
