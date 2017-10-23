package cl.devweb.model.devwebish;

public enum PaymentStatus {

    FAILED("FAILED"),
    FUNDS_CAPTURED("FUNDS_CAPTURED"),
    PENDING("PENDING"),
    REJECTED("REJECTED"),
    SENT("SENT"),
    SECURITY_TEST("SECURITY_TEST");

    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
