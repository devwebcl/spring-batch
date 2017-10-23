package cl.devweb.model.devwebish;

import cl.devweb.model.devwebish.enums.CountryEnum;

public class OrderND {

    private Deal deal;
    private Payment payment;
    private CityDealsPivot citydealPivot;
    private UserPivot user;
    private DealExtraData dealExtraData;
    private CountryEnum country;
    private PaymentIncentive paymentIncentive;
    private TrackingPayment trackingPayment;
    private Coupon coupon;
    private CouponInvalidationReason couponInvalidationReason;

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public TrackingPayment getTrackingPayment() {
        return trackingPayment;
    }

    public void setTrackingPayment(TrackingPayment trackingpayment) {
        this.trackingPayment = trackingpayment;
    }

    public CityDealsPivot getCitydealPivot() {
        return citydealPivot;
    }

    public void setCitydealPivot(CityDealsPivot citydealPivot) {
        this.citydealPivot = citydealPivot;
    }

    public UserPivot getUser() {
        return user;
    }

    public void setUser(UserPivot user) {
        this.user = user;
    }

    public DealExtraData getDealExtraData() {
        return dealExtraData;
    }

    public void setDealExtraData(DealExtraData dealExtraData) {
        this.dealExtraData = dealExtraData;
    }

    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    public PaymentIncentive getPaymentIncentive() {
        return paymentIncentive;
    }

    public void setPaymentIncentive(PaymentIncentive paymentIncentive) {
        this.paymentIncentive = paymentIncentive;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public CouponInvalidationReason getCouponInvalidationReason() {
        return couponInvalidationReason;
    }

    public void setCouponInvalidationReason(CouponInvalidationReason couponInvalidationReason) {
        this.couponInvalidationReason = couponInvalidationReason;
    }
    
}
