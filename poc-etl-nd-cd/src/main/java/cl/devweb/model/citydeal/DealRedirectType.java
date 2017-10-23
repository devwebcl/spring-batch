package cl.devweb.model.citydeal;


public enum DealRedirectType {

	OFF(0),
	CITY(1),
	URL(2);

    private final int value;

    private DealRedirectType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
