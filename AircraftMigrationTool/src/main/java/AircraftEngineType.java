import java.util.HashMap;
import java.util.Map;

public enum AircraftEngineType {
    NONE(0),
    RECIPROCATING(1),
    TURBO_PROP(2),
    TURBO_SHAFT(3),
    TURBO_JET(4),
    TURBO_FAN(5),
    RAMJET(6),
    TWO_CYCLE(7),
    FOUR_CYCLE(8),
    UNKNOWN(9),
    ELECTRIC(10),
    ROTARY(11);

    private final int refNumber;
    private static final Map<Integer, AircraftEngineType> ENGINE_TYPES = new HashMap<>();

    AircraftEngineType(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        for (AircraftEngineType engineType : values()) {
            ENGINE_TYPES.put(engineType.getRefNumber(), engineType);
        }
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static AircraftEngineType getType(int rerNumber) {
        return getType(String.valueOf(rerNumber));
    }

    public static AircraftEngineType getType(String refNumber) {
        refNumber = refNumber.replaceAll("\\s","");
        return ENGINE_TYPES.get(Integer.parseInt(refNumber));
    }
}
