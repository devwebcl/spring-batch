package cl.devweb.model.citydeal;


public enum DealRunType {

	NORMAL (1),
	MULLIGAN (2),
	DEALBANK (3),
	PREFEATURED (4); // TODO: related to featured_id ?


    private final int value;

    private DealRunType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}


