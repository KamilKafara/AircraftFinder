import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
     * 2
     * nd mailing street address for applicant
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
    private String otherName1;
    private String otherName2;
    private String otherName3;
    private String otherName4;
    private String otherName5;
    private String otherName6;
    private String otherName7;
    private String otherName8;
    private String otherName9;
    private String otherName10;
    private String otherName11;
    private String otherName12;
    private String otherName13;
    private String otherName14;
    private String otherName15;
    private String otherName16;
    private String otherName17;
    private String otherName18;
    private String otherName19;
    private String otherName20;
    private String otherName21;
    private String otherName22;
    private String otherName23;
    private String otherName24;
    private String otherName25;
    private String otherName26;
}
