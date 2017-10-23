package cl.devweb.model.base;

import cl.devweb.model.citydeal.DealTemplate;
import cl.devweb.model.devwebish.DealsPivot;


// it could become "DealBaseDTO"
public class DealTemplateBaseDTO {

	DealsPivot dealspivot;
	DealTemplate dt;


	public DealsPivot getDealspivot() {
		return dealspivot;
	}
	public void setDealspivot(DealsPivot dealspivot) {
		this.dealspivot = dealspivot;
	}
	public DealTemplate getDt() {
		return dt;
	}
	public void setDt(DealTemplate dt) {
		this.dt = dt;
	}


}

