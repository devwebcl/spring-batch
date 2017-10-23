package cl.devweb.classifier;

public enum OrderClassifierEnum {
    
    INSERT_UBH_UJD_BA_BI_RR("Inserting UBH, UJD, BA, BI, RR."),
    INSERT_UBH_UJD_BA_BI("Inserting UBH, UJD, BA, BI."),
    INSERT_UBH_UJD_BA_RR("Inserting UBH, UJD, BA, RR."),
    INSERT_UBH_UJD_BA("Inserting UBH, UJD, BA."),
    INSERT_UBH_UJD_BI_RR("Inserting UBH, UJD, BI, RR."),
    INSERT_UBH_UJD_BI("Inserting UBH, UJD, BI."),
    INSERT_UBH_UJD_RR("Inserting UBH, UJD, RR."),
    INSERT_UBH_UJD("Inserting UBH, UJD."),
    INSERT_UJD_BA_BI_RR("payment_id already in UBH. Inserting UJD, BA, BI, RR."),
    INSERT_UJD_BA_BI("payment_id already in UBH. Inserting UJD, BA, BI."),
    INSERT_UJD_BA_RR("payment_id already in UBH. Inserting UJD, BA, RR."),
    INSERT_UJD_BA("payment_id already in UBH. Inserting UJD, BA."),
    INSERT_UJD_BI_RR("payment_id already in UBH. Inserting UJD, BI, RR."),
    INSERT_UJD_BI("payment_id already in UBH. Inserting UJD, BI."),
    INSERT_UJD_RR("payment_id already in UBH. Inserting UJD, RR."),
    INSERT_UJD("payment_id already in UBH. Inserting UJD.");
    ;
    
    private final String description;
    
    OrderClassifierEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    
}
