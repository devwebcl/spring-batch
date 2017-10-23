package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;


public class DealTemplate {

	private long dtp_id;
	private Date dtp_created;
	private Date dtp_last_modified;
	private long dtp_status_id;
	private long dtp_app_id;
	private long dtp_dtpc_id;
	private String dtp_salesforce_id;
	private long dtp_dm_id;
	private String dtp_voucher_pool_id;
	private String dtp_deal_class;
	private long dtp_participant_minimum;
	private long dtp_participant_maximum;
	private long dtp_buy_limit_per_user;
	private String dtp_image_large;
	private String dtp_image_medium;
	private String dtp_image_small;
	private String dtp_image_extra_small;
	private long dtp_dealbank_runtime_days;
	private UUID dtp_guid;
	private boolean dtp_mulligan_enabled;
	private boolean dtp_is_dsc;

	public long getDtp_id() {
		return dtp_id;
	}

	public void setDtp_id(long dtp_id) {
		this.dtp_id = dtp_id;
	}

	public Date getDtp_created() {
		return dtp_created;
	}

	public void setDtp_created(Date dtp_created) {
		this.dtp_created = dtp_created;
	}

	public Date getDtp_last_modified() {
		return dtp_last_modified;
	}

	public void setDtp_last_modified(Date dtp_last_modified) {
		this.dtp_last_modified = dtp_last_modified;
	}

	public long getDtp_status_id() {
		return dtp_status_id;
	}

	public void setDtp_status_id(long dtp_status_id) {
		this.dtp_status_id = dtp_status_id;
	}

	public long getDtp_app_id() {
		return dtp_app_id;
	}

	public void setDtp_app_id(long dtp_app_id) {
		this.dtp_app_id = dtp_app_id;
	}

	public long getDtp_dtpc_id() {
		return dtp_dtpc_id;
	}

	public void setDtp_dtpc_id(long dtp_dtpc_id) {
		this.dtp_dtpc_id = dtp_dtpc_id;
	}

	public String getDtp_salesforce_id() {
		return dtp_salesforce_id;
	}

	public void setDtp_salesforce_id(String dtp_salesforce_id) {
		this.dtp_salesforce_id = dtp_salesforce_id;
	}

	public long getDtp_dm_id() {
		return dtp_dm_id;
	}

	public void setDtp_dm_id(long dtp_dm_id) {
		this.dtp_dm_id = dtp_dm_id;
	}

	public String getDtp_voucher_pool_id() {
		return dtp_voucher_pool_id;
	}

	public void setDtp_voucher_pool_id(String dtp_voucher_pool_id) {
		this.dtp_voucher_pool_id = dtp_voucher_pool_id;
	}

	public String getDtp_deal_class() {
		return dtp_deal_class;
	}

	public void setDtp_deal_class(String dtp_deal_class) {
		this.dtp_deal_class = dtp_deal_class;
	}

	public long getDtp_participant_minimum() {
		return dtp_participant_minimum;
	}

	public void setDtp_participant_minimum(long dtp_participant_minimum) {
		this.dtp_participant_minimum = dtp_participant_minimum;
	}

	public long getDtp_participant_maximum() {
		return dtp_participant_maximum;
	}

	public void setDtp_participant_maximum(long dtp_participant_maximum) {
		this.dtp_participant_maximum = dtp_participant_maximum;
	}

	public long getDtp_buy_limit_per_user() {
		return dtp_buy_limit_per_user;
	}

	public void setDtp_buy_limit_per_user(long dtp_buy_limit_per_user) {
		this.dtp_buy_limit_per_user = dtp_buy_limit_per_user;
	}

	public String getDtp_image_large() {
		return dtp_image_large;
	}

	public void setDtp_image_large(String dtp_image_large) {
		this.dtp_image_large = dtp_image_large;
	}

	public String getDtp_image_medium() {
		return dtp_image_medium;
	}

	public void setDtp_image_medium(String dtp_image_medium) {
		this.dtp_image_medium = dtp_image_medium;
	}

	public String getDtp_image_small() {
		return dtp_image_small;
	}

	public void setDtp_image_small(String dtp_image_small) {
		this.dtp_image_small = dtp_image_small;
	}

	public String getDtp_image_extra_small() {
		return dtp_image_extra_small;
	}

	public void setDtp_image_extra_small(String dtp_image_extra_small) {
		this.dtp_image_extra_small = dtp_image_extra_small;
	}

	public long getDtp_dealbank_runtime_days() {
		return dtp_dealbank_runtime_days;
	}

	public void setDtp_dealbank_runtime_days(long dtp_dealbank_runtime_days) {
		this.dtp_dealbank_runtime_days = dtp_dealbank_runtime_days;
	}

	public UUID getDtp_guid() {
		return dtp_guid;
	}

	public void setDtp_guid(UUID dtp_guid) {
		this.dtp_guid = dtp_guid;
	}

	public boolean isDtp_mulligan_enabled() {
		return dtp_mulligan_enabled;
	}

	public void setDtp_mulligan_enabled(boolean dtp_mulligan_enabled) {
		this.dtp_mulligan_enabled = dtp_mulligan_enabled;
	}

	public boolean isDtp_is_dsc() {
		return dtp_is_dsc;
	}

	public void setDtp_is_dsc(boolean dtp_is_dsc) {
		this.dtp_is_dsc = dtp_is_dsc;
	}

}


