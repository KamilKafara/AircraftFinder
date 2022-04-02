public class AircraftRefParser implements ReleasableAircraft {

    static AircraftRef parseAircraftRefRecord(String record) {
        String[] recordArray = record.split(",");
        AircraftRef.AircraftRefBuilder aircraftRef = new AircraftRef.AircraftRefBuilder()
                .code(recordArray[AircraftRefColumn.CODE.getIndex()])
                .manufacture(recordArray[AircraftRefColumn.MANUFACTURE.getIndex()])
                .model(recordArray[AircraftRefColumn.MODEL.getIndex()])
                .typeAircraft(getAircraftType(recordArray))
                .typeEngine(getAircraftEngineType(recordArray))
                .category(getAircraftCategoryCode(recordArray))
                .builderCertificationCode(getBuilderCertificationCode(recordArray))
                .numberOfEngines(recordArray[AircraftRefColumn.NUMBER_OF_ENGINES.getIndex()])
                .numberOfSeats(recordArray[AircraftRefColumn.NUMBER_OF_SEATS.getIndex()])
                .weight(getAircraftWeight(recordArray))
                .cruisingSpeed(getAircraftCruisingSpeed(recordArray))
                .typeCertificateDataSheet(recordArray[AircraftRefColumn.TYPE_CERTIFICATE_DATA_SHEET.getIndex()])
                .typeCertificateDataHolder(recordArray[AircraftRefColumn.TYPE_CERTIFICATE_DATA_HOLDER.getIndex()]);
        return aircraftRef.build();
    }

    private static AircraftType getAircraftType(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.TYPE_AIRCRAFT.getIndex()];
        return AircraftType.getType(value);
    }

    private static AircraftEngineType getAircraftEngineType(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.TYPE_ENGINE.getIndex()];
        return AircraftEngineType.getType(value);
    }

    private static AircraftCategoryCode getAircraftCategoryCode(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.CATEGORY.getIndex()].replaceAll("\\s", "");
        return AircraftCategoryCode.getCode(value);
    }

    private static BuilderCertificationCode getBuilderCertificationCode(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.BUILD_CERT_IND.getIndex()].replaceAll("\\s", "");
        return BuilderCertificationCode.getType(value);
    }

    private static AircraftWeight getAircraftWeight(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.WEIGHT.getIndex()].replaceAll("CLASS\\s", "");
        return AircraftWeight.getType(value);
    }

    private static AircraftCruisingSpeed getAircraftCruisingSpeed(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.CRUISING_SPEED.getIndex()]
                .replaceAll("\\s", "");
        return AircraftCruisingSpeed.getType(value);
    }

}
