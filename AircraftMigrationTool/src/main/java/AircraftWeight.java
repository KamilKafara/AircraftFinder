import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum AircraftWeight {
    UP_TO_12_499(1),
    BETWEEN_12_500_AND_19_999(2),
    BETWEEN_20_000_AND_OVER(3),
    UAV_UP_TO_55(4);

    private final int refNumber;
    private static final Map<Integer, AircraftWeight> AIRCRAFT_WEIGHT_MAP = new HashMap<>();

    AircraftWeight(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        Arrays.stream(values()).forEach(aircraftWeight -> AIRCRAFT_WEIGHT_MAP.put(aircraftWeight.getRefNumber(), aircraftWeight));
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static AircraftWeight getType(int rerNumber) {
        return getType(String.valueOf(rerNumber));
    }

    public static AircraftWeight getType(String refNumber) {
        return AIRCRAFT_WEIGHT_MAP.get(Integer.parseInt(refNumber));
    }
}
