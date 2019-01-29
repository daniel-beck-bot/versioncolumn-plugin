package hudson.plugin.versioncolumn;

import java.util.LinkedHashMap;
import java.util.Map;

class JVMConstants {

    public static final int JAVA_5 = 49;
    public static final int JAVA_6 = 50;
    public static final int JAVA_7 = 51;
    public static final int JAVA_8 = 52;
    public static final int JAVA_9 = 53;
    public static final int JAVA_10 = 54;
    public static final int JAVA_11 = 55;
    public static final int JAVA_12 = 56;

    static final Map<String, Integer> JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING = new LinkedHashMap<String, Integer>();

    static {
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.1", 45);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.2", 46);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.3", 47);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.4", 48);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.5", JAVA_5);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.6", JAVA_6);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("6", JAVA_6);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.7", JAVA_7);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("7", JAVA_7);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.8", JAVA_8);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("8", JAVA_8);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("1.9", JAVA_9);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("9", JAVA_9);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("9.0", JAVA_9);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("10", JAVA_10);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("10.0", JAVA_10);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("11", JAVA_11);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("11.0", JAVA_11);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("12", JAVA_12);
        JDK_VERSION_NUMBER_TO_BYTECODE_LEVEL_MAPPING.put("12.0", JAVA_12);
    }
}
