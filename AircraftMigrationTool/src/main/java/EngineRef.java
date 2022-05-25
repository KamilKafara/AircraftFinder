import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ENGINE REFERENCE FILE
 * CODE,MFR,MODEL,TYPE,HORSEPOWER,THRUST,
 */
@Builder
@ToString
@EqualsAndHashCode
class EngineRef {
    /**
     * A code assigned to the engine
     * manufacturer and model.
     * Positions (1-3) - Manufacturer Code
     * Positions (4-5) - Model Code
     */
    private String code;
    /**
     * The name of the engine manufacturer
     */
    private String manufacture;
    /**
     * The name of the engine model
     */
    private String model;
    /**
     * Type Engine
     */
    private AircraftEngineType type;
    /**
     * Horsepower for engines types 1, 2, 3, 7, 8
     */
    private String horsepower;
    /**
     * Thrust for engine types 4, 5, 6 in pounds
     */
    private String thrust;
}
