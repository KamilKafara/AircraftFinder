import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum AircraftCruisingSpeed {
    UP_TO_12_499(1),
    BETWEEN_12_500_AND_19_999(2),
    BETWEEN_20_000_AND_OVER(3),
    UAV_UP_TO_55(4);

    private final int refNumber;
    private static final Map<Integer, AircraftCruisingSpeed> CRUISING_SPEED_MAP = new HashMap<>();

    AircraftCruisingSpeed(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        Arrays.stream(values()).forEach(engineType -> CRUISING_SPEED_MAP.put(engineType.getRefNumber(), engineType));
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static AircraftCruisingSpeed getType(int rerNumber) {
        return getType(String.valueOf(rerNumber));
    }

    public static AircraftCruisingSpeed getType(String refNumber) {
        return CRUISING_SPEED_MAP.get(Integer.parseInt(refNumber));
    }
}
