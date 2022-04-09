import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum Ownership {
    INDIVIDUAL(1),
    PARTNERSHIP(2),
    CORPORATION(3),
    CO_OWNERSHIP(4),
    LLC(7),
    NON_CITIZEN_CORPORATION(8);

    private final int refNumber;
    private static final Map<String, Ownership> OWNERSHIP_MAP = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(refColumn -> OWNERSHIP_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn));
    }

    Ownership(int refNumber) {
        this.refNumber = refNumber;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static int getRefNumber(Ownership label) {
        return OWNERSHIP_MAP.get(label).getRefNumber();
    }

    public static Ownership getType(String label) {
        return OWNERSHIP_MAP.get(label);
    }
}
