import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Type Engine
 * 0 - None
 * 1 - Reciprocating
 * 2 - Turbo-prop
 * 3 - Turbo-shaft
 * 4 - Turbo-jet
 * 5 - Turbo-fan
 * 6 – Ramjet
 * 7 - 2 Cycle
 * 8 - 4 Cycle
 * 9 – Unknown
 * 10 – Electric
 * 11 - Rotary
 */
enum AircraftEngineType {
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
        Arrays.stream(values()).forEach(engineType -> ENGINE_TYPES.put(engineType.getRefNumber(), engineType));
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static AircraftEngineType getType(int rerNumber) {
        return getType(String.valueOf(rerNumber));
    }

    public static AircraftEngineType getType(String refNumber) {
        refNumber = refNumber.replaceAll("\\s", "");
        if (Strings.isNullOrEmpty(refNumber)) {
            return AircraftEngineType.NONE;
        }
        return ENGINE_TYPES.get(Integer.parseInt(refNumber));
    }
}
