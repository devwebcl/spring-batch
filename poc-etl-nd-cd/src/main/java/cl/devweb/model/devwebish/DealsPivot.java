package cl.devweb.model.devwebish;

import cl.devweb.model.devwebish.enums.DealPivotType;

public class DealsPivot {

	private long id;
	private DealPivotType type;
	private long nd_deals_id;
	private long cd_gen_id; // generic id

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DealPivotType getType() {
		return type;
	}

	public void setType(DealPivotType type) {
		this.type = type;
	}

	public long getNd_deals_id() {
		return nd_deals_id;
	}

	public void setNd_deals_id(long nd_deals_id) {
		this.nd_deals_id = nd_deals_id;
	}

	public long getCd_gen_id() {
		return cd_gen_id;
	}

	public void setCd_gen_id(long cd_gen_id) {
		this.cd_gen_id = cd_gen_id;
	}



}

