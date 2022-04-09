import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    private static final String PATH = "C:\\JavaProjects\\AircraftFinder\\AircraftMigrationTool\\target\\classes\\ReleasableAircraft.2021\\";
    private static final int SKIP_VALUE = 1;

    public static void main(String[] args) {
        Stopwatch stopWatchStream = Stopwatch.createStarted();
        System.out.println("Start : " + stopWatchStream);
        long size = 0;
        for (ReleasableAircraftDocumentType type : ReleasableAircraftDocumentType.values()) {
            size = readFileByJavaStream(type).size() + size;
        }
        System.out.println("Size : " + size);
        System.out.println("Stop : " + stopWatchStream);
    }

    private static List readFileByJavaStream(ReleasableAircraftDocumentType releasableAircraftDocumentType) {
        Path file = Path.of(PATH + releasableAircraftDocumentType.getFilename());
        try (Stream<String> lines = Files.lines(file).skip(SKIP_VALUE)) {
            switch (releasableAircraftDocumentType) {
                case ACFTREF -> {
                    return parseAircraftRef(lines);
                }
                case DOCINDEX -> {
                    return parseDocIndexRefs(lines);
                }
                case ENGINE -> {
                    return parseEngineRefs(lines);
                }
                case RESERVED -> {
                    return parseReservedRefs(lines);
                }
                case DEALER -> {
                    return parseDealerRefs(lines);
                }
                case MASTER -> {
                    return parseMasterRefs(lines);
                }
                case DEREG -> {
                    return parseDeregRefs(lines);
                }
                default -> {
                    System.out.println("not found any releasable ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Lists.newArrayList();
    }


    private static List<Object> parseAircraftRef(Stream<String> lines) {
        return lines.map(AircraftRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<EngineRef> parseEngineRefs(Stream<String> lines) {
        return lines.map(EngineRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<DocIndexRef> parseDocIndexRefs(Stream<String> lines) {
        return lines.map(DocIndexRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<ReservedRef> parseReservedRefs(Stream<String> lines) {
        return lines.map(ReservedRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<DealerRef> parseDealerRefs(Stream<String> lines) {
        return lines.map(DealerRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<MasterRef> parseMasterRefs(Stream<String> lines) {
        return lines.map(MasterRefParser::parseRecord).collect(Collectors.toList());
    }

    private static List<DeregRef> parseDeregRefs(Stream<String> lines) {
        return lines.map(DeregRefParser::parseRecord).collect(Collectors.toList());
    }
}

