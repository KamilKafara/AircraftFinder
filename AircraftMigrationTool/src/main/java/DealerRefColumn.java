import java.util.HashMap;
import java.util.Map;

enum DealerRefColumn {
    CERTIFICATE_NUMBER(0),
    OWNERSHIP(1),
    CERTIFICATE_DATE(2),
    EXPIRATION_DATE(3),
    EXPIRATION_FLAG(4),
    CERTIFICATE_ISSUE_COUNT(5),
    NAME(6),
    STREET(7),
    STREET2(8),
    CITY(9),
    STATE_ABBREV(10),
    ZIP_CODE(11),
    OTHER_NAMES_COUNT(12),
    OTHER_NAMES_1(13),
    OTHER_NAMES_2(14),
    OTHER_NAMES_3(15),
    OTHER_NAMES_4(16),
    OTHER_NAMES_5(17),
    OTHER_NAMES_6(18),
    OTHER_NAMES_7(19),
    OTHER_NAMES_8(20),
    OTHER_NAMES_9(21),
    OTHER_NAMES_10(22),
    OTHER_NAMES_11(23),
    OTHER_NAMES_12(24),
    OTHER_NAMES_13(25),
    OTHER_NAMES_14(26),
    OTHER_NAMES_15(27),
    OTHER_NAMES_16(28),
    OTHER_NAMES_17(29),
    OTHER_NAMES_18(30),
    OTHER_NAMES_19(31),
    OTHER_NAMES_20(32),
    OTHER_NAMES_21(33),
    OTHER_NAMES_22(34),
    OTHER_NAMES_23(35),
    OTHER_NAMES_24(36),
    OTHER_NAMES_25(37);

    private final int refNumber;

    private static final Map<String, DealerRefColumn> DEALER_REF_NUMBER = new HashMap<>();

    static {
        for (DealerRefColumn refColumn : values()) {
            DEALER_REF_NUMBER.put(String.valueOf(refColumn.getRefNumber()), refColumn);
        }
    }

    DealerRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    public int getRefNumber() {
        return refNumber;
    }
}
