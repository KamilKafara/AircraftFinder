class EngineRefParser {
    static EngineRef parseRecord(String record) {
        String[] recordArray = record.split(",");
        EngineRef.EngineRefBuilder engineRef = new EngineRef.EngineRefBuilder()
                .code(recordArray[EngineRefColumn.CODE.getRefNumber()])
                .manufacture(recordArray[EngineRefColumn.MANUFACTURE.getRefNumber()])
                .model(recordArray[EngineRefColumn.MODEL.getRefNumber()])
                .type(getAircraftEngineType(recordArray))
                .horsepower(recordArray[EngineRefColumn.HORSEPOWER.getRefNumber()])
                .thrust(recordArray[EngineRefColumn.THRUST.getRefNumber()]);

        return engineRef.build();
    }

    static AircraftEngineType getAircraftEngineType(String[] recordArray) {
        String value = recordArray[EngineRefColumn.TYPE.getRefNumber()];
        return AircraftEngineType.getType(value);
    }

}

