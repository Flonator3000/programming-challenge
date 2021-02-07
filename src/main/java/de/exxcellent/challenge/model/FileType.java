package de.exxcellent.challenge.model;

import java.util.HashMap;
import java.util.Map;

/**
 * enum FileType
 *
 * @author Florian Wörle
 */
public enum FileType {
    CSV("csv"),
    JSON("json");

    private static final Map<String, FileType> CONSTANTS = new HashMap<>();

    static {
        for(FileType f: values()) {
            CONSTANTS.put(f.value, f);
        }
    }

    private final String value;

    FileType(String value) {
        this.value = value;
    }

    public static FileType fromValue(String value) {
        FileType constant = CONSTANTS.get(value);
        if(constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }


    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }
}
