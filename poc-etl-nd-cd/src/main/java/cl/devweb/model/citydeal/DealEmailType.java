package cl.devweb.model.citydeal;

public enum DealEmailType {

	ONLINE_VOUCHER (1),
	OFFLINE_VOUCHER (2),
	BIG_ONLINE_VOUCHER (3),
	OFFLINE_VOUCHER_APPOINTMENT (4),  // "NO LONGER SUPPORTED OFFLINE_VOUCHER_APPOINTMENT" in UAT
	MERCHANT_ONLINE_VOUCHER (5),
	GENERATED (6);


   private final int value;

    private DealEmailType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
