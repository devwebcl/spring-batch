package cl.devweb.model.citydeal;

/*CREATE VIEW billing_transaction_state AS
 SELECT user_billing_transaction_status.ubhs_id AS bhs_id,
 user_billing_transaction_status.ubhs_info AS bhs_info,
 user_billing_transaction_status.ubhs_created AS bhs_created,
 user_billing_transaction_status.ubhs_last_modified AS bhs_last_modified
 FROM user_billing_transaction_status;
 */
public enum BillingTransactionState {

    INITIATED(0),
    RECEIVED(1),
    AUTHORIZED(2),
    REFUSED(3),
    CANCELLED(4),
    REFUNDED(5),
    SETTLED(6),
    EXPIRED(7),
    SENT_FOR_SETTLE(8),
    CHARGEBACK(9),
    SETTLED_AFTER_CHARGEBACK(10),
    CHARGEBACK_PENDING(11),
    CAPTURE_SENT(12),
    REFUNDED_BY_REWARDS(13),
    SENT_FOR_MODIFICATION(14),
    REFUND_FAILED(15),
    REFUNDED_BY_DIRECT_CASH(16),
    CAPTURE_FAILED(17);

    private final int value;

    private BillingTransactionState(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
