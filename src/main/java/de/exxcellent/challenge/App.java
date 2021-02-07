package de.exxcellent.challenge;

import de.exxcellent.challenge.model.FileType;
import de.exxcellent.challenge.model.Topic;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        final String weatherFilePath = "src/main/resources/de/exxcellent/challenge/weather.csv";
        final String footballFilePath = "src/main/resources/de/exxcellent/challenge/football.csv";
        SpreadController spreadController = new SpreadController();

        String dayWithSmallestTempSpread = spreadController.determineSpread(FileType.CSV, Topic.WEATHER, weatherFilePath);
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = spreadController.determineSpread(FileType.CSV, Topic.FOOTBALL, footballFilePath);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
