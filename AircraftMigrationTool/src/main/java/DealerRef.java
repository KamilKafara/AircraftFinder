import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * AIRCRAFT DEALER APPLICANT FILE
 * This file contains aircraft dealers and aircraft manufacturers who have made application for Dealer's
 * Aircraft Registration Certificates. All records which exists on the AR Dealer Data Base File appear in this file.
 */

@Builder
@ToString
@EqualsAndHashCode
class DealerRef {
    /**
     * Format is ‘YY-NNNN’ where ‘YY’ is
     * year. ‘NNNN’ is a unique four position
     * numeric field with leading zeros.
     */
    private String certificateNumber;
    /**
     * One position numeric field. As follows:
     * 1 - Individual
     * 2 - Partnership
     * 3 - Corporation
     * 4 - Co-Ownership
     * 7 - LLC
     * 8 – Non Citizen Corporation
     */
    private Ownership ownership;
    /**
     * Format is YYYYMMDD.
     */
    private String certificateIssueDate;
    /**
     * Format is YYYYMMDD.
     */
    private String expirationDate;
    /**
     * Contains ‘*’ for all expired records. An
     * expired record remains on file for 90
     * days
     */
    private String expirationFlag;
    /**
     * Cumulative count of total Dealer’s
     * Aircraft Registration Certificates issued
     * for a Certificate Number.
     */
    private String cumulativeIssueCount;
    /**
     * Aircraft Dealer’s Name.
     */
    private String name;
    /**
     * Mailing street address for applicant
     */
    private String street1Address;
    /**
     * 2'nd mailing street address for applicant
     */
    private String street2Address;
    /**
     * City of applicant.
     */
    private String city;
    /**
     * State or foreign country of applicant.
     */
    private String state;
    /**
     * Ten position alpha field or ‘FORGN’ for
     * foreign countries
     */
    private String zipCode;
    /**
     * Number of other names.
     */
    private String otherNamesCount;
    /**
     * 1'st co-owner or partnership name
     */
    private List<String> otherNames;
}
