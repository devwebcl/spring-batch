package cl.devweb.model;

//it can be done automatically

public class Users_billing_history {

	int ubh_id;
	String ubh_created;
	String ubh_user_id;
	String ubh_payment_provider_id; 
	String ubh_chargeback_reason;
	
	
	
	public int getUbh_id() {
		return ubh_id;
	}

	public void setUbh_id(int ubh_id) {
		this.ubh_id = ubh_id;
	}	
	
	public String getUbh_created() {
		return ubh_created;
	}
	
	public void setUbh_created(String ubh_created) {
		this.ubh_created = ubh_created;
	}
	
	public String getUbh_user_id() {
		return ubh_user_id;
	}
	
	public void setUbh_user_id(String ubh_user_id) {
		this.ubh_user_id = ubh_user_id;
	}
	
	public String getUbh_payment_provider_id() {
		return ubh_payment_provider_id;
	}
	
	public void setUbh_payment_provider_id(String ubh_payment_provider_id) {
		this.ubh_payment_provider_id = ubh_payment_provider_id;
	}
	
	public String getUbh_chargeback_reason() {
		return ubh_chargeback_reason;
	}
	
	public void setUbh_chargeback_reason(String ubh_chargeback_reason) {
		this.ubh_chargeback_reason = ubh_chargeback_reason;
	}


}
