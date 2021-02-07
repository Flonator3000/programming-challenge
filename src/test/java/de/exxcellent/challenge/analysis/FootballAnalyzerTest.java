package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.file.CsvParser;
import de.exxcellent.challenge.model.Football;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballAnalyzerTest {
    private List<Football> footballs = List.of();
    private String footballTestCsvPath = "src/test/resources/de/exxcellent/challenge/football.csv";

    @BeforeEach
    void setUp() {
        CsvParser csvParser = new CsvParser();
        footballs = csvParser.parseFootball(footballTestCsvPath);
    }

    @Test
    void testCalculateSpread() {
        FootballAnalyzer footballAnalyzer = new FootballAnalyzer();
        String team = footballAnalyzer.calculateSpread(footballs);

        assertEquals(team, "Aston_Villa");
    }
}
