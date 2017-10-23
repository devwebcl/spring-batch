package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

//it can be done automatically

/*
 * all must be: long, double, Date or UUID
 */
public class UsersBillingHistory {

    private long ubh_id;
    private Date ubh_created;
    private long ubh_user_id;
    private long ubh_payment_provider_id;
    private long ubh_transaction_state_id;
    private double ubh_price_amount_gross;
    private double ubh_tax_amount;
    private long ubh_citydeal_id;
    private long ubh_basket_items;
    private String ubh_paymentprovider_reference;
    private Date ubh_last_modfied;
    private String ubh_chargeback_reason;
    private long ubh_used_reward_units;
    private String ubh_modification_reason;
    private Long ubh_ocd_id;
    private long ubh_notification_status;
    private long ubh_installment_no;
    private long ubh_interest_amount;
    private UUID ubh_uuid;

    public long getUbh_id() {
        return ubh_id;
    }

    public void setUbh_id(long ubh_id) {
        this.ubh_id = ubh_id;
    }

    public Date getUbh_created() {
        return ubh_created;
    }

    public void setUbh_created(Date ubh_created) {
        this.ubh_created = ubh_created;
    }

    public long getUbh_user_id() {
        return ubh_user_id;
    }

    public void setUbh_user_id(long ubh_user_id) {
        this.ubh_user_id = ubh_user_id;
    }

    public long getUbh_payment_provider_id() {
        return ubh_payment_provider_id;
    }

    public void setUbh_payment_provider_id(long ubh_payment_provider_id) {
        this.ubh_payment_provider_id = ubh_payment_provider_id;
    }

    public long getUbh_transaction_state_id() {
        return ubh_transaction_state_id;
    }

    public void setUbh_transaction_state_id(long ubh_transaction_state_id) {
        this.ubh_transaction_state_id = ubh_transaction_state_id;
    }

    public double getUbh_price_amount_gross() {
        return ubh_price_amount_gross;
    }

    public void setUbh_price_amount_gross(double ubh_price_amount_gross) {
        this.ubh_price_amount_gross = ubh_price_amount_gross;
    }

    public double getUbh_tax_amount() {
        return ubh_tax_amount;
    }

    public void setUbh_tax_amount(double ubh_tax_amount) {
        this.ubh_tax_amount = ubh_tax_amount;
    }

    public long getUbh_citydeal_id() {
        return ubh_citydeal_id;
    }

    public void setUbh_citydeal_id(long ubh_citydeal_id) {
        this.ubh_citydeal_id = ubh_citydeal_id;
    }

    public long getUbh_basket_items() {
        return ubh_basket_items;
    }

    public void setUbh_basket_items(long ubh_basket_items) {
        this.ubh_basket_items = ubh_basket_items;
    }

    public String getUbh_paymentprovider_reference() {
        return ubh_paymentprovider_reference;
    }

    public void setUbh_paymentprovider_reference(String ubh_paymentprovider_reference) {
        this.ubh_paymentprovider_reference = ubh_paymentprovider_reference;
    }

    public Date getUbh_last_modfied() {
        return ubh_last_modfied;
    }

    public void setUbh_last_modfied(Date ubh_last_modfied) {
        this.ubh_last_modfied = ubh_last_modfied;
    }

    public String getUbh_chargeback_reason() {
        return ubh_chargeback_reason;
    }

    public void setUbh_chargeback_reason(String ubh_chargeback_reason) {
        this.ubh_chargeback_reason = ubh_chargeback_reason;
    }

    public long getUbh_used_reward_units() {
        return ubh_used_reward_units;
    }

    public void setUbh_used_reward_units(long ubh_used_reward_units) {
        this.ubh_used_reward_units = ubh_used_reward_units;
    }

    public String getUbh_modification_reason() {
        return ubh_modification_reason;
    }

    public void setUbh_modification_reason(String ubh_modification_reason) {
        this.ubh_modification_reason = ubh_modification_reason;
    }

    public Long getUbh_ocd_id() {
        return ubh_ocd_id;
    }

    public void setUbh_ocd_id(Long ubh_ocd_id) {
        this.ubh_ocd_id = ubh_ocd_id;
    }

    public long getUbh_notification_status() {
        return ubh_notification_status;
    }

    public void setUbh_notification_status(long ubh_notification_status) {
        this.ubh_notification_status = ubh_notification_status;
    }

    public long getUbh_installment_no() {
        return ubh_installment_no;
    }

    public void setUbh_installment_no(long ubh_installment_no) {
        this.ubh_installment_no = ubh_installment_no;
    }

    public long getUbh_interest_amount() {
        return ubh_interest_amount;
    }

    public void setUbh_interest_amount(long ubh_interest_amount) {
        this.ubh_interest_amount = ubh_interest_amount;
    }

    public UUID getUbh_uuid() {
        return ubh_uuid;
    }

    public void setUbh_uuid(UUID ubh_uuid) {
        this.ubh_uuid = ubh_uuid;
    }

}
