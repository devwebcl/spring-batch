package cl.devweb.model.citydeal;

import java.util.Date;

public class BillingIncentive {

    private Long bi_id;
    private Date bi_created;
    private Date bi_last_modified;
    private Long bi_ubh_id;
    private String bi_incentive_id;
    private Integer bi_amount;

    public Long getBi_id() {
        return bi_id;
    }

    public void setBi_id(Long bi_id) {
        this.bi_id = bi_id;
    }

    public Date getBi_created() {
        return bi_created;
    }

    public void setBi_created(Date bi_created) {
        this.bi_created = bi_created;
    }

    public Date getBi_last_modified() {
        return bi_last_modified;
    }

    public void setBi_last_modified(Date bi_last_modified) {
        this.bi_last_modified = bi_last_modified;
    }

    public Long getBi_ubh_id() {
        return bi_ubh_id;
    }

    public void setBi_ubh_id(Long bi_ubh_id) {
        this.bi_ubh_id = bi_ubh_id;
    }

    public String getBi_incentive_id() {
        return bi_incentive_id;
    }

    public void setBi_incentive_id(String bi_incentive_id) {
        this.bi_incentive_id = bi_incentive_id;
    }

    public Integer getBi_amount() {
        return bi_amount;
    }

    public void setBi_amount(Integer bi_amount) {
        this.bi_amount = bi_amount;
    }

}
