import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MasterRefParser implements RecordParser {

    public static List<MasterRef> parseMasterRefs(Stream<String> lines) {
        return lines.map(MasterRefParser::parseRecord).collect(Collectors.toList());
    }

    private static MasterRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);

        MasterRef.MasterRefBuilder masterRef = new MasterRef.MasterRefBuilder()
                .nNumber(recordArray[MasterRefColumn.N_NUMBER.getRefNumber()])
                .serialNumber(recordArray[MasterRefColumn.SERIAL_NUMBER.getRefNumber()])
                .aircraftMfrModelCode(recordArray[MasterRefColumn.MFR_MDL_CODE.getRefNumber()])
                .engineMfrModeCode(recordArray[MasterRefColumn.ENG_MFR_MDL.getRefNumber()])
                .yearMfr(recordArray[MasterRefColumn.YEAR_MFR.getRefNumber()])
                .typeRegistrant(recordArray[MasterRefColumn.TYPE_REGISTRANT.getRefNumber()])
                .registrantsName(recordArray[MasterRefColumn.NAME.getRefNumber()])
                .street1(recordArray[MasterRefColumn.STREET.getRefNumber()])
                .street2(recordArray[MasterRefColumn.STREET2.getRefNumber()])
                .registrantsCity(recordArray[MasterRefColumn.CITY.getRefNumber()])
                .registrantsState(recordArray[MasterRefColumn.STATE.getRefNumber()])
                .registrantsRegion(recordArray[MasterRefColumn.REGION.getRefNumber()])
                .countryMail1(recordArray[MasterRefColumn.REGION.getRefNumber()])
                .countryMail2(recordArray[MasterRefColumn.COUNTY.getRefNumber()])
                .lastActivityDate(recordArray[MasterRefColumn.LAST_ACTION_DATE.getRefNumber()])
                .certificateIssueDate(recordArray[MasterRefColumn.CERT_ISSUE_DATE.getRefNumber()])
                .certificateRequestedType(recordArray[MasterRefColumn.CERTIFICATION.getRefNumber()])
                .typeAircraft(recordArray[MasterRefColumn.TYPE_AIRCRAFT.getRefNumber()])
                .typeEngine(recordArray[MasterRefColumn.TYPE_ENGINE.getRefNumber()])
                .statusCode(recordArray[MasterRefColumn.STATUS_CODE.getRefNumber()])
                .modelSCode(recordArray[MasterRefColumn.MODE_S_CODE.getRefNumber()])
                .fractionalOwnership(recordArray[MasterRefColumn.FRACT_OWNER.getRefNumber()])
                .airworthinessDate(recordArray[MasterRefColumn.AIR_WORTH_DATE.getRefNumber()])
                .otherNames(getOtherNames(recordArray))
                .expirationDate(recordArray[MasterRefColumn.OTHER_NAMES_5.getRefNumber()])
                .uniqueId(recordArray[MasterRefColumn.EXPIRATION_DATE.getRefNumber()])
                .kitMfr(recordArray[MasterRefColumn.UNIQUE_ID.getRefNumber()])
                .kitModel(recordArray[MasterRefColumn.KIT_MFR.getRefNumber()]);
        return masterRef.build();
    }

    private static List<String> getOtherNames(String[] recordArray) {
        return Lists.newArrayList(recordArray[MasterRefColumn.OTHER_NAMES_1.getRefNumber()],
                recordArray[MasterRefColumn.OTHER_NAMES_2.getRefNumber()],
                recordArray[MasterRefColumn.OTHER_NAMES_4.getRefNumber()],
                recordArray[MasterRefColumn.OTHER_NAMES_3.getRefNumber()]);
    }
}
