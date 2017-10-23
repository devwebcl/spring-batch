package cl.devweb.model.citydeal;

import java.util.Date;


public class DealPurchaseControl {


	private int dpc_id;
	private Date dpc_created;
	private Date dpc_last_modified;
	private int dpc_dtpc_id;
	private int dpc_participant_maximum;
	private int dpc_buy_limit_per_user;
	private int dpc_participant_current;
	private int dpc_app_id;
	private int dpc_voucher_codes_per_unit;

	public int getDpc_id() {
		return dpc_id;
	}

	public void setDpc_id(int dpc_id) {
		this.dpc_id = dpc_id;
	}

	public Date getDpc_created() {
		return dpc_created;
	}

	public void setDpc_created(Date dpc_created) {
		this.dpc_created = dpc_created;
	}

	public Date getDpc_last_modified() {
		return dpc_last_modified;
	}

	public void setDpc_last_modified(Date dpc_last_modified) {
		this.dpc_last_modified = dpc_last_modified;
	}

	public int getDpc_dtpc_id() {
		return dpc_dtpc_id;
	}

	public void setDpc_dtpc_id(int dpc_dtpc_id) {
		this.dpc_dtpc_id = dpc_dtpc_id;
	}

	public int getDpc_participant_maximum() {
		return dpc_participant_maximum;
	}

	public void setDpc_participant_maximum(int dpc_participant_maximum) {
		this.dpc_participant_maximum = dpc_participant_maximum;
	}

	public int getDpc_buy_limit_per_user() {
		return dpc_buy_limit_per_user;
	}

	public void setDpc_buy_limit_per_user(int dpc_buy_limit_per_user) {
		this.dpc_buy_limit_per_user = dpc_buy_limit_per_user;
	}

	public int getDpc_participant_current() {
		return dpc_participant_current;
	}

	public void setDpc_participant_current(int dpc_participant_current) {
		this.dpc_participant_current = dpc_participant_current;
	}

	public int getDpc_app_id() {
		return dpc_app_id;
	}

	public void setDpc_app_id(int dpc_app_id) {
		this.dpc_app_id = dpc_app_id;
	}

	public int getDpc_voucher_codes_per_unit() {
		return dpc_voucher_codes_per_unit;
	}

	public void setDpc_voucher_codes_per_unit(int dpc_voucher_codes_per_unit) {
		this.dpc_voucher_codes_per_unit = dpc_voucher_codes_per_unit;
	}

}


