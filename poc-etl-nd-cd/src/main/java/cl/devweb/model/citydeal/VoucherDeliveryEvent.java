package cl.devweb.model.citydeal;

public enum VoucherDeliveryEvent {


	PAYMENT_SUCCESS (1),
	DEAL_CLOSED (2);


    private final int value;

    private VoucherDeliveryEvent(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}


