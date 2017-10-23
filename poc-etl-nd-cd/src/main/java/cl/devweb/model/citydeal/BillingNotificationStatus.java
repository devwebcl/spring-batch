package cl.devweb.model.citydeal;


public enum BillingNotificationStatus {

	INITIATED (0),
	SENT_PAYMENT_FAILED (1),
	SENT_DEAL_FAILED (2),
	SENT_VOUCHER (3),
	SENT_EXPIRATION_REMINDER (4);


    private final int value;

    private BillingNotificationStatus(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
