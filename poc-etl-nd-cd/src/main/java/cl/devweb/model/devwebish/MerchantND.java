package cl.devweb.model.devwebish;

public class MerchantND {
    
    private Company company;
    private DealAddress dealAddress;
    private Deal deal;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public DealAddress getDealAddress() {
        return dealAddress;
    }

    public void setDealAddress(DealAddress dealAddress) {
        this.dealAddress = dealAddress;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }
    
}
