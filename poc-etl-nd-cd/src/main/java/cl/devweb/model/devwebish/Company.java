package cl.devweb.model.devwebish;

import java.util.Date;

public class Company {

    private long id;
    private String name;
    private String description;
    private String website;
    private String logo_url;
    private String contract_rut;
    private String contract_name;
    private String contract_type;
    private String contract_address;
    private String contract_city;
    private String contract_contact;
    private String bank_rut;
    private String bank_name;
    private long bank_name2;
    private String bank_account_holder;
    private String bank_account_number;
    private String payment_method;
    private Date created;
    private Date modified;
    private String membership_info;
    private String salesforce_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getContract_rut() {
        return contract_rut;
    }

    public void setContract_rut(String contract_rut) {
        this.contract_rut = contract_rut;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public String getContract_address() {
        return contract_address;
    }

    public void setContract_address(String contract_address) {
        this.contract_address = contract_address;
    }

    public String getContract_city() {
        return contract_city;
    }

    public void setContract_city(String contract_city) {
        this.contract_city = contract_city;
    }

    public String getContract_contact() {
        return contract_contact;
    }

    public void setContract_contact(String contract_contact) {
        this.contract_contact = contract_contact;
    }

    public String getBank_rut() {
        return bank_rut;
    }

    public void setBank_rut(String bank_rut) {
        this.bank_rut = bank_rut;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public long getBank_name2() {
        return bank_name2;
    }

    public void setBank_name2(long bank_name2) {
        this.bank_name2 = bank_name2;
    }

    public String getBank_account_holder() {
        return bank_account_holder;
    }

    public void setBank_account_holder(String bank_account_holder) {
        this.bank_account_holder = bank_account_holder;
    }

    public String getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getMembership_info() {
        return membership_info;
    }

    public void setMembership_info(String membership_info) {
        this.membership_info = membership_info;
    }

    public String getSalesforce_id() {
        return salesforce_id;
    }

    public void setSalesforce_id(String salesforce_id) {
        this.salesforce_id = salesforce_id;
    }

}
