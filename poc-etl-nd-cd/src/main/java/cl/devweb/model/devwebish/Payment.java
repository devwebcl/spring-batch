package cl.devweb.model.devwebish;

import java.util.Date;

public class Payment {

    private long id;
    private String hash;
    private long user_id;
    private long deal_id;
    private double amount;
    private double credits;
    private String status;
    private Date created;
    private Date modified;
    private String description;
    private Date expires;
    private String final_response;
    private long currency_id;
    private String currency_code;
    private String payment_type;
    private String last_status;
    private long ended;
    private String server;
    private String source;
    private String atrk;
    private boolean tbkinfo_imported;
    private String lanpass_id;
    private String ip_address;
    private long stock_id;



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getDeal_id() {
		return deal_id;
	}
	public void setDeal_id(long deal_id) {
		this.deal_id = deal_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getExpires() {
		return expires;
	}
	public void setExpires(Date expires) {
		this.expires = expires;
	}
	public String getFinal_response() {
		return final_response;
	}
	public void setFinal_response(String final_response) {
		this.final_response = final_response;
	}
	public long getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(long currency_id) {
		this.currency_id = currency_id;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getLast_status() {
		return last_status;
	}
	public void setLast_status(String last_status) {
		this.last_status = last_status;
	}
	public long getEnded() {
		return ended;
	}
	public void setEnded(long ended) {
		this.ended = ended;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAtrk() {
		return atrk;
	}
	public void setAtrk(String atrk) {
		this.atrk = atrk;
	}
	public boolean isTbkinfo_imported() {
		return tbkinfo_imported;
	}
	public void setTbkinfo_imported(boolean tbkinfo_imported) {
		this.tbkinfo_imported = tbkinfo_imported;
	}
	public String getLanpass_id() {
		return lanpass_id;
	}
	public void setLanpass_id(String lanpass_id) {
		this.lanpass_id = lanpass_id;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public long getStock_id() {
		return stock_id;
	}
	public void setStock_id(long stock_id) {
		this.stock_id = stock_id;
	}



}
