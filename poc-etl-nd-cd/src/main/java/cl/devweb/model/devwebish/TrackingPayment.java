package cl.devweb.model.devwebish;

import java.util.Date;

public class TrackingPayment {

    private long id;
    private String version;
    private long payment_id;
    private String payment_method;
    private String platform;
    private String application;
    private String user_agent;
    private String cookie_b;
    private Date date;

    public String getCookie_b() {
        return cookie_b;
    }

    public void setCookie_b(String cookie_b) {
        this.cookie_b = cookie_b;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(long payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
