package cl.devweb.model.citydeal;


public enum UjdUsageState {

	// CONSTRAINT ujd_usage_state_check CHECK (((ujd_usage_state)::text = ANY (ARRAY['UNUSED'::text, 'REDEEMED'::text])))

	//  constraints:
	UNUSED ("UNUSED"),
	REDEEMED ("REDEEMED");


   private final String value;

    private UjdUsageState(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
