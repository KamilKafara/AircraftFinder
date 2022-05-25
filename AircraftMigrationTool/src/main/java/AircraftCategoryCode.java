import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum AircraftCategoryCode {
    LAND(1),
    SEA(2),
    AMPHIBIAN(3);

    private final int refNumber;

    AircraftCategoryCode(int refNumber) {
        this.refNumber = refNumber;
    }

    private static final Map<String, AircraftCategoryCode> AIRCRAFT_CATEGORY_CODES = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(categoryCode -> AIRCRAFT_CATEGORY_CODES.put(String.valueOf(categoryCode.getCodeName()), categoryCode));
    }

    public int getCodeName() {
        return refNumber;
    }

    public static AircraftCategoryCode getCode(int number) {
        return getCode(String.valueOf(number));
    }

    public static AircraftCategoryCode getCode(String refNumber) {
        return AIRCRAFT_CATEGORY_CODES.get(refNumber);
    }
}
