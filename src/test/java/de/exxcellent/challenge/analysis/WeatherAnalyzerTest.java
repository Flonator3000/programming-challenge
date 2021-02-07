package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.file.CsvParser;
import de.exxcellent.challenge.model.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherAnalyzerTest {

    private List<Weather> weathers = List.of();
    private String weatherTestCsvPath = "src/test/resources/de/exxcellent/challenge/weather.csv";

    @BeforeEach
    void setUp() {
        CsvParser csvParser = new CsvParser();
        weathers = csvParser.parseWeather(weatherTestCsvPath);
    }

    @Test
    void testCalculateSpread() {
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer();
        int spread = weatherAnalyzer.calculateSpread(weathers);

        assertEquals(spread, 14);
    }

}
