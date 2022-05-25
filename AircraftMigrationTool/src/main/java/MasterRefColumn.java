import java.util.HashMap;
import java.util.Map;

enum MasterRefColumn {
    N_NUMBER(0),
    SERIAL_NUMBER(1),
    MFR_MDL_CODE(2),
    ENG_MFR_MDL(3),
    YEAR_MFR(4),
    TYPE_REGISTRANT(5),
    NAME(6),
    STREET(7),
    STREET2(8),
    CITY(9),
    STATE(10),
    ZIP_CODE(11),
    REGION(12),
    COUNTY(13),
    COUNTRY(14),
    LAST_ACTION_DATE(15),
    CERT_ISSUE_DATE(16),
    CERTIFICATION(17),
    TYPE_AIRCRAFT(18),
    TYPE_ENGINE(19),
    STATUS_CODE(20),
    MODE_S_CODE(21),
    FRACT_OWNER(22),
    AIR_WORTH_DATE(23),
    OTHER_NAMES_1(2),
    OTHER_NAMES_2(25),
    OTHER_NAMES_3(26),
    OTHER_NAMES_4(27),
    OTHER_NAMES_5(28),
    EXPIRATION_DATE(29),
    UNIQUE_ID(30),
    KIT_MFR(31),
    KIT_MODEL(32),
    MODE_S_CODE_HEX(33);

    private final int refNumber;
    private static final Map<String, MasterRefColumn> MASTER_MAP = new HashMap<>();

    MasterRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        for (MasterRefColumn refColumn : values()) {
            MASTER_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn);
        }
    }

    public int getRefNumber() {
        return refNumber;
    }
}
