import java.util.HashMap;
import java.util.Map;

public enum AircraftRefColumn {
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

    private final int index;
    private static final Map<String, AircraftRefColumn> AIRCRAFT_REF_COLUMN = new HashMap<>();

    static {
        for (AircraftRefColumn refColumn : values()) {
            AIRCRAFT_REF_COLUMN.put(String.valueOf(refColumn.getIndex()), refColumn);
        }
    }

    AircraftRefColumn(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static int indexOfLabel(AircraftRefColumn label) {
        return AIRCRAFT_REF_COLUMN.get(label).getIndex();
    }

}

