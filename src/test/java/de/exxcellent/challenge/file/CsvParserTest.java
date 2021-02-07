package de.exxcellent.challenge.file;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvParserTest {

    private String weatherTestCsvPath = "src/test/resources/de/exxcellent/challenge/weather.csv";
    private String footballTestCsvPath = "src/test/resources/de/exxcellent/challenge/football.csv";

    @Test
    void testParseWeather() {
        CsvParser csvParser = new CsvParser();
        List<Weather> weathers = csvParser.parseWeather(weatherTestCsvPath);

        assertEquals(weathers.size(), 30);
        assertEquals(weathers.get(0).getDay(), 1);
        assertEquals(weathers.get(1).getrAvSLP(), 1004.5);
    }

    @Test
    void testParseFootball() {
        CsvParser csvParser = new CsvParser();
        List<Football> footballs = csvParser.parseFootball(footballTestCsvPath);

        assertEquals(footballs.size(), 20);
        assertEquals(footballs.get(0).getTeam(), "Arsenal");
        assertEquals(footballs.get(1).getGoals(), 67.0);
    }


    // TODO tests for invalid csv files

}
