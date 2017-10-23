package cl.devweb.model.devwebish;

public class UserAddress {

    private UserPivot userPivot;
    private String streetName;
    private String streetNumber;
    private String reference;
    private String residenceNumber;
    private String recipientId;
    private String phoneNumber;
    private String recipientName;
    private String zipCode;

    public UserPivot getUserPivot() {
        return userPivot;
    }

    public void setUserPivot(UserPivot userPivot) {
        this.userPivot = userPivot;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getResidenceNumber() {
        return residenceNumber;
    }

    public void setResidenceNumber(String residenceNumber) {
        this.residenceNumber = residenceNumber;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
