import java.util.HashMap;
import java.util.Map;

enum AircraftType {
    GLIDER("1"),
    BALLOON("2"),
    BLIMP_DIRIGIBLE("3"),
    FIXED_WING_SINGLE_ENGINE("4"),
    FIXED_WING_MULTI_ENGINE("5"),
    ROTORCRAFT("6"),
    WEIGHT_SHIFT_CONTROL("7"),
    POWERED_PARACHUTE("8"),
    GYROPLANE("9"),
    HYBRID_LIFT("H"),
    OTHER("O");

    private final String refNumber;
    private static final Map<String, AircraftType> AIRCRAFT_TYPE_MAP = new HashMap<>();

    static {
        for (AircraftType aircraftType : values()) {
            AIRCRAFT_TYPE_MAP.put(String.valueOf(aircraftType.getRefNumber()), aircraftType);
        }
    }

    AircraftType(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public static AircraftType getType(int refNumber) {
        return getType(String.valueOf(refNumber));
    }

    public static AircraftType getType(String refNumber) {
        return AIRCRAFT_TYPE_MAP.get(refNumber);
    }

}
