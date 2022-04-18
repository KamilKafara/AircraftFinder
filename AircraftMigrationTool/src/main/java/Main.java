import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Main {
    private static final String PATH = "C:\\JavaProjects\\AircraftFinder\\AircraftMigrationTool\\target\\classes\\ReleasableAircraft.2021\\";
    private static final int SKIP_VALUE = 1;
    private static final Map<ReleasableAircraftDocumentType, List<?>> TYPES = new HashMap<>();

    public static void main(String[] args) {
        Stopwatch stopWatchStream = Stopwatch.createStarted();
        System.out.println("Start : " + stopWatchStream);
        for (ReleasableAircraftDocumentType type : ReleasableAircraftDocumentType.values()) {
            TYPES.put(type, readFileByDocumentType(type));
        }
        System.out.println("Stop : " + stopWatchStream);
    }

    public static List<?> readFileByDocumentType(ReleasableAircraftDocumentType releasableAircraftDocumentType) {
        Path file = Path.of(PATH + releasableAircraftDocumentType.getFilename());
        Stopwatch stopWatchStream = Stopwatch.createStarted();
        List<?> result = Lists.newArrayList();
        try (Stream<String> lines = Files.lines(file).skip(SKIP_VALUE)) {
            switch (releasableAircraftDocumentType) {
                case ACFTREF -> {
                    result = AircraftRefParser.parseAircraftRef(lines);
                }
                case DOCINDEX -> {
                    result = DocIndexRefParser.parseDocIndexRefs(lines);
                }
                case ENGINE -> {
                    result = EngineRefParser.parseEngineRefs(lines);
                }
                case RESERVED -> {
                    result = ReservedRefParser.parseReservedRefs(lines);
                }
                case DEALER -> {
                    result = DealerRefParser.parseDealerRefs(lines);
                }
                case MASTER -> {
                    result = MasterRefParser.parseMasterRefs(lines);
                }
                case DEREG -> {
                    result = DeregRefParser.parseDeregRefs(lines);
                }
                default -> {
                    System.out.println("not found any releasable document");
                    return result;
                }
            }
            System.out.println("Stop: " + stopWatchStream + " type: " + releasableAircraftDocumentType + " size: " + result.size());

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Lists.newArrayList();
    }

    public static Map<ReleasableAircraftDocumentType, List<?>> getTYPES() {
        return TYPES;
    }
}
