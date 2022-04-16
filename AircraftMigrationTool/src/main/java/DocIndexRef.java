import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * AIRCRAFT DOCUMENT INDEX FILE
 * Contains data on each document for recordation with the FAA Aircraft Registry and it is indexed by
 * collateral identification (usually aircraft registration "N" number)
 */
@Builder
@ToString
@EqualsAndHashCode
class DocIndexRef {
    /**
     * 1 - Aircraft
     * 2 - Engine
     * 3 - Propeller
     * 4 - Spare Parts
     * 5 - Document
     * 9 - Unidentified
     */
    private TypeCollateral typeCollateral;
    /**
     * Contents are based on type collateral
     * code, as follows:
     * 1 - Aircraft N-Number
     * 2 - Engine Make, Model and Serial
     * Number
     * 3 - Propeller Make, Model and Serial
     * Number
     * 4 - Spare Parts Location
     * 5 - “DOC”, followed by recordation
     * number
     * 9 - “UNIDENTIFIED” or a partial
     * description of the document
     */
    private String collateral;
    /**
     * Name of party for document being
     * indexed.
     */
    private String nameOfParty;
    /**
     * This is a unique number assigned to a
     * document image.
     */
    private String docId;
    /**
     * Month, day and year document being
     * indexed was filed for recordation with the
     * Aircraft Registry. Recorded as
     * YYYYMMDD
     */
    private String drDate;
    /**
     * Date record was entered into file.
     * YYMMDD format.
     */
    private String processingDate;
    /**
     * Date of latest correction. Blank unless
     * corrections have been made to record.
     * YYYYMMDD format.
     */
    private String corrDate;
    /**
     * Denotes if record has been added or
     * corrected.
     * A - Record was added
     * C - Record was changed
     */
    private String corrId;
    /**
     * Serial Number for engine or propeller
     */
    private String serialId;

}
