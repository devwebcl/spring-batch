package cl.devweb.model.citydeal;

import java.util.Date;

public class RefundReason {
    
    private long rre_id;
    private Date rre_created;
    private Date rre_last_modified;
    private long rre_ubh_id;
    private Integer rre_reason_id;
    private boolean rre_process_violation;
    private Integer rre_tool_user_id;
    private String rre_violation_explanation;

    public long getRre_id() {
        return rre_id;
    }

    public void setRre_id(long rre_id) {
        this.rre_id = rre_id;
    }

    public Date getRre_created() {
        return rre_created;
    }

    public void setRre_created(Date rre_created) {
        this.rre_created = rre_created;
    }

    public Date getRre_last_modified() {
        return rre_last_modified;
    }

    public void setRre_last_modified(Date rre_last_modified) {
        this.rre_last_modified = rre_last_modified;
    }

    public long getRre_ubh_id() {
        return rre_ubh_id;
    }

    public void setRre_ubh_id(long rre_ubh_id) {
        this.rre_ubh_id = rre_ubh_id;
    }

    public Integer getRre_reason_id() {
        return rre_reason_id;
    }

    public void setRre_reason_id(Integer rre_reason_id) {
        this.rre_reason_id = rre_reason_id;
    }

    public boolean isRre_process_violation() {
        return rre_process_violation;
    }

    public void setRre_process_violation(boolean rre_process_violation) {
        this.rre_process_violation = rre_process_violation;
    }

    public Integer getRre_tool_user_id() {
        return rre_tool_user_id;
    }

    public void setRre_tool_user_id(Integer rre_tool_user_id) {
        this.rre_tool_user_id = rre_tool_user_id;
    }

    public String getRre_violation_explanation() {
        return rre_violation_explanation;
    }

    public void setRre_violation_explanation(String rre_violation_explanation) {
        this.rre_violation_explanation = rre_violation_explanation;
    }
    
    
}
