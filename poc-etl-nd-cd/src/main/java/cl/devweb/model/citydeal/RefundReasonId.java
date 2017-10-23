package cl.devweb.model.citydeal;

public enum RefundReasonId {
    
    RR_2C1(1, "2C1"),
    RR_2C2(2, "2C2"),
    RR_2C4(3, "2C4"),
    RR_2D1(4, "2D1"),
    RR_2D2(5, "2D2"),
    RR_2D3(6, "2D3"),
    RR_2D6(7, "2D6"),
    RR_2E1(8, "2E1"),
    RR_2E2(9, "2E2"),
    RR_2E3(10, "2E3"),
    RR_2E4(11, "2E4"),
    RR_2E5(12, "2E5"),
    RR_2E6(13, "2E6"),
    RR_2E7(14, "2E7"),
    RR_2E8(15, "2E8"),
    RR_2E9(16, "2E9"),
    RR_2E10(17, "2E10"),
    RR_2E11(18, "2E11"),
    RR_2E12(19, "2E12"),
    RR_2E13(20, "2E13"),
    RR_2F1(21, "2F1"),
    RR_2F2(22, "2F2"),
    RR_2F3(23, "2F3"),
    RR_2F4(24, "2F4"),
    RR_2F5(25, "2F5"),
    RR_2F6(26, "2F6"),
    RR_2F7(27, "2F7"),
    RR_2F8(28, "2F8"),
    RR_2F9(29, "2F9"),
    RR_2F10(30, "2F10"),
    RR_2F11(31, "2F11"),
    RR_2F13(33, "2F13"),
    RR_2F14(34, "2F14"),
    RR_2G2(35, "2G2"),
    RR_2G4(36, "2G4"),
    RR_2G6(37, "2G6"),
    RR_2G7(38, "2G7"),
    RR_2G9(39, "2G9"),
    RR_3H1(40, "3H1"),
    RR_3H2(41, "3H2"),
    RR_3H3(42, "3H3"),
    RR_3I1(43, "3I1"),
    RR_3I2(44, "3I2"),
    RR_3I3(45, "3I3"),
    RR_3I5(46, "3I5"),
    RR_3I6(47, "3I6"),
    RR_4J10(48, "4J10"),
    RR_4N4(49, "4N4"),
    RR_4N5(50, "4N5"),
    RR_4N6(51, "4N6"),
    RR_5O1(52, "5O1"),
    RR_3I3a(53, "3I3a"),
    RR_3I3b(54, "3I3b"),
    RR_3I3c(55, "3I3c"),
    RR_2G2a(56, "2G2a"),
    RR_2G2b(57, "2G2b"),
    RR_2G10(58, "2G10"),
    RR_2G11(59, "2G11"),
    RR_2G12(60, "2G12"),
    RR_3I9(61, "3I9"),
    RR_3I10(62, "3I10"),
    RR_5O8(63, "5O8"),
    DEFAULT(1, "2C1");
    
    private final Integer cityDealRefundReasonId;
    private final String refundReasonGlobalCode;

    RefundReasonId(Integer cityDealRefundReasonId, String refundReasonGlobalCode) {
        this.cityDealRefundReasonId = cityDealRefundReasonId;
        this.refundReasonGlobalCode = refundReasonGlobalCode;
    }

    public Integer getCityDealRefundReasonId() {
        return cityDealRefundReasonId;
    }

    public String getRefundReasonGlobalCode() {
        return refundReasonGlobalCode;
    }
    
    public static Integer getIdFromGlobalCode(String globalCode) {
        Integer reasonId = null;
        if (globalCode.isEmpty()) {
            return DEFAULT.getCityDealRefundReasonId();
        }
        for (RefundReasonId refundReasonId : values()) {
            if (refundReasonId.getRefundReasonGlobalCode().contains(globalCode)) {
                reasonId = refundReasonId.getCityDealRefundReasonId();
                break;
            }
        }
        if (reasonId != null) {
            return reasonId;
        }
        
        return getIdFromGlobalCode(globalCode.substring(0 , globalCode.length() - 1));
    }
    
}
