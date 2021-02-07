package de.exxcellent.challenge;

import de.exxcellent.challenge.model.FileType;
import de.exxcellent.challenge.model.Topic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpreadControllerTest {

    private String weatherTestCsvPath = "src/test/resources/de/exxcellent/challenge/weather.csv";
    private String footballTestCsvPath = "src/test/resources/de/exxcellent/challenge/football.csv";

    @Test
    void testDetermineSpreadCsvWeather() {
        SpreadController spreadController = new SpreadController();
        String day = spreadController.determineSpread(FileType.CSV, Topic.WEATHER, weatherTestCsvPath);

        assertEquals(day, "14");
    }

    @Test
    void testDetermineSpreadCsvFootball() {
        SpreadController spreadController = new SpreadController();
        String team = spreadController.determineSpread(FileType.CSV, Topic.FOOTBALL, footballTestCsvPath);

        assertEquals(team, "Aston_Villa");
    }

    // TODO Tests for other filetypes + invalid cases
}
