import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum DeregRefColumn {
    N_NUMBER(0),
    SERIAL_NUMBER(1),
    MFR_MDL_CODE(2),
    STATUS_CODE(3),
    NAME(4),
    STREET_MAIL(5),
    STREET2_MAIL(6),
    CITY_MAIL(7),
    STATE_ABBREV_MAIL(8),
    ZIP_CODE_MAIL(9),
    ENG_MFR_MDL(10),
    YEAR_MFR(11),
    CERTIFICATION(12),
    REGION(13),
    COUNTY_MAIL(14),
    COUNTRY_MAIL(15),
    AIR_WORTH_DATE(16),
    CANCEL_DATE(17),
    MODE_S_CODE(18),
    INDICATOR_GROUP(19),
    EXP_COUNTRY(20),
    LAST_ACT_DATE(21),
    CERT_ISSUE_DATE(22),
    STREET_PHYSICAL(23),
    STREET2_PHYSICAL(24),
    CITY_PHYSICAL(25),
    STATE_ABBREV_PHYSICAL(26),
    ZIP_CODE_PHYSICAL(27),
    COUNTY_PHYSICAL(28),
    COUNTRY_PHYSICAL(29),
    OTHER_NAMES_1(30),
    OTHER_NAMES_2(31),
    OTHER_NAMES_3(32),
    OTHER_NAMES_4(33),
    OTHER_NAMES_5(34),
    KIT_MFR(35),
    KIT_MODEL(36),
    MODE_S_CODE_HEX(37);

    private final int refNumber;
    private static final Map<String, DeregRefColumn> MASTER_MAP = new HashMap<>();

    DeregRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        Arrays.stream(values()).forEach(refColumn -> MASTER_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn));
    }

    public int getRefNumber() {
        return refNumber;
    }
}
