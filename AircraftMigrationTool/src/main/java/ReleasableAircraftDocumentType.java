enum ReleasableAircraftDocumentType {
    ACFTREF("ACFTREF.txt"),
    DEALER("DEALER.txt"),
    DEREG("DEREG.txt"),
    DOCINDEX("DOCINDEX.txt"),
    ENGINE("ENGINE.txt"),
    MASTER("MASTER.txt"),
    RESERVED("RESERVED.txt");

    private final String filename;

    ReleasableAircraftDocumentType(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}
