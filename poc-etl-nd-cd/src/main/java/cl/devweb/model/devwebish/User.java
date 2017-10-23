package cl.devweb.model.devwebish;

import java.util.Date;
import java.util.UUID;

public class User {

    private long id;
    private boolean active;
    private String name;
    private long company_id;
    private UUID uuid;
    private Date created;
    private CityPivot city;
    private UserPivot userPivot;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public CityPivot getCity() {
        return city;
    }

    public void setCity(CityPivot city) {
        this.city = city;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public UserPivot getUserPivot() {
        return userPivot;
    }

    public void setUserPivot(UserPivot userPivot) {
        this.userPivot = userPivot;
    }

    @Override
    public String toString() {
        return "cl.devweb.model.devwebish.User[ id=" + id + " ]";
    }
}
