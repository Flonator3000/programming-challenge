package de.exxcellent.challenge.file;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * class CsvParser
 *
 * @author Florian Wörle
 */
public class CsvParser implements IFileParser {

    @Override
    public List<Weather> parseWeather(String filePath) {
        String[] rows = parse(filePath);
        return Arrays.stream(rows)
                .skip(1)
                .map(row -> new Weather(row))
                .collect(Collectors.toList());
    }

    @Override
    public List<Football> parseFootball(String filePath) {
        String[] rows = parse(filePath);
        return Arrays.stream(rows)
                .skip(1)
                .map(row -> new Football(row))
                .collect(Collectors.toList());
    }

    /**
     * Parses the file content into a string array.
     *
     * @param filePath
     * @return File content as String[]
     */
    private String[] parse(String filePath) {
        String content = null;
        try {
            content = Files.readString(Paths.get(filePath), StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.split(System.lineSeparator());
    }
}
