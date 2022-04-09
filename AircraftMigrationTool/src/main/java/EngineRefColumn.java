import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum EngineRefColumn {
    CODE(0),
    MANUFACTURE(1),
    MODEL(2),
    TYPE(3),
    HORSEPOWER(4),
    THRUST(5);

    private final int refNumber;
    private static final Map<String, EngineRefColumn> ENGINE_REF_NUMBER = new HashMap<>();

    EngineRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        Arrays.stream(values()).forEach(refColumn -> ENGINE_REF_NUMBER.put(String.valueOf(refColumn.getRefNumber()), refColumn));
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static int getRefNumber(EngineRefColumn label) {
        return ENGINE_REF_NUMBER.get(label).getRefNumber();
    }
}
