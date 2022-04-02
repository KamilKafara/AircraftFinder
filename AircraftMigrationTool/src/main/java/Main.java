import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

class Main {
    private static final String PATH = "C:\\JavaProjects\\AircraftFinder\\AircraftMigrationTool\\target\\classes\\ReleasableAircraft.2021\\";
    private static final int SKIP_VALUE = 1;

    public static void main(String[] args) {
        Stopwatch stopWatchStream = Stopwatch.createStarted();
        var streamReader = readFileByJavaStream();
        System.out.println("Stop : " + stopWatchStream);
    }

    private static List<AircraftRef> readFileByJavaStream() {
        Path file = Path.of(PATH + ReleasableAircraftType.ACFTREF.getFilename());
        List<AircraftRef> aircraftRefList = Lists.newArrayList();
        ReleasableAircraftType releasableAircraftType = ReleasableAircraftType.ACFTREF;
        try (Stream<String> lines = Files.lines(file).skip(SKIP_VALUE)) {
            switch (releasableAircraftType) {
                case ACFTREF -> {
                    lines.forEach(record -> {
                        aircraftRefList.add(AircraftRefParser.parseAircraftRefRecord(record));
                    });
                }
                case DEALER -> {
                    break;
                }
                case DEREG -> {
                    break;
                }
                case DOCINDEX -> {
                    break;
                }
                case ENGINE -> {
                    break;
                }
                case MASTER -> {
                    break;
                }
                case RESERVED -> {
                    break;
                }
                default -> {
                    System.out.println("not found any releasable ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return aircraftRefList;
    }
}

