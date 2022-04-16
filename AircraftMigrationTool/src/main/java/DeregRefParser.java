import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DeregRefParser implements RecordParser {

    public static List<DeregRef> parseDeregRefs(Stream<String> lines) {
        return lines.map(DeregRefParser::parseRecord).collect(Collectors.toList());
    }

    private static DeregRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);

        DeregRef.DeregRefBuilder refBuilder = new DeregRef.DeregRefBuilder()
                .nNumber(recordArray[DeregRefColumn.N_NUMBER.getRefNumber()])
                .serialNumber(recordArray[DeregRefColumn.SERIAL_NUMBER.getRefNumber()])
                .mfrMdlCode(recordArray[DeregRefColumn.MFR_MDL_CODE.getRefNumber()])
                .statusCode(recordArray[DeregRefColumn.STATUS_CODE.getRefNumber()])
                .name(recordArray[DeregRefColumn.NAME.getRefNumber()])
                .streetMail(recordArray[DeregRefColumn.STREET_MAIL.getRefNumber()])
                .street2Mail(recordArray[DeregRefColumn.STREET2_MAIL.getRefNumber()])
                .cityMail(recordArray[DeregRefColumn.CITY_MAIL.getRefNumber()])
                .stateAbbrevMail(recordArray[DeregRefColumn.STATE_ABBREV_MAIL.getRefNumber()])
                .zipCodeMail(recordArray[DeregRefColumn.ZIP_CODE_MAIL.getRefNumber()])
                .engMfrMdl(recordArray[DeregRefColumn.ENG_MFR_MDL.getRefNumber()])
                .yearMfr(recordArray[DeregRefColumn.YEAR_MFR.getRefNumber()])
                .certification(recordArray[DeregRefColumn.CERTIFICATION.getRefNumber()])
                .region(recordArray[DeregRefColumn.REGION.getRefNumber()])
                .countyMail(recordArray[DeregRefColumn.COUNTY_MAIL.getRefNumber()])
                .countryMail(recordArray[DeregRefColumn.COUNTRY_MAIL.getRefNumber()])
                .airWorthDate(recordArray[DeregRefColumn.AIR_WORTH_DATE.getRefNumber()])
                .cancelDate(recordArray[DeregRefColumn.CANCEL_DATE.getRefNumber()])
                .modeSCode(recordArray[DeregRefColumn.MODE_S_CODE.getRefNumber()])
                .indicatorGroup(recordArray[DeregRefColumn.INDICATOR_GROUP.getRefNumber()])
                .expCountry(recordArray[DeregRefColumn.EXP_COUNTRY.getRefNumber()])
                .lastActDate(recordArray[DeregRefColumn.LAST_ACT_DATE.getRefNumber()])
                .certIssueDate(recordArray[DeregRefColumn.CERT_ISSUE_DATE.getRefNumber()])
                .streetPhysical(recordArray[DeregRefColumn.STREET_PHYSICAL.getRefNumber()])
                .street2Physical(recordArray[DeregRefColumn.STREET2_PHYSICAL.getRefNumber()])
                .cityPhysical(recordArray[DeregRefColumn.CITY_PHYSICAL.getRefNumber()])
                .stateAbbrevPhysical(recordArray[DeregRefColumn.STATE_ABBREV_PHYSICAL.getRefNumber()])
                .zipCodePhysical(recordArray[DeregRefColumn.ZIP_CODE_PHYSICAL.getRefNumber()])
                .countyPhysical(recordArray[DeregRefColumn.COUNTY_PHYSICAL.getRefNumber()])
                .countryPhysical(recordArray[DeregRefColumn.COUNTRY_PHYSICAL.getRefNumber()])
                .otherNames(getOtherNames(recordArray))
                .kitMfr(recordArray[DeregRefColumn.KIT_MFR.getRefNumber()])
                .kitModel(recordArray[DeregRefColumn.KIT_MODEL.getRefNumber()])
                .modeSCodeHex(recordArray[DeregRefColumn.MODE_S_CODE_HEX.getRefNumber()]);

        return refBuilder.build();
    }

    private static List<String> getOtherNames(String[] recordArray) {
        return Lists.newArrayList(recordArray[DeregRefColumn.OTHER_NAMES_1.getRefNumber()],
                recordArray[DeregRefColumn.OTHER_NAMES_2.getRefNumber()],
                recordArray[DeregRefColumn.OTHER_NAMES_3.getRefNumber()],
                recordArray[DeregRefColumn.OTHER_NAMES_4.getRefNumber()],
                recordArray[DeregRefColumn.OTHER_NAMES_5.getRefNumber()]);
    }
}
