package cl.devweb.model.devwebish;

import java.util.Date;

public class Coupon {

    /*
     * status2:
     *      NOPAY ("NOPAY"),
     PAID ("PAID"),
     PENDING ("PENDING"),
     REFUNDED ("REFUNDED"),
     SENT ("SENT"),
     TBP ("TBP");
     */
    private long id;
    private String code;
    private long deal_id;
    private long deal_id_old;
    private long payment_id;
    private long user_id;
    private int settlement_id;
    private String validation_code;
    private String status; //status coupon
    private String status2;  //status liquidacion socio
    private String request_status;
    private Date created;
    private Date prepaid_date;
    private Date refund_date;
    private Date invalid_date;
    private Date reject_date;
    private Date fraud_date;
    private Date expired_date;
    private Date settled_date;
    private Date check_date;
    private String check_name;
    private String check_email;
    private String check_rut;
    private String check_text;
    private long invalidated_by;
    private long rejected_by;
    private String rejected_note;
    private String gift_to;
    private String gift_from;
    private String gift_message;
    private String gift_email;
    private String shipping_phone;
    private String shipping_address;
    private String shipping_rut;
    private String shipping_location;
    private String invalidation_option;
    private String invalidation_option_child;
    private long invalidation_reason_id;
    private String invalidation_note;
    private String invalidation_data;
    private String invalidation_method;
    private double invalidation_credits;
    private double invalidation_additional_credits;
    private long invalidation_amount;
    private boolean planilla_added;
    private String atrk;
    private String transbank_id;
    private boolean coupon_sent;
    private Date coupon_sent_date;
    private boolean alert_sent;
    private Date alert_sent_date;
    private boolean created_manually;
    private long creation_reason_id;
    private String creation_comment;
    private boolean sent_ok;

    public boolean isSent_ok() {
        return sent_ok;
    }

