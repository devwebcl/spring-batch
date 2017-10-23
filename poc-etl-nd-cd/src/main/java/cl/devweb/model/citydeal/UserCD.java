package cl.devweb.model.citydeal;

import java.util.Date;
import java.util.UUID;

import cl.devweb.model.devwebish.CityPivot;
import cl.devweb.util.MigrationConstants;

public class UserCD {

    private long u_id;
    private long u_appdomain_id;
    private long u_state_id;
    private String u_first_name;
    private String u_last_name;
    private String u_email;
    private String u_password;
    private String u_personal_identifier;
    private boolean u_recurring; //true
    private short u_ut_id; //si es usuario activo el valor es 0 sino es 1
    private String u_encryption_method; // SHA1
    private Date created;
    private UUID u_uuid;

    public UserCD() {
    }

    public UserCD(CityPivot cityPivot) {
        this.u_recurring = true;
        this.u_state_id = 0;
        this.u_ut_id = 0;
        this.u_recurring = true;
        this.u_encryption_method = MigrationConstants.ENCRYPTION_METHOD_SHA1;
        this.u_appdomain_id = cityPivot.getCd_appdomain_id();
    }

    public long getU_id() {
        return u_id;
    }

    public void setU_id(long u_id) {
        this.u_id = u_id;
    }

    public long getU_appdomain_id() {
        return u_appdomain_id;
    }

    public void setU_appdomain_id(long u_appdomain_id) {
        this.u_appdomain_id = u_appdomain_id;
    }

    public long getU_state_id() {
        return u_state_id;
    }

    public String getU_first_name() {
        return u_first_name;
    }

    public void setU_first_name(String u_first_name) {
        this.u_first_name = u_first_name;
    }

    public String getU_last_name() {
        return u_last_name;
    }

    public void setU_last_name(String u_last_name) {
        this.u_last_name = u_last_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_personal_identifier() {
        return u_personal_identifier;
    }

    public void setU_personal_identifier(String u_personal_identifier) {
        this.u_personal_identifier = u_personal_identifier;
    }

    public boolean isU_recurring() {
        return u_recurring;
    }

    public short getU_ut_id() {
        return u_ut_id;
    }

    public void setU_ut_id(short u_ut_id) {
        this.u_ut_id = u_ut_id;
    }

    public String getU_encryption_method() {
        return u_encryption_method;
    }

    public void setU_encryption_method(String u_encryption_method) {
        this.u_encryption_method = u_encryption_method;
    }

    public UUID getU_uuid() {
        return u_uuid;
    }

    public void setU_uuid(UUID u_uuid) {
        this.u_uuid = u_uuid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
