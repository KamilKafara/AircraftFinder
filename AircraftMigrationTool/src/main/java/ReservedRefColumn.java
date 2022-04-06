import java.util.HashMap;
import java.util.Map;



enum ReservedRefColumn {
    N_NUMBER(0),
    REGISTRANT(1),
    STREET(2),
    STREET2(3),
    CITY(4),
    STATE(5),
    ZIP_CODE(6),
    RSV_DATE(7),
    TR(8),
    EXP_DATE(9),
    N_NUM_CHG(10),
    PURGE_DATE(11);

    private final int refNumber;
    private static final Map<String, ReservedRefColumn> RESERVED_MAP = new HashMap<>();

    ReservedRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        for (ReservedRefColumn refColumn : values()) {
            RESERVED_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn);
        }
    }

    public int getRefNumber() {
        return refNumber;
    }


}
