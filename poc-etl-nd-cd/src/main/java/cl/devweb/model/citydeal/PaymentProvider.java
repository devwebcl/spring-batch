package cl.devweb.model.citydeal;

public enum PaymentProvider {
    DUMMY_PP_CL(1, 250),
    DUMMY_PP_CO(3, 251),
    DUMMY_PP_PE(4, 252),
    DUMMY_PP_MX(5, 253);
    
    /**
    *   In order to simplify the orders migration,
    *   we wil use these Dummy payment providers for each country
    *   currently supported by Needish.
    * 
    *   Once the payment providers exist in CityDeal, we will
    *   match them with the ones present in Needish and, when
    *   there isn't a match, we will use these Dummy values
    *   se we don't actually lose the order.
    **/
    
    private final Integer countryId;
    private final Integer paymentProviderId;
    
    private PaymentProvider(Integer countryId, Integer paymentProviderId) {
        this.countryId = countryId;
        this.paymentProviderId = paymentProviderId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getPaymentProviderId() {
        return paymentProviderId;
    }
    
    public static PaymentProvider getDummyPaymentProviderFromCountryId(long countryId) {
        PaymentProvider result = null;
        for (PaymentProvider paymentProvider : values()) {
            if (paymentProvider.getCountryId() == countryId) {
                result = paymentProvider;
            }
        }
        return result;
    }
    
}
