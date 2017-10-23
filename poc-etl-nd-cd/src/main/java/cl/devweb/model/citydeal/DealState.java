package cl.devweb.model.citydeal;

public enum DealState {

	DEAL_CREATED (0),
	DEAL_PUBLISHED (1),
	DEAL_CLOSED_WITH_SUCCESS (2),
	DEAL_CLOSED_WITHOUT_SUCCESS (3),
	DEAL_TEASER (4),
	// DEAL_NEW_STATE_FOR_TEST (5), //It doesn't exist in Production
	DEAL_DELETED (99);


   private final int value;

    private DealState(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
