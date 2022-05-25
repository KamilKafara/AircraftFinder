import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DealerRefParser implements RecordParser {

    public static List<DealerRef> parseDealerRefs(Stream<String> lines) {
        return lines.map(DealerRefParser::parseRecord).collect(Collectors.toList());
    }

    private static DealerRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);

        DealerRef.DealerRefBuilder dealerRefBuilder = new DealerRef.DealerRefBuilder()
                .certificateNumber(recordArray[DealerRefColumn.CERTIFICATE_NUMBER.getRefNumber()])
                .ownership(getOwnership(recordArray))
                .certificateIssueDate(recordArray[DealerRefColumn.CERTIFICATE_DATE.getRefNumber()])
                .expirationDate(recordArray[DealerRefColumn.EXPIRATION_DATE.getRefNumber()])
                .expirationFlag(recordArray[DealerRefColumn.EXPIRATION_FLAG.getRefNumber()])
                .cumulativeIssueCount(recordArray[DealerRefColumn.CERTIFICATE_ISSUE_COUNT.getRefNumber()])
                .name(recordArray[DealerRefColumn.NAME.getRefNumber()])
                .street1Address(recordArray[DealerRefColumn.STREET.getRefNumber()])
                .street2Address(recordArray[DealerRefColumn.STREET2.getRefNumber()])
                .city(recordArray[DealerRefColumn.CITY.getRefNumber()])
                .state(recordArray[DealerRefColumn.STATE_ABBREV.getRefNumber()])
                .zipCode(recordArray[DealerRefColumn.ZIP_CODE.getRefNumber()])
                .otherNamesCount(recordArray[DealerRefColumn.OTHER_NAMES_COUNT.getRefNumber()])
                .otherNames(getOtherNames(recordArray));
        return dealerRefBuilder.build();
    }

    static Ownership getOwnership(String[] recordArray) {
        String value = recordArray[DealerRefColumn.OWNERSHIP.getRefNumber()];
        return Ownership.getType(value);
    }

    private static List<String> getOtherNames(String[] recordArray) {
        return Lists.newArrayList(recordArray[DealerRefColumn.OTHER_NAMES_1.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_2.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_3.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_4.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_5.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_6.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_7.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_8.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_9.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_10.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_11.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_12.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_13.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_14.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_15.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_16.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_17.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_18.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_19.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_20.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_21.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_22.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_23.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_24.getRefNumber()],
                recordArray[DealerRefColumn.OTHER_NAMES_25.getRefNumber()]);
    }
}
