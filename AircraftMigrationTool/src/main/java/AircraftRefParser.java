import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AircraftRefParser implements RecordParser {

    public static List<AircraftRef> parseAircraftRef(Stream<String> lines) {
        return lines.map(AircraftRefParser::parseRecord).collect(Collectors.toList());
    }

    private static AircraftRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);
        AircraftRef.AircraftRefBuilder aircraftRef = new AircraftRef.AircraftRefBuilder()
                .code(recordArray[AircraftRefColumn.CODE.getRefNumber()])
                .manufacture(recordArray[AircraftRefColumn.MANUFACTURE.getRefNumber()])
                .model(recordArray[AircraftRefColumn.MODEL.getRefNumber()])
                .typeAircraft(getAircraftType(recordArray))
                .typeEngine(getAircraftEngineType(recordArray))
                .category(getAircraftCategoryCode(recordArray))
                .builderCertificationCode(getBuilderCertificationCode(recordArray))
                .numberOfEngines(recordArray[AircraftRefColumn.NUMBER_OF_ENGINES.getRefNumber()])
                .numberOfSeats(recordArray[AircraftRefColumn.NUMBER_OF_SEATS.getRefNumber()])
                .weight(getAircraftWeight(recordArray))
                .cruisingSpeed(getAircraftCruisingSpeed(recordArray))
                .typeCertificateDataSheet(recordArray[AircraftRefColumn.TYPE_CERTIFICATE_DATA_SHEET.getRefNumber()])
                .typeCertificateDataHolder(recordArray[AircraftRefColumn.TYPE_CERTIFICATE_DATA_HOLDER.getRefNumber()]);
        return aircraftRef.build();
    }

    private static AircraftType getAircraftType(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.TYPE_AIRCRAFT.getRefNumber()];
        return AircraftType.getType(value);
    }

    private static AircraftEngineType getAircraftEngineType(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.TYPE_ENGINE.getRefNumber()];
        return AircraftEngineType.getType(value);
    }

    private static AircraftCategoryCode getAircraftCategoryCode(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.CATEGORY.getRefNumber()]
                .replaceAll("\\s", "");
        return AircraftCategoryCode.getCode(value);
    }

    private static BuilderCertificationCode getBuilderCertificationCode(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.BUILD_CERT_IND.getRefNumber()]
                .replaceAll("\\s", "");
        return BuilderCertificationCode.getType(value);
    }

    private static AircraftWeight getAircraftWeight(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.WEIGHT.getRefNumber()]
                .replaceAll("CLASS\\s", "");
        return AircraftWeight.getType(value);
    }

    private static AircraftCruisingSpeed getAircraftCruisingSpeed(String[] recordArray) {
        String value = recordArray[AircraftRefColumn.CRUISING_SPEED.getRefNumber()]
                .replaceAll("\\s", "");
        return AircraftCruisingSpeed.getType(value);
    }
}
