package cl.devweb.model.devwebish;

import java.util.Date;

public class Reward {

    private long id;
    private long dealId;
    private long userId;
    private long paymentId;
    private long currencyId;
    private long campaignId;
    private long amount;
    private long rewardAmount;
    private Date created;
    private Date assigned;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDealId() {
        return dealId;
    }

    public void setDealId(long dealId) {
        this.dealId = dealId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(long rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getAssigned() {
        return assigned;
    }

    public void setAssigned(Date assigned) {
        this.assigned = assigned;
    }

}
