package de.exxcellent.challenge;

import de.exxcellent.challenge.model.FileType;
import de.exxcellent.challenge.model.Topic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpreadControllerTest {

    private String weatherTestCsvPath = "src/test/resources/de/exxcellent/challenge/weather.csv";

    @Test
    void testDetermineSpreadCsvWeather() {
        SpreadController spreadController = new SpreadController();
        String day = spreadController.determineSpread(FileType.CSV, Topic.WEATHER, weatherTestCsvPath);

        assertEquals(day, "14");
    }

    // TODO Tests for other filetypes + invalid cases
}
