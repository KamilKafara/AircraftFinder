import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum AircraftRefColumn {
    CODE(0),
    MANUFACTURE(1),
    MODEL(2),
    TYPE_AIRCRAFT(3),
    TYPE_ENGINE(4),
    CATEGORY(5),
    BUILD_CERT_IND(6),
    NUMBER_OF_ENGINES(7),
    NUMBER_OF_SEATS(8),
    WEIGHT(9),
    CRUISING_SPEED(10),
    TYPE_CERTIFICATE_DATA_SHEET(11),
    TYPE_CERTIFICATE_DATA_HOLDER(12);

    private final int refNumber;
    private static final Map<String, AircraftRefColumn> AIRCRAFT_REF_NUMBER = new HashMap<>();

    AircraftRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        Arrays.stream(values()).forEach(refColumn -> AIRCRAFT_REF_NUMBER.put(String.valueOf(refColumn.getRefNumber()), refColumn));
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static int getRefNumber(AircraftRefColumn label) {
        return AIRCRAFT_REF_NUMBER.get(label).getRefNumber();
    }

}

