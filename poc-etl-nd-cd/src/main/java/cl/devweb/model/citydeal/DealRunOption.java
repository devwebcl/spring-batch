package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

import org.postgresql.util.PGInterval;


public class DealRunOption {


     private int dro_id;
     private Date dro_created;
     private Date dro_last_modified;
     private int dro_dr_id;
     private int dro_dto_id;
     private Integer dro_cd_id;
     private Date dro_coupon_valid_from;
     private Date dro_coupon_valid_until;
     private Integer dro_participant_minimum;
     private Integer dro_participant_maximum;
     private Integer dro_buy_limit_per_user;
     private Integer dro_dm_id;
     private Short dro_app_id;
     private String dro_salesforce_scheduling_detail_id;
     private String dro_salesforce_scheduling_detail_name;
     private UUID dro_guid;
     private PGInterval dro_expiration_period;


	public int getDro_id() {
		return dro_id;
	}
	public void setDro_id(int dro_id) {
		this.dro_id = dro_id;
	}
	public Date getDro_created() {
		return dro_created;
	}
	public void setDro_created(Date dro_created) {
		this.dro_created = dro_created;
	}
	public Date getDro_last_modified() {
		return dro_last_modified;
	}
	public void setDro_last_modified(Date dro_last_modified) {
		this.dro_last_modified = dro_last_modified;
	}
	public int getDro_dr_id() {
		return dro_dr_id;
	}
	public void setDro_dr_id(int dro_dr_id) {
		this.dro_dr_id = dro_dr_id;
	}
	public int getDro_dto_id() {
		return dro_dto_id;
	}
	public void setDro_dto_id(int dro_dto_id) {
		this.dro_dto_id = dro_dto_id;
	}
	public Integer getDro_cd_id() {
		return dro_cd_id;
	}
	public void setDro_cd_id(Integer dro_cd_id) {
		this.dro_cd_id = dro_cd_id;
	}
	public Date getDro_coupon_valid_from() {
		return dro_coupon_valid_from;
	}
	public void setDro_coupon_valid_from(Date dro_coupon_valid_from) {
		this.dro_coupon_valid_from = dro_coupon_valid_from;
	}
	public Date getDro_coupon_valid_until() {
		return dro_coupon_valid_until;
	}
	public void setDro_coupon_valid_until(Date dro_coupon_valid_until) {
		this.dro_coupon_valid_until = dro_coupon_valid_until;
	}
	public Integer getDro_participant_minimum() {
		return dro_participant_minimum;
	}
	public void setDro_participant_minimum(Integer dro_participant_minimum) {
		this.dro_participant_minimum = dro_participant_minimum;
	}
	public Integer getDro_participant_maximum() {
		return dro_participant_maximum;
	}
	public void setDro_participant_maximum(Integer dro_participant_maximum) {
		this.dro_participant_maximum = dro_participant_maximum;
	}
	public Integer getDro_buy_limit_per_user() {
		return dro_buy_limit_per_user;
	}
	public void setDro_buy_limit_per_user(Integer dro_buy_limit_per_user) {
		this.dro_buy_limit_per_user = dro_buy_limit_per_user;
	}
	public Integer getDro_dm_id() {
		return dro_dm_id;
	}
	public void setDro_dm_id(Integer dro_dm_id) {
		this.dro_dm_id = dro_dm_id;
	}
	public Short getDro_app_id() {
		return dro_app_id;
	}
	public void setDro_app_id(Short dro_app_id) {
		this.dro_app_id = dro_app_id;
	}
	public String getDro_salesforce_scheduling_detail_id() {
		return dro_salesforce_scheduling_detail_id;
	}
	public void setDro_salesforce_scheduling_detail_id(String dro_salesforce_scheduling_detail_id) {
		this.dro_salesforce_scheduling_detail_id = dro_salesforce_scheduling_detail_id;
	}
	public String getDro_salesforce_scheduling_detail_name() {
		return dro_salesforce_scheduling_detail_name;
	}
	public void setDro_salesforce_scheduling_detail_name(String dro_salesforce_scheduling_detail_name) {
		this.dro_salesforce_scheduling_detail_name = dro_salesforce_scheduling_detail_name;
	}
	public UUID getDro_guid() {
		return dro_guid;
	}
	public void setDro_guid(UUID dro_guid) {
		this.dro_guid = dro_guid;
	}
	public PGInterval getDro_expiration_period() {
		return dro_expiration_period;
	}
	public void setDro_expiration_period(PGInterval dro_expiration_period) {
		this.dro_expiration_period = dro_expiration_period;
	}





}


