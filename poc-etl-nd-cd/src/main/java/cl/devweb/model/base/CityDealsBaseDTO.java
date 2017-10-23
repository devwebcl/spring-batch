package cl.devweb.model.base;

import cl.devweb.model.citydeal.CityDeals;
import cl.devweb.model.devwebish.CityDealsPivot;


public class CityDealsBaseDTO {

	CityDealsPivot citydealspivot;
	CityDeals citydeals;


	public CityDealsPivot getCitydealspivot() {
		return citydealspivot;
	}
	public void setCitydealspivot(CityDealsPivot citydealspivot) {
		this.citydealspivot = citydealspivot;
	}
	public CityDeals getCitydeals() {
		return citydeals;
	}
	public void setCitydeals(CityDeals citydeals) {
		this.citydeals = citydeals;
	}


}
