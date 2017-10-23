package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

// users_joined_deals   ==   (vouchers)
public class UsersJoinedDeals {

    private long ujd_id;
    private long ujd_user_id;
    private long ujd_city_deal_id;
    private Date ujd_created;
    private long ujd_billing_history_id;
    private long ujd_join_status;
    private long ujd_amount;
    private String ujd_part1_provider_only;
    private String ujd_part2_provider_customer;
    private Date ujd_last_modified;
    private Date ujd_usage_date;
    private String ujd_usage_state;
    private String ujd_redeem_origin;
    private Boolean ujd_suspended;
    private long ujd_app_id;
    private Date ujd_valid_from;
    private Date ujd_valid_until;
    private UUID ujd_guid;

    public long getUjd_id() {
        return ujd_id;
    }

    public void setUjd_id(long ujd_id) {
        this.ujd_id = ujd_id;
    }

    public long getUjd_user_id() {
        return ujd_user_id;
    }

    public void setUjd_user_id(long ujd_user_id) {
        this.ujd_user_id = ujd_user_id;
    }

    public long getUjd_city_deal_id() {
        return ujd_city_deal_id;
    }

    public void setUjd_city_deal_id(long ujd_city_deal_id) {
        this.ujd_city_deal_id = ujd_city_deal_id;
    }

    public Date getUjd_created() {
        return ujd_created;
    }

    public void setUjd_created(Date ujd_created) {
        this.ujd_created = ujd_created;
    }

    public long getUjd_billing_history_id() {
        return ujd_billing_history_id;
    }

    public void setUjd_billing_history_id(long ujd_billing_history_id) {
        this.ujd_billing_history_id = ujd_billing_history_id;
    }

    public long getUjd_join_status() {
        return ujd_join_status;
    }

    public void setUjd_join_status(long ujd_join_status) {
        this.ujd_join_status = ujd_join_status;
    }

    public long getUjd_amount() {
        return ujd_amount;
    }

    public void setUjd_amount(long ujd_amount) {
        this.ujd_amount = ujd_amount;
    }

    public String getUjd_part1_provider_only() {
        return ujd_part1_provider_only;
    }

    public void setUjd_part1_provider_only(String ujd_part1_provider_only) {
        this.ujd_part1_provider_only = ujd_part1_provider_only;
    }

    public String getUjd_part2_provider_customer() {
        return ujd_part2_provider_customer;
    }

    public void setUjd_part2_provider_customer(String ujd_part2_provider_customer) {
        this.ujd_part2_provider_customer = ujd_part2_provider_customer;
    }

    public Date getUjd_last_modified() {
        return ujd_last_modified;
    }

    public void setUjd_last_modified(Date ujd_last_modified) {
        this.ujd_last_modified = ujd_last_modified;
    }

    public Date getUjd_usage_date() {
        return ujd_usage_date;
    }

    public void setUjd_usage_date(Date ujd_usage_date) {
        this.ujd_usage_date = ujd_usage_date;
    }

    public String getUjd_usage_state() {
        return ujd_usage_state;
    }

    public void setUjd_usage_state(String ujd_usage_state) {
        this.ujd_usage_state = ujd_usage_state;
    }

    public String getUjd_redeem_origin() {
        return ujd_redeem_origin;
    }

    public void setUjd_redeem_origin(String ujd_redeem_origin) {
        this.ujd_redeem_origin = ujd_redeem_origin;
    }

    public Boolean getUjd_suspended() {
        return ujd_suspended;
    }

    public void setUjd_suspended(Boolean ujd_suspended) {
        this.ujd_suspended = ujd_suspended;
    }

    public long getUjd_app_id() {
        return ujd_app_id;
    }

    public void setUjd_app_id(long ujd_app_id) {
        this.ujd_app_id = ujd_app_id;
    }

    public Date getUjd_valid_from() {
        return ujd_valid_from;
    }

    public void setUjd_valid_from(Date ujd_valid_from) {
        this.ujd_valid_from = ujd_valid_from;
    }

    public Date getUjd_valid_until() {
        return ujd_valid_until;
    }

    public void setUjd_valid_until(Date ujd_valid_until) {
        this.ujd_valid_until = ujd_valid_until;
    }

    public UUID getUjd_guid() {
        return ujd_guid;
    }

    public void setUjd_guid(UUID ujd_guid) {
        this.ujd_guid = ujd_guid;
    }

}
