public enum ReleasableAircraftType {

    ACFTREF("ACFTREF.txt"),
    DEALER("DEALER.txt"),
    DEREG("DEREG.txt"),
    DOCINDEX("DOCINDEX.txt"),
    ENGINE("ENGINE.txt"),
    MASTER("MASTER.txt"),
    RESERVED("RESERVED.txt");

    private final String filename;

    ReleasableAircraftType(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
