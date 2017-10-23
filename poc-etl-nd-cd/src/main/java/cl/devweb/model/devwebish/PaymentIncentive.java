package cl.devweb.model.devwebish;

public class PaymentIncentive {

    private long id;
    private long payment_id;
    private long coupon_id;
    private double amount;
    private long incentive_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    public long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getIncentive_id() {
        return incentive_id;
    }

    public void setIncentive_id(long incentive_id) {
        this.incentive_id = incentive_id;
    }

}
