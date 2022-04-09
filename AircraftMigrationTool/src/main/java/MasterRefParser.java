class MasterRefParser {
    static MasterRef parseRecord(String record) {
        String[] recordArray = record.split(",");

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
                .registrantsRegion(recordArray[MasterRefColumn.ZIP_CODE.getRefNumber()])
                .countryMail1(recordArray[MasterRefColumn.REGION.getRefNumber()])
                .countryMail2(recordArray[MasterRefColumn.COUNTY.getRefNumber()])
                .lastActivityDate(recordArray[MasterRefColumn.COUNTRY.getRefNumber()])
                .certificateIssueDate(recordArray[MasterRefColumn.LAST_ACTION_DATE.getRefNumber()])
                .certificateRequestedType(recordArray[MasterRefColumn.CERT_ISSUE_DATE.getRefNumber()])
                .typeAircraft(recordArray[MasterRefColumn.CERTIFICATION.getRefNumber()])
                .typeEngine(recordArray[MasterRefColumn.TYPE_AIRCRAFT.getRefNumber()])
                .statusCode(recordArray[MasterRefColumn.TYPE_ENGINE.getRefNumber()])
                .modelSCode(recordArray[MasterRefColumn.STATUS_CODE.getRefNumber()])
                .fractionalOwnership(recordArray[MasterRefColumn.MODE_S_CODE.getRefNumber()])
                .airworthinessDate(recordArray[MasterRefColumn.FRACT_OWNER.getRefNumber()])
                .otherName1(recordArray[MasterRefColumn.AIR_WORTH_DATE.getRefNumber()])
                .otherName2(recordArray[MasterRefColumn.OTHER_NAMES_1.getRefNumber()])
                .otherName3(recordArray[MasterRefColumn.OTHER_NAMES_2.getRefNumber()])
                .otherName4(recordArray[MasterRefColumn.OTHER_NAMES_3.getRefNumber()])
                .otherName5(recordArray[MasterRefColumn.OTHER_NAMES_4.getRefNumber()])
                .expirationDate(recordArray[MasterRefColumn.OTHER_NAMES_5.getRefNumber()])
                .uniqueId(recordArray[MasterRefColumn.EXPIRATION_DATE.getRefNumber()])
                .kitMfr(recordArray[MasterRefColumn.UNIQUE_ID.getRefNumber()])
                .kitModel(recordArray[MasterRefColumn.KIT_MFR.getRefNumber()]);

        return masterRef.build();
    }
}
