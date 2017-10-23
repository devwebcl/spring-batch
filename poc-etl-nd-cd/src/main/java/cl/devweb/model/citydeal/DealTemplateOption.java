package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

import org.postgresql.util.PGInterval;


public class DealTemplateOption {

     private int dto_id;
     private Date dto_created;
     private Date dto_last_modified;
     private Integer dto_dtp_id;
     private int dto_dtpc_id;
     private String dto_salesforce_id;
     private Integer dto_dm_id;
     private Integer dto_vde_id;
     private String dto_voucher_pool_id;
     private Date dto_coupon_valid_from;
     private Date dto_coupon_valid_until;
     private Long dto_price_original_gross;
     private Long dto_price_special_gross;
     private Long dto_price_special_tax;
     private int dto_participant_minimum;
     private Integer dto_participant_maximum;
     private Integer dto_buy_limit_per_user;
     private short dto_coupon_how_it_works;
     private boolean dto_voucher_send_by_sms;
     private Short dto_app_id;
     private Boolean dto_voucher_expiration_reminder_blacklisted;
     private UUID dto_guid;
     private PGInterval dto_expiration_period;


	public int getDto_id() {
		return dto_id;
	}
	public void setDto_id(int dto_id) {
		this.dto_id = dto_id;
	}
	public Date getDto_created() {
		return dto_created;
	}
	public void setDto_created(Date dto_created) {
		this.dto_created = dto_created;
	}
	public Date getDto_last_modified() {
		return dto_last_modified;
	}
	public void setDto_last_modified(Date dto_last_modified) {
		this.dto_last_modified = dto_last_modified;
	}
	public Integer getDto_dtp_id() {
		return dto_dtp_id;
	}
	public void setDto_dtp_id(Integer dto_dtp_id) {
		this.dto_dtp_id = dto_dtp_id;
	}
	public int getDto_dtpc_id() {
		return dto_dtpc_id;
	}
	public void setDto_dtpc_id(int dto_dtpc_id) {
		this.dto_dtpc_id = dto_dtpc_id;
	}
	public String getDto_salesforce_id() {
		return dto_salesforce_id;
	}
	public void setDto_salesforce_id(String dto_salesforce_id) {
		this.dto_salesforce_id = dto_salesforce_id;
	}
	public Integer getDto_dm_id() {
		return dto_dm_id;
	}
	public void setDto_dm_id(Integer dto_dm_id) {
		this.dto_dm_id = dto_dm_id;
	}
	public Integer getDto_vde_id() {
		return dto_vde_id;
	}
	public void setDto_vde_id(Integer dto_vde_id) {
		this.dto_vde_id = dto_vde_id;
	}
	public String getDto_voucher_pool_id() {
		return dto_voucher_pool_id;
	}
	public void setDto_voucher_pool_id(String dto_voucher_pool_id) {
		this.dto_voucher_pool_id = dto_voucher_pool_id;
	}
	public Date getDto_coupon_valid_from() {
		return dto_coupon_valid_from;
	}
	public void setDto_coupon_valid_from(Date dto_coupon_valid_from) {
		this.dto_coupon_valid_from = dto_coupon_valid_from;
	}
	public Date getDto_coupon_valid_until() {
		return dto_coupon_valid_until;
	}
	public void setDto_coupon_valid_until(Date dto_coupon_valid_until) {
		this.dto_coupon_valid_until = dto_coupon_valid_until;
	}
	public Long getDto_price_original_gross() {
		return dto_price_original_gross;
	}
	public void setDto_price_original_gross(Long dto_price_original_gross) {
		this.dto_price_original_gross = dto_price_original_gross;
	}
	public Long getDto_price_special_gross() {
		return dto_price_special_gross;
	}
	public void setDto_price_special_gross(Long dto_price_special_gross) {
		this.dto_price_special_gross = dto_price_special_gross;
	}
	public Long getDto_price_special_tax() {
		return dto_price_special_tax;
	}
	public void setDto_price_special_tax(Long dto_price_special_tax) {
		this.dto_price_special_tax = dto_price_special_tax;
	}
	public int getDto_participant_minimum() {
		return dto_participant_minimum;
	}
	public void setDto_participant_minimum(int dto_participant_minimum) {
		this.dto_participant_minimum = dto_participant_minimum;
	}
	public Integer getDto_participant_maximum() {
		return dto_participant_maximum;
	}
	public void setDto_participant_maximum(Integer dto_participant_maximum) {
		this.dto_participant_maximum = dto_participant_maximum;
	}
	public Integer getDto_buy_limit_per_user() {
		return dto_buy_limit_per_user;
	}
	public void setDto_buy_limit_per_user(Integer dto_buy_limit_per_user) {
		this.dto_buy_limit_per_user = dto_buy_limit_per_user;
	}
	public short getDto_coupon_how_it_works() {
		return dto_coupon_how_it_works;
	}
	public void setDto_coupon_how_it_works(short dto_coupon_how_it_works) {
		this.dto_coupon_how_it_works = dto_coupon_how_it_works;
	}
	public boolean isDto_voucher_send_by_sms() {
		return dto_voucher_send_by_sms;
	}
	public void setDto_voucher_send_by_sms(boolean dto_voucher_send_by_sms) {
		this.dto_voucher_send_by_sms = dto_voucher_send_by_sms;
	}
	public Short getDto_app_id() {
		return dto_app_id;
	}
	public void setDto_app_id(Short dto_app_id) {
		this.dto_app_id = dto_app_id;
	}
	public Boolean getDto_voucher_expiration_reminder_blacklisted() {
		return dto_voucher_expiration_reminder_blacklisted;
	}
	public void setDto_voucher_expiration_reminder_blacklisted(Boolean dto_voucher_expiration_reminder_blacklisted) {
		this.dto_voucher_expiration_reminder_blacklisted = dto_voucher_expiration_reminder_blacklisted;
	}
	public UUID getDto_guid() {
		return dto_guid;
	}
	public void setDto_guid(UUID dto_guid) {
		this.dto_guid = dto_guid;
	}
	public PGInterval getDto_expiration_period() {
		return dto_expiration_period;
	}
	public void setDto_expiration_period(PGInterval dto_expiration_period) {
		this.dto_expiration_period = dto_expiration_period;
	}






}


