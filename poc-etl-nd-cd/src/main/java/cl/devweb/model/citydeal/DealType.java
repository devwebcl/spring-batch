package cl.devweb.model.citydeal;


public enum DealType {

	MAIN_DEAL (1),
	SIDE_DEAL (2),
	LANDINGPAGE_DEAL (3),
	NOW_DEAL (4);


    private final int value;

    private DealType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}


