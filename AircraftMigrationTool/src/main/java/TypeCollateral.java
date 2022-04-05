import java.util.HashMap;
import java.util.Map;

public enum TypeCollateral {
    AIRCRAFT(1),
    ENGINE(2),
    PROPELLER(3),
    SPARE_PARTS(4),
    DOCUMENT(5),
    UNIDENTIFIED(6);

    private final int refNumber;
    private static final Map<String, TypeCollateral> COLLATERAL_TYPE_MAP = new HashMap<>();

    TypeCollateral(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        for (TypeCollateral refColumn : values()) {
            COLLATERAL_TYPE_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn);
        }
    }


    public int getRefNumber() {
        return refNumber;
    }

    public static TypeCollateral getType(String refNumber) {
        return COLLATERAL_TYPE_MAP.get(refNumber);
    }

}
