package cl.devweb.model.devwebish.enums;

public enum DealTypesND {

	MAIN("MAIN"),
	SIDE("SIDE"),
	HIDDEN("HIDDEN"),
	WELCOME("WELCOME"),
	FLASH("FLASH"),
	TEASER("TEASER"),
	NULL("NULL"),
	TEMPLATE("DEAL_TEMPLATE"),
	DEALBANK("DEALBANK");

    private final String value;

    private DealTypesND(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


}
