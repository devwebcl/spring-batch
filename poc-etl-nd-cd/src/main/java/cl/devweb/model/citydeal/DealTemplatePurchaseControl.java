package cl.devweb.model.citydeal;

import java.util.Date;


public class DealTemplatePurchaseControl {


	private int dtpc_id;
	private Date dtpc_created;
	private Date dtpc_last_modified;
	private int dtpc_participant_maximum;
	private int dtpc_buy_limit_per_user;
	private int dtpc_app_id;
	private int dtpc_voucher_codes_per_unit;

	public int getDtpc_id() {
		return dtpc_id;
	}

	public void setDtpc_id(int dtpc_id) {
		this.dtpc_id = dtpc_id;
	}

	public Date getDtpc_created() {
		return dtpc_created;
	}

	public void setDtpc_created(Date dtpc_created) {
		this.dtpc_created = dtpc_created;
	}

	public Date getDtpc_last_modified() {
		return dtpc_last_modified;
	}

	public void setDtpc_last_modified(Date dtpc_last_modified) {
		this.dtpc_last_modified = dtpc_last_modified;
	}

	public int getDtpc_participant_maximum() {
		return dtpc_participant_maximum;
	}

	public void setDtpc_participant_maximum(int dtpc_participant_maximum) {
		this.dtpc_participant_maximum = dtpc_participant_maximum;
	}

	public int getDtpc_buy_limit_per_user() {
		return dtpc_buy_limit_per_user;
	}

	public void setDtpc_buy_limit_per_user(int dtpc_buy_limit_per_user) {
		this.dtpc_buy_limit_per_user = dtpc_buy_limit_per_user;
	}

	public int getDtpc_app_id() {
		return dtpc_app_id;
	}

	public void setDtpc_app_id(int dtpc_app_id) {
		this.dtpc_app_id = dtpc_app_id;
	}

	public int getDtpc_voucher_codes_per_unit() {
		return dtpc_voucher_codes_per_unit;
	}

	public void setDtpc_voucher_codes_per_unit(int dtpc_voucher_codes_per_unit) {
		this.dtpc_voucher_codes_per_unit = dtpc_voucher_codes_per_unit;
	}


}


