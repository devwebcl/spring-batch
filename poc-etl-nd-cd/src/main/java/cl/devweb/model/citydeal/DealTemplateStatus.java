package cl.devweb.model.citydeal;


public enum DealTemplateStatus {

	CREATED (0),
	IN_USE (1);


   private final int value;

    private DealTemplateStatus(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}


