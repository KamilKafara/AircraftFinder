import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum DocIndexRefColumn {
    TYPE(0),
    COLLATERAL(1),
    NAME_OF_PARTY(2),
    DOC_ID(3),
    DR_DATE(4),
    PROCESSING_DATE(5),
    CORR_DATE(6),
    CORR_ID(7),
    SERIAL_ID(8);

    private final int refNumber;
    private static final Map<String, DocIndexRefColumn> DOC_INDEX_REF_COLUMN_MAP = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(refColumn -> DOC_INDEX_REF_COLUMN_MAP.put(String.valueOf(refColumn.getRefNumber()), refColumn));
    }

    DocIndexRefColumn(int refNumber) {
        this.refNumber = refNumber;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static int getRefNumber(DocIndexRefColumn label) {
        return DOC_INDEX_REF_COLUMN_MAP.get(label).getRefNumber();
    }
}
