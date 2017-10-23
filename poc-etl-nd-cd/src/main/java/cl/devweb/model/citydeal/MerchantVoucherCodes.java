package cl.devweb.model.citydeal;

import java.util.Date;


public class MerchantVoucherCodes {


     private long mvc_id;
     private Integer mvc_cd_id;
     private String mvc_code;
     private String mvc_pool_id;
     private Date mvc_created;
     private Date mvc_last_modified;


	public long getMvc_id() {
		return mvc_id;
	}
	public void setMvc_id(long mvc_id) {
		this.mvc_id = mvc_id;
	}
	public Integer getMvc_cd_id() {
		return mvc_cd_id;
	}
	public void setMvc_cd_id(Integer mvc_cd_id) {
		this.mvc_cd_id = mvc_cd_id;
	}
	public String getMvc_code() {
		return mvc_code;
	}
	public void setMvc_code(String mvc_code) {
		this.mvc_code = mvc_code;
	}
	public String getMvc_pool_id() {
		return mvc_pool_id;
	}
	public void setMvc_pool_id(String mvc_pool_id) {
		this.mvc_pool_id = mvc_pool_id;
	}
	public Date getMvc_created() {
		return mvc_created;
	}
	public void setMvc_created(Date mvc_created) {
		this.mvc_created = mvc_created;
	}
	public Date getMvc_last_modified() {
		return mvc_last_modified;
	}
	public void setMvc_last_modified(Date mvc_last_modified) {
		this.mvc_last_modified = mvc_last_modified;
	}





}


