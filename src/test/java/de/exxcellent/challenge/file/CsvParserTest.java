package de.exxcellent.challenge.file;

import de.exxcellent.challenge.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvParserTest {

    private String weatherTestCsvPath = "src/test/resources/de/exxcellent/challenge/weather.csv";

    @Test
    void testParseWeather() {
        CsvParser csvParser = new CsvParser();
        List<Weather> weathers = csvParser.parseWeather(weatherTestCsvPath);

        assertEquals(weathers.size(), 30);
        assertEquals(weathers.get(0).getDay(), 1);
        assertEquals(weathers.get(1).getrAvSLP(), 1004.5);
    }

    // TODO tests for invalid csv files

}
