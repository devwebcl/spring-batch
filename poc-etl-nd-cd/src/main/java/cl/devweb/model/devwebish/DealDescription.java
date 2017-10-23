package cl.devweb.model.devwebish;

import java.util.Date;

public class DealDescription {

    private long id;
    private long deal_id;
    private String title;
    private String text;
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeal_id() {
        return deal_id;
    }

    public void setDeal_id(long deal_id) {
        this.deal_id = deal_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
