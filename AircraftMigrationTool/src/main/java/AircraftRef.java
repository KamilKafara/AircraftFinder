import lombok.Builder;
import lombok.ToString;

/**
 * AIRCRAFT REFERENCE FILE
 * The two reference files are required to identify the aircraft manufacturer/model/series codes and the engine
 */
@Builder
@ToString
class AircraftRef {
    /**
     * A code assigned to the aircraft manufacturer, model and series.
     * Position (1-3) Manufacturer Code
     * Position (4-5) Model Code
     * Position (6-7) Series Code
     */
    private String code;
    /**
     * Name of the aircraft manufacturer.
     */
    private String manufacture;
    /**
     * Name of the aircraft model and series
     */
    private String model;
    private AircraftType typeAircraft;
    private AircraftEngineType typeEngine;
    private AircraftCategoryCode category;
    private BuilderCertificationCode builderCertificationCode;
    /**
     * Number of engines on the aircraft
     */
    private String numberOfEngines;
    /**
     * Maximum number of seats in the aircraft.
     */
    private String numberOfSeats;
    /**
     * Aircraft maximum gross take off weight
     * in pounds.
     * 1 - Up to 12,499
     * 2 - 12,500 - 19,999
     * 3 - 20,000 and over.
     * 4 – UAV up to 55
     */
    private AircraftWeight weight;
    /**
     * Aircraft average cruising speed in miles
     * per hour. This data element is not present
     * on all records
     */
    private AircraftCruisingSpeed cruisingSpeed;
    private String typeCertificateDataSheet;
    private String typeCertificateDataHolder;
}
