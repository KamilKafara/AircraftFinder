class DealerRefParser {
    static DealerRef parseRecord(String record) {
        String[] recordArray = record.split(",");

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
                //todo: otherName parse to map
                .otherName1(recordArray[DealerRefColumn.OTHER_NAMES_1.getRefNumber()])
                .otherName2(recordArray[DealerRefColumn.OTHER_NAMES_2.getRefNumber()])
                .otherName3(recordArray[DealerRefColumn.OTHER_NAMES_3.getRefNumber()])
                .otherName4(recordArray[DealerRefColumn.OTHER_NAMES_4.getRefNumber()])
                .otherName5(recordArray[DealerRefColumn.OTHER_NAMES_5.getRefNumber()])
                .otherName6(recordArray[DealerRefColumn.OTHER_NAMES_6.getRefNumber()])
                .otherName7(recordArray[DealerRefColumn.OTHER_NAMES_7.getRefNumber()])
                .otherName8(recordArray[DealerRefColumn.OTHER_NAMES_8.getRefNumber()])
                .otherName9(recordArray[DealerRefColumn.OTHER_NAMES_9.getRefNumber()])
                .otherName10(recordArray[DealerRefColumn.OTHER_NAMES_10.getRefNumber()])
                .otherName11(recordArray[DealerRefColumn.OTHER_NAMES_11.getRefNumber()])
                .otherName12(recordArray[DealerRefColumn.OTHER_NAMES_12.getRefNumber()])
                .otherName13(recordArray[DealerRefColumn.OTHER_NAMES_13.getRefNumber()])
                .otherName14(recordArray[DealerRefColumn.OTHER_NAMES_14.getRefNumber()])
                .otherName15(recordArray[DealerRefColumn.OTHER_NAMES_15.getRefNumber()])
                .otherName16(recordArray[DealerRefColumn.OTHER_NAMES_16.getRefNumber()])
                .otherName17(recordArray[DealerRefColumn.OTHER_NAMES_17.getRefNumber()])
                .otherName18(recordArray[DealerRefColumn.OTHER_NAMES_18.getRefNumber()])
                .otherName19(recordArray[DealerRefColumn.OTHER_NAMES_19.getRefNumber()])
                .otherName20(recordArray[DealerRefColumn.OTHER_NAMES_20.getRefNumber()])
                .otherName21(recordArray[DealerRefColumn.OTHER_NAMES_21.getRefNumber()])
                .otherName22(recordArray[DealerRefColumn.OTHER_NAMES_22.getRefNumber()])
                .otherName23(recordArray[DealerRefColumn.OTHER_NAMES_23.getRefNumber()])
                .otherName24(recordArray[DealerRefColumn.OTHER_NAMES_24.getRefNumber()])
                .otherName25(recordArray[DealerRefColumn.OTHER_NAMES_25.getRefNumber()]);
        return dealerRefBuilder.build();
    }

    static Ownership getOwnership(String[] recordArray) {
        String value = recordArray[DealerRefColumn.OWNERSHIP.getRefNumber()];
        return Ownership.getType(value);
    }


}
