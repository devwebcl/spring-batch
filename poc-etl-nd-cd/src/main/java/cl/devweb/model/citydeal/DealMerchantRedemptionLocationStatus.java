package cl.devweb.model.citydeal;


public enum DealMerchantRedemptionLocationStatus {

	ACTIVE(0),
	DELETED(99);

	private final int value;

	private DealMerchantRedemptionLocationStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

}
