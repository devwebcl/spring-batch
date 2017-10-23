package cl.devweb.model.devwebish;

public class UserPivot {

    private long nUserId;
    private String email;
    private String uuid;
    private long nCompanyId;
    private Long cdUserId;
    private CityPivot cityPivot;
    private int isUserCreated;

    public UserPivot() {
    }

    public long getNUserId() {
        return nUserId;
    }

    public void setNUserId(long nUserId) {
        this.nUserId = nUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getNCompanyId() {
        return nCompanyId;
    }

    public void setNCompanyId(long nCompanyId) {
        this.nCompanyId = nCompanyId;
    }

    public Long getCdUserId() {
        return cdUserId;
    }

    public void setCdUserId(Long cdUserId) {
        this.cdUserId = cdUserId;
    }

    public CityPivot getCityPivot() {
        return cityPivot;
    }

    public void setCityPivot(CityPivot cityPivot) {
        this.cityPivot = cityPivot;
    }

    public int getIsUserCreated() {
        return isUserCreated;
    }

    public void setIsUserCreated(int isUserCreated) {
        this.isUserCreated = isUserCreated;
    }
}
