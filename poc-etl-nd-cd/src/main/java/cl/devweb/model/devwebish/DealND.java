package cl.devweb.model.devwebish;

import cl.devweb.model.citydeal.MerchantCD;
import cl.devweb.model.devwebish.enums.CountryEnum;

public class DealND {

    private Deal deal;
    private User user;
    private DealExtraData dealextradata;
    private CountryEnum country;
    private Coupon coupon;
    private Regiones regions;
    private DealAddress dealaddress;
    private DealDescription dealdescription;
    private Company company;
    private NumMigratedImages image;
    private CityPivot citypivot;
    private Tags tags;
    private CityDealsPivot citydealspivot;
    private MerchantCD merchantcd;


	public Deal getDeal() {
		return deal;
	}
	public void setDeal(Deal deal) {
		this.deal = deal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DealExtraData getDealextradata() {
		return dealextradata;
	}
	public void setDealextradata(DealExtraData dealextradata) {
		this.dealextradata = dealextradata;
	}
	public CountryEnum getCountry() {
		return country;
	}
	public void setCountry(CountryEnum country) {
		this.country = country;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Regiones getRegions() {
		return regions;
	}
	public void setRegions(Regiones regions) {
		this.regions = regions;
	}
	public DealAddress getDealaddress() {
		return dealaddress;
	}
	public void setDealaddress(DealAddress dealaddress) {
		this.dealaddress = dealaddress;
	}
	public DealDescription getDealdescription() {
		return dealdescription;
	}
	public void setDealdescription(DealDescription dealdescription) {
		this.dealdescription = dealdescription;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public NumMigratedImages getImage() {
		return image;
	}
	public void setImage(NumMigratedImages image) {
		this.image = image;
	}
	public CityPivot getCitypivot() {
		return citypivot;
	}
	public void setCitypivot(CityPivot citypivot) {
		this.citypivot = citypivot;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	public CityDealsPivot getCitydealspivot() {
		return citydealspivot;
	}
	public void setCitydealspivot(CityDealsPivot citydealspivot) {
		this.citydealspivot = citydealspivot;
	}
	public MerchantCD getMerchantcd() {
		return merchantcd;
	}
	public void setMerchantcd(MerchantCD merchantcd) {
		this.merchantcd = merchantcd;
	}


}