    public void setSent_ok(boolean sent_ok) {
        this.sent_ok = sent_ok;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(long deal_id) {
        this.deal_id = deal_id;
    }

    public long getDeal_id_old() {
        return deal_id_old;
    }

    public void setDeal_id_old(long deal_id_old) {
        this.deal_id_old = deal_id_old;
    }

    public long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getSettlement_id() {
        return settlement_id;
    }

    public void setSettlement_id(int settlement_id) {
        this.settlement_id = settlement_id;
    }

    public String getValidation_code() {
        return validation_code;
    }

    public void setValidation_code(String validation_code) {
        this.validation_code = validation_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getPrepaid_date() {
        return prepaid_date;
    }

    public void setPrepaid_date(Date prepaid_date) {
        this.prepaid_date = prepaid_date;
    }

    public Date getRefund_date() {
        return refund_date;
    }

    public void setRefund_date(Date refund_date) {
        this.refund_date = refund_date;
    }

    public Date getInvalid_date() {
        return invalid_date;
    }

    public void setInvalid_date(Date invalid_date) {
        this.invalid_date = invalid_date;
    }

    public Date getReject_date() {
        return reject_date;
    }

    public void setReject_date(Date reject_date) {
        this.reject_date = reject_date;
    }

    public Date getFraud_date() {
        return fraud_date;
    }

    public void setFraud_date(Date fraud_date) {
        this.fraud_date = fraud_date;
    }

    public Date getExpired_date() {
        return expired_date;
    }

    public void setExpired_date(Date expired_date) {
        this.expired_date = expired_date;
    }

    public Date getSettled_date() {
        return settled_date;
    }

    public void setSettled_date(Date settled_date) {
        this.settled_date = settled_date;
    }

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }

    public String getCheck_name() {
        return check_name;
    }

    public void setCheck_name(String check_name) {
        this.check_name = check_name;
    }

    public String getCheck_email() {
        return check_email;
    }

    public void setCheck_email(String check_email) {
        this.check_email = check_email;
    }

    public String getCheck_rut() {
        return check_rut;
    }

    public void setCheck_rut(String check_rut) {
        this.check_rut = check_rut;
    }

    public String getCheck_text() {
        return check_text;
    }

    public void setCheck_text(String check_text) {
        this.check_text = check_text;
    }

    public long getInvalidated_by() {
        return invalidated_by;
    }

    public void setInvalidated_by(long invalidated_by) {
        this.invalidated_by = invalidated_by;
    }

    public long getRejected_by() {
        return rejected_by;
    }

    public void setRejected_by(long rejected_by) {
        this.rejected_by = rejected_by;
    }

    public String getRejected_note() {
        return rejected_note;
    }

    public void setRejected_note(String rejected_note) {
        this.rejected_note = rejected_note;
    }

    public String getGift_to() {
        return gift_to;
    }

    public void setGift_to(String gift_to) {
        this.gift_to = gift_to;
    }

    public String getGift_from() {
        return gift_from;
    }

    public void setGift_from(String gift_from) {
        this.gift_from = gift_from;
    }

    public String getGift_message() {
        return gift_message;
    }

    public void setGift_message(String gift_message) {
        this.gift_message = gift_message;
    }

    public String getGift_email() {
        return gift_email;
    }

    public void setGift_email(String gift_email) {
        this.gift_email = gift_email;
    }

    public String getShipping_phone() {
        return shipping_phone;
    }

    public void setShipping_phone(String shipping_phone) {
        this.shipping_phone = shipping_phone;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getShipping_rut() {
        return shipping_rut;
    }

    public void setShipping_rut(String shipping_rut) {
        this.shipping_rut = shipping_rut;
    }

    public String getShipping_location() {
        return shipping_location;
    }

    public void setShipping_location(String shipping_location) {
        this.shipping_location = shipping_location;
    }

    public String getInvalidation_option() {
        return invalidation_option;
    }

    public void setInvalidation_option(String invalidation_option) {
        this.invalidation_option = invalidation_option;
    }

    public String getInvalidation_option_child() {
        return invalidation_option_child;
    }

    public void setInvalidation_option_child(String invalidation_option_child) {
        this.invalidation_option_child = invalidation_option_child;
    }

    public long getInvalidation_reason_id() {
        return invalidation_reason_id;
    }

    public void setInvalidation_reason_id(long invalidation_reason_id) {
        this.invalidation_reason_id = invalidation_reason_id;
    }

    public String getInvalidation_note() {
        return invalidation_note;
    }

    public void setInvalidation_note(String invalidation_note) {
        this.invalidation_note = invalidation_note;
    }

    public String getInvalidation_data() {
        return invalidation_data;
    }

    public void setInvalidation_data(String invalidation_data) {
        this.invalidation_data = invalidation_data;
    }

    public String getInvalidation_method() {
        return invalidation_method;
    }

    public void setInvalidation_method(String invalidation_method) {
        this.invalidation_method = invalidation_method;
    }

    public double getInvalidation_credits() {
        return invalidation_credits;
    }

    public void setInvalidation_credits(double invalidation_credits) {
        this.invalidation_credits = invalidation_credits;
    }

    public double getInvalidation_additional_credits() {
        return invalidation_additional_credits;
    }

    public void setInvalidation_additional_credits(double invalidation_additional_credits) {
        this.invalidation_additional_credits = invalidation_additional_credits;
    }

    public long getInvalidation_amount() {
        return invalidation_amount;
    }

    public void setInvalidation_amount(long invalidation_amount) {
        this.invalidation_amount = invalidation_amount;
    }

    public boolean isPlanilla_added() {
        return planilla_added;
    }

    public void setPlanilla_added(boolean planilla_added) {
        this.planilla_added = planilla_added;
    }

    public String getAtrk() {
        return atrk;
    }

    public void setAtrk(String atrk) {
        this.atrk = atrk;
    }

    public String getTransbank_id() {
        return transbank_id;
    }

    public void setTransbank_id(String transbank_id) {
        this.transbank_id = transbank_id;
    }

    public boolean isCoupon_sent() {
        return coupon_sent;
    }

    public void setCoupon_sent(boolean coupon_sent) {
        this.coupon_sent = coupon_sent;
    }

    public Date getCoupon_sent_date() {
        return coupon_sent_date;
    }

    public void setCoupon_sent_date(Date coupon_sent_date) {
        this.coupon_sent_date = coupon_sent_date;
    }

    public boolean isAlert_sent() {
        return alert_sent;
    }

    public void setAlert_sent(boolean alert_sent) {
        this.alert_sent = alert_sent;
    }

    public Date getAlert_sent_date() {
        return alert_sent_date;
    }

    public void setAlert_sent_date(Date alert_sent_date) {
        this.alert_sent_date = alert_sent_date;
    }

    public boolean isCreated_manually() {
        return created_manually;
    }

    public void setCreated_manually(boolean created_manually) {
        this.created_manually = created_manually;
    }

    public long getCreation_reason_id() {
        return creation_reason_id;
    }

    public void setCreation_reason_id(long creation_reason_id) {
        this.creation_reason_id = creation_reason_id;
    }

    public String getCreation_comment() {
        return creation_comment;
    }

    public void setCreation_comment(String creation_comment) {
        this.creation_comment = creation_comment;
    }

}
