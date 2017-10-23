package cl.devweb.model.citydeal;

// recursive :P
public enum BillingAttributeAttr {

    USERAGENT("USERAGENT"),
    CLIENTTYPE("CLIENTTYPE"),
    CLIENTID("CLIENTID"),
    ORDERTYPE("ORDERTYPE"),
    UNKNOWN("UNKNOWN"),
    WINDOWS7("WINDOWS7"),
    TOUCH("TOUCH"),
    GROUPON_DESKTOP_WEB("GROUPON_DESKTOP_WEB"),
    OTHER("OTHER"),
    IPHONE("IPHONE"),
    IPAD("IPAD"),
    BLACKBERRY("BLACKBERRY"),
    WEB("WEB"),
    ANDROID("ANDROID");

    private final String value;

    private BillingAttributeAttr(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
