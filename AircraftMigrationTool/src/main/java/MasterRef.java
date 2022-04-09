import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * AIRCRAFT REGISTRATION MASTER FILE
 *
 * Contains the records of all U.S. Civil Aircraft maintained by the FAA, Civil Aviation Registry, Aircraft
 * Registration Branch, AFS-750
 */
@Builder
@ToString
@EqualsAndHashCode
class MasterRef {
    private String nNumber;
    private String serialNumber;
    private String aircraftMfrModelCode;
    private String engineMfrModeCode;
    private String yearMfr;
    private String typeRegistrant;
    private String registrantsName;
    private String street1;
    private String street2;
    private String registrantsCity;
    private String registrantsState;
    private String registrantsRegion;
    private String countryMail1;
    private String countryMail2;
    private String lastActivityDate;
    private String certificateIssueDate;
    private String certificateRequestedType;
    private String typeAircraft;
    private String typeEngine;
    private String statusCode;
    private String modelSCode;
    private String fractionalOwnership;
    private String airworthinessDate;
    private String otherName1;
    private String otherName2;
    private String otherName3;
    private String otherName4;
    private String otherName5;
    private String expirationDate;
    private String uniqueId;
    private String kitMfr;
    private String kitModel;
    private String modeSCodeHex;
}
