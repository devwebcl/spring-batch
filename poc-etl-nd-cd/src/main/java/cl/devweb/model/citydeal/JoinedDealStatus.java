package cl.devweb.model.citydeal;


public enum JoinedDealStatus {

	DEAL_ACCESS_INITATED (0),
	DEAL_ACCESS_GRANTED (1),
	DEAL_ACCESS_DENIED (2),
	DEAL_ACCESS_GRANTED_VIA_EMAIL (3),
	DEAL_FAILED_NOTIFICATION_VIA_EMAIL (4),
	DEAL_REJECTED_REASON_FAILED_PAYMENT_VIA_EMAIL (5),
	DEAL_DELETED (99);


    private final int value;

    private JoinedDealStatus(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
