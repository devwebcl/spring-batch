package cl.devweb.model.citydeal;


public enum DealRunStatus {

	INACTIVE (0),
	SCHEDULED (5),
	DEAL_CREATED (7),
	ACTIVE (10),
	RUNNING (50),
	CLOSED (90),
	DELETED (99);


   private final int value;

    private DealRunStatus(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}

