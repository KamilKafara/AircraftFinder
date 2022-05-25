import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ReservedRefParser implements RecordParser {
    public static List<ReservedRef> parseReservedRefs(Stream<String> lines) {
        return lines.map(ReservedRefParser::parseRecord).collect(Collectors.toList());
    }

    public static ReservedRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);

        ReservedRef.ReservedRefBuilder reservedRef = new ReservedRef.ReservedRefBuilder()
                .nNumber(recordArray[ReservedRefColumn.N_NUMBER.getRefNumber()])
                .registrant(recordArray[ReservedRefColumn.REGISTRANT.getRefNumber()])
                .street(recordArray[ReservedRefColumn.STREET.getRefNumber()])
                .street2(recordArray[ReservedRefColumn.STREET2.getRefNumber()])
                .city(recordArray[ReservedRefColumn.CITY.getRefNumber()])
                .zipCode(recordArray[ReservedRefColumn.ZIP_CODE.getRefNumber()])
                .rsvDate(recordArray[ReservedRefColumn.RSV_DATE.getRefNumber()])
                .typeReservation(recordArray[ReservedRefColumn.TR.getRefNumber()])
                .expiratyionNoticeDate(recordArray[ReservedRefColumn.EXP_DATE.getRefNumber()])
                .nNumChg(recordArray[ReservedRefColumn.N_NUM_CHG.getRefNumber()])
                .purgeDate(recordArray[ReservedRefColumn.PURGE_DATE.getRefNumber()]);
        return reservedRef.build();
    }
}
