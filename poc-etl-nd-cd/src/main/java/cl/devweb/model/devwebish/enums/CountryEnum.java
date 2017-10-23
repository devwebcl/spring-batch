package cl.devweb.model.devwebish.enums;

public enum CountryEnum {

    CL( 1, "Chile",         "chile",        "cl",  "America/Santiago",     "CLP", 46), //miss create app domain for chile
    CO( 3, "Colombia",      "colombia",     "co",  "America/Bogota",       "COP", 21),
    PE( 4, "Perú",          "peru",         "pe",  "America/Lima",         "PEN", 22),
    MX( 5, "México",        "mexico",       "mx",  "America/Mexico_City",  "MXN", 20),
    ;


    private final Integer id;
    private final String name;
    private final String slug;
    private final String code;
    private final String timeZoneId;
    private final String currencyCode;
    private final String locale;
    private final Integer cdAppDomainId;

    private final static String BASE_LOCALE = "es_%s";


    CountryEnum(Integer id,
                String name,
                String slug,
                String code,
                String timeZoneId,
                String currencyCode,
                Integer cdAppDomainId) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.code = code;
        this.timeZoneId = timeZoneId;
        this.currencyCode = currencyCode;
        this.cdAppDomainId = cdAppDomainId;

        this.locale = String.format(BASE_LOCALE, name());
    }

    public static CountryEnum getCountryEnumById(Integer id) {
        CountryEnum countryEnum = null;
        for (CountryEnum country : values()) {
            if (country.getId().equals(id)) {
                countryEnum = country;
                break;
            }
        }
        return countryEnum;
    }

    public static CountryEnum getCountryEnumByAppDomainId(Integer cdAppDomainId) {
        CountryEnum countryEnum = null;
        for (CountryEnum country : values()) {
            if (country.getCdAppDomainId().equals(cdAppDomainId)) {
                countryEnum = country;
                break;
            }
        }
        return countryEnum;
    }

    public static CountryEnum getCountryEnumByCountryCode(String countryCode) {
        CountryEnum countryEnum;
        try {
            countryEnum = CountryEnum.valueOf(countryCode.toUpperCase());
        } catch (IllegalArgumentException ex) {
            countryEnum = null;
        }
        return countryEnum;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getCode() {
        return code;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getLocale() {
        return locale;
    }

    public Integer getCdAppDomainId() {
        return cdAppDomainId;
    }
}
