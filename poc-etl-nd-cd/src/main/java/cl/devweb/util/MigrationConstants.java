package cl.devweb.util;

public class MigrationConstants {

    private MigrationConstants() {
    }

    //encryption Hash Algorithm
    public static final String ENCRYPTION_METHOD_BLOWFISH2A = "BLOWFISH2A";
    public static final String ENCRYPTION_METHOD_SHA1 = "SHA1";

    //appdomains
    public static final String COUNTRIES_PROPERTY = "countries";
    public static final String APP_DOMAINS_PROPERTY = "appDomains";
    public static final String LIMIT_PROPERTY = "limit";
    public static final String ALL_COUNTRIES_PROPERTY_VALUE = "1,3,4,5";

    //country id
    public static final String ALL_APP_DOMAINS_PROPERTY_VALUE = "20,21,22,46";
    public static final String COUNTRY_ARG = "country";
    public static final String JOB_NAME_ARG = "jobName";

    //schemas
    public final static String STD_DATA_SCHEMA = "std_data";
    public final static String CLANDESCUENTO_SCHEMA = "clandescuento";

    //merchant
    public final static String DEAL_MERCHANT_TABLE_NAME = "deal_merchant";
    public final static String DEAL_MERCHANT_REDEMPTION_LOCATION_TABLE_NAME = "deal_merchant_redemption_location";
    public final static String MERCHANTS_PIVOT_TABLE_NAME = "merchants_pivot";

    //deals
    public final static String DEAL_LIMIT_GROUP = "deal_limit_group";
    public final static String CD_DEAL_UUID = "cd_deal_uuid";
    public final static String CITY_DEALS = "city_deals";
    public final static String CITY_DEALS_PIVOT = "city_deals_pivot";
    public final static String DEAL_PURCHASE_CONTROL = "deal_purchase_control";
    public final static String DEAL_TEMPLATE_PURCHASE_CONTROL = "deal_template_purchase_control";

}
