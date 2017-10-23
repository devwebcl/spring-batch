package cl.devweb.model.citydeal;

public class MerchantCD {
    
    private String operation;
    private long n_company_id;
    private DealMerchant dm;
    private DealMerchantRedemptionLocation dmrl;
    
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getN_company_id() {
        return n_company_id;
    }

    public void setN_company_id(long n_company_id) {
        this.n_company_id = n_company_id;
    }

    public DealMerchant getDm() {
        return dm;
    }

    public void setDm(DealMerchant dm) {
        this.dm = dm;
    }

    public DealMerchantRedemptionLocation getDmrl() {
        return dmrl;
    }

    public void setDmrl(DealMerchantRedemptionLocation dmrl) {
        this.dmrl = dmrl;
    }

}
