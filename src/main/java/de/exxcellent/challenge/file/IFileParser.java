package de.exxcellent.challenge.file;

import de.exxcellent.challenge.model.Weather;

import java.util.List;

/**
 * interface IFileParser
 *
 * @author Florian Wörle
 */
public interface IFileParser {

    /**
     * Parses a List of {@link Weather} from a String array.
     *
     * @param filePath
     * @return List of {@link Weather}
     */
    List<Weather> parseWeather(String filePath);
}
