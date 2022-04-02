import java.util.HashMap;
import java.util.Map;

public enum BuilderCertificationCode {
    TYPE_CERTIFICATED(0),
    NOT_TYPE_CERTIFICATED(1),
    LIGHT_SPORT(2);

    private final int refNumber;
    private static final Map<Integer, BuilderCertificationCode> BUILDER_CERTIFICATION_CODE_MAP = new HashMap<>();

    BuilderCertificationCode(int refNumber) {
        this.refNumber = refNumber;
    }

    static {
        for (BuilderCertificationCode engineType : values()) {
            BUILDER_CERTIFICATION_CODE_MAP.put(engineType.getRefNumber(), engineType);
        }
    }

    public int getRefNumber() {
        return refNumber;
    }

    public static BuilderCertificationCode getType(int rerNumber) {
        return getType(String.valueOf(rerNumber));
    }

    public static BuilderCertificationCode getType(String refNumber) {
        return BUILDER_CERTIFICATION_CODE_MAP.get(Integer.parseInt(refNumber));
    }
}
