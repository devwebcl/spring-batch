package cl.devweb.model.devwebish;

public class CityDealsPivot {

	private long nd_deals_id;
	private long cd_id;
	private boolean cd_mulligan_enabled;
	private long cd_mulligan_parent;
	private long cd_appdomain_id;

	public long getNd_deals_id() {
		return nd_deals_id;
	}

	public void setNd_deals_id(long nd_deals_id) {
		this.nd_deals_id = nd_deals_id;
	}

	public long getCd_id() {
		return cd_id;
	}

	public void setCd_id(long cd_id) {
		this.cd_id = cd_id;
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

	public long getCd_appdomain_id() {
		return cd_appdomain_id;
	}

	public void setCd_appdomain_id(long cd_appdomain_id) {
		this.cd_appdomain_id = cd_appdomain_id;
	}


}
