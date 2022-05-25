import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * AIRCRAFT DEREGISTERED FILE
 * Contains the records of all U.S. Civil Aircraft Deregistered by the FAA, Civil Aviation Registry, Aircraft
 * Registration Branch, AFS-750
 */

@Builder
@ToString
@EqualsAndHashCode
class DeregRef {
    /**
     * Identification number assigned to aircraft.
     */
    private String nNumber;
    /**
     * The complete aircraft serial number
     * assigned to the aircraft by the
     * manufacturer.
     */
    private String serialNumber;
    /**
     * A code assigned to the aircraft
     * manufacturer, model and series.
     * Positions (38-40) - Manufacturer Code
     * Positions (41-42) - Model Code
     * Positions (43-44) - Series Code
     */
    private String mfrMdlCode;
    /**
     * A - The Triennial Aircraft Registration
     * form was mailed and has not been
     * returned by the Post Office
     * D - Expired Dealer
     * E - The Certificate of Aircraft
     * Registration was revoked by
     * enforcement action
     * M - Valid - Aircraft assigned to the
     * manufacturer under the
     * manufacturer’s Dealer Certificate
     * N - Non-citizen Corporations which
     * have not returned their flight hour
     * reports
     * R - Registration pending
     * S - Second Triennial Aircraft
     * Registration Form has been mailed
     * and has not been returned by the
     * Post Office
     * T - Valid Registration from a Trainee
     * V - Valid Registration
     * W- Certificate of Registration has been
     * deemed Ineffective or Invalid
     * X - Enforcement Letter
     * Z - Permanent Reserved
     * 1 - Triennial Aircraft Registration form
     * was returned by the Post Office as
     * undeliverable
     * 2 - N-Number Assigned – but has not
     * been Registered
     * 3 - N-Number assigned as amateurbuilt - but not yet registered
     * 4 - N-Number assigned as import -but not yet registered
     * 5 - Reserved N-Number
     * 6 - Administratively canceled
     * 7 - Sale reported
     * 8 - A second attempt has been made at
     * mailing a Triennial Aircraft
     * Registration form to the owner with
     * no response
     * 9 - Certificate of Registration has been
     * revoked
     * 10 - N-Number assigned, has not been
     * registered and is pending
     * cancellation
     * 11 - N-Number assigned as a Non Type
     * Certificated (Amateur) but has not
     * been registered that is pending
     * cancellation
     * 12 - N-Number assigned as import but
     * has not been registered that is
     * pending cancellation
     * 13 - Registration Expired
     * 14 - First Notice for ReRegistration/Renewal
     * 15 - Second Notice for ReRegistration/Renewal
     * 16 - Registration Expired – Pending
     * Cancellation
     * 17 - Sale Reported – Pending
     * Cancellation
     * 18 - Sale Reported – Canceled
     * 19 - Registration Pending – Pending
     * Cancellation
     * 20 - Registration Pending – Canceled
     * 21 - Revoked – Pending Cancellation
     * 22 - Revoked – Canceled
     * 23 - Expired Dealer (Pending
     * Cancellation)
     * 24 - Third Notice for ReRegistration/Renewal
     * 25 - First Notice for Registration
     * Renewal
     * 26 - Second Notice for Registration
     * Renewal
     * 27 - Registration Expired
     * 28 - Third Notice for Registration
     * Renewal
     * 29 - Registration Expired – Pending
     * Cancellation
     */
    private String statusCode;
    /**
     * The first registrant’s name which appears
     * on the Application for Registration, AC
     * Form 8050-1
     */
    private String name;
    /**
     * The street address which appears on the
     * Application for Registration, AC Form
     * 8050-1, or the latest street address
     * reported.
     */
    private String streetMail;
    /**
     * The 2nd street address which appears on
     * the Application for Registration, AC
     * Form 8050-1, or the latest street address
     * reported .
     */
    private String street2Mail;
    /**
     * The city name which appears on the
     * Application for Registration, AC Form
     * 8050-1 or the latest address reported
     */
    private String cityMail;
    /**
     * The state name which appears on the
     * Application for Registration, AC Form
     * 8050-1 or the latest address reported.
     */
    private String stateAbbrevMail;
    /**
     * The postal Zip Code which appears on the
     * Application for Registration, AC Form
     * 8050-1 or the latest address reported.
     */
    private String zipCodeMail;
    /**
     * A code assigned to the engine
     * manufacturer and model.
     * Positions (200-202) - Manufacturer Code
     * Positions (203-204) - Model Code
     */
    private String engMfrMdl;
    /**
     * Year manufactured.
     */
    private String yearMfr;
    /**
     *
     */
    private String certification;
    /**
     * 1 - Eastern
     * 2 - Southwestern
     * 3 - Central
     * 4 - Western-Pacific
     * 5 - Alaskan
     * 7 - Southern
     * 8 - European
     * C- Great Lakes
     * E - New England
     * S - Northwest Mountain
     */
    private String region;
    /**
     * A code representing the county which
     * appears on the Application for
     * Registration
     */
    private String countyMail;
    /**
     * A code representing the country which
     * appears on the Application for
     * Registration.
     */
    private String countryMail;
    /**
     * Date of Airworthiness
     */
    private String airWorthDate;
    /**
     * Date of Cancelation
     */
    private String cancelDate;
    /**
     * Aircraft Transponder Code
     */
    private String modeSCode;
    /**
     * 1 = Individual
     * 2 = Partnership
     * 3 = Corporation
     * 4 = Co-Ownership
     * 5 = Government
     * 7 = LLC
     * 8 = Non-Citizen Corporation
     * 9 = Non-Citizen Co-Ownership
     */
    private String indicatorGroup;
    /**
     * Country Name
     */
    private String expCountry;
    /**
     * Format YYYY/MM/DD
     */
    private String lastActDate;
    /**
     * Format YYYY/MM/DD
     */
    private String certIssueDate;
    /**
     * Physical Address of Registrant.
     */
    private String streetPhysical;
    /**
     * 2'nd Physical Address of Registrant.
     */
    private String street2Physical;
    /**
     * City of Registrant.
     */
    private String cityPhysical;
    /**
     * State or foreign country of Registrant
     */
    private String stateAbbrevPhysical;
    /**
     * Ten position alpha field or ‘FORGN’ for
     * foreign countrie
     */
    private String zipCodePhysical;
    /**
     * A code representing the county which
     * appears on the Application for
     * Registration.
     */
    private String countyPhysical;
    /**
     * A code representing the country which
     * appears on the Application for
     * Registration
     */
    private String countryPhysical;
    /**
     * t co-owner or partnership name
     */
    private List<String> otherNames;
    /**
     * Kit Manufacturer Name
     */
    private String kitMfr;
    /**
     * Kit Model Name
     */
    private String kitModel;
    /**
     * Mode S Code in Hexidecimal Format
     */
    private String modeSCodeHex;
}
