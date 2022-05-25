import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * RESERVE N-NUMBER FILE
 * This file contains names and addresses of persons and/or companies who have reserved the Aircraft
 * Registration N-number. File is in N-number sequence.
 */
@Builder
@ToString
@EqualsAndHashCode
class ReservedRef {
    /**
     * N-Number
     */
    private String nNumber;
    /**
     * Reserving Party Name
     */
    private String registrant;
    /**
     * The address of the reserving party.
     */
    private String street;
    /**
     * 2nd street if applicable
     */
    private String street2;
    /**
     * City/Town name
     */
    private String city;
    /**
     * Two digit state code
     */
    private String state;
    /**
     * Postal zip code
     */
    private String zipCode;
    /**
     * Format YYYYMMDD
     */
    private String rsvDate;
    /**
     * Two digit code take from Type
     * Reservation.
     * AA - Reserved - no fee
     * A - Fee paid, notice for expiration sent
     * HD - 2 year hold for canceled N-Numbers
     * FN - Fee paid, notice for expiration sent
     * FP - Fee paid
     * MF - Reserved to manufacturer - no fee,
     * no expiration date
     * MT - Reserved to manufacturer -
     * temporary number
     * NC - N-Number change is in process
     * NN - N-Number change is in process,
     * expiration notice sent
     * CN - N-Number change, Expire Notice
     * Sent
     * CE – N-Number change Expired
     */
    private String typeReservation;
    /**
     * Format YYYYMMDD
     */
    private String expiratyionNoticeDate;
    /**
     * Changed N-Number
     */
    private String nNumChg;
    /**
     * Format YYYYMMDD
     */
    private String purgeDate;
}
