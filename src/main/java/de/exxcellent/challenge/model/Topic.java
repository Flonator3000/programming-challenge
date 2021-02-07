package de.exxcellent.challenge.model;

import java.util.HashMap;
import java.util.Map;

/**
 * enum Topic
 *
 * @author Florian Wörle
 */
public enum Topic {
    WEATHER("weather"),
    FOOTBALL("football");

    private static final Map<String, Topic> CONSTANTS = new HashMap<>();

    static {
        for(Topic t: values()) {
            CONSTANTS.put(t.value, t);
        }
    }

    private final String value;

    Topic(String value) {
        this.value = value;
    }

    public static Topic fromValue(String value) {
        Topic constant = CONSTANTS.get(value);
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
