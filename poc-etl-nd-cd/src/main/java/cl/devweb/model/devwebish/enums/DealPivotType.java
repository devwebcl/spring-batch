package cl.devweb.model.devwebish.enums;

public enum DealPivotType {

	// 'Tipo: DEAL_TEMPLATE, DEAL_TEMPLATE_OPTION, DEAL_RUN, DEAL_RUN_OPTION, CITYDEALS',

	DEAL_TEMPLATE("DEAL_TEMPLATE"),
	DEAL_TEMPLATE_OPTION("DEAL_TEMPLATE_OPTION"),
	DEAL_RUN("DEAL_RUN"),
	DEAL_RUN_OPTION("DEAL_RUN_OPTION"),
	CITYDEALS("CITYDEALS");

    private final String value;

    private DealPivotType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }



}
