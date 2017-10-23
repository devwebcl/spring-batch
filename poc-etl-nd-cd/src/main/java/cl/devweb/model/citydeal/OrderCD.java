package cl.devweb.model.citydeal;

public class OrderCD {

    //using small names for query in XML keep readable :)
    private BillingAttribute ba;
    private UsersBillingHistory ubh;
    private UsersJoinedDeals ujd;
    private BillingIncentive bi;
    private RefundReason rr;

    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UsersJoinedDeals getUjd() {
        return ujd;
    }

    public void setUjd(UsersJoinedDeals ujd) {
        this.ujd = ujd;
    }

    public BillingAttribute getBa() {
        return ba;
    }

    public void setBa(BillingAttribute ba) {
        this.ba = ba;
    }

    public UsersBillingHistory getUbh() {
        return ubh;
    }

    public void setUbh(UsersBillingHistory ubh) {
        this.ubh = ubh;
    }

    public BillingIncentive getBi() {
        return bi;
    }

    public void setBi(BillingIncentive bi) {
        this.bi = bi;
    }

    public RefundReason getRr() {
        return rr;
    }

    public void setRr(RefundReason rr) {
        this.rr = rr;
    }
    
}
