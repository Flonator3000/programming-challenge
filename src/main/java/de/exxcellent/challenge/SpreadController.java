package de.exxcellent.challenge;

import de.exxcellent.challenge.analysis.FootballAnalyzer;
import de.exxcellent.challenge.analysis.WeatherAnalyzer;
import de.exxcellent.challenge.file.CsvParser;
import de.exxcellent.challenge.file.IFileParser;
import de.exxcellent.challenge.model.FileType;
import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Topic;
import de.exxcellent.challenge.model.Weather;

import java.util.List;


/**
 * class SpreadController
 *
 * @author Florian Wörle
 */
public class SpreadController {

    /**
     * Determines a specific spread of values.
     *
     * @param fileType
     * @param topic
     * @param filePath
     * @return
     */
     public String determineSpread(FileType fileType, Topic topic, String filePath) {
         switch (fileType) {
             case CSV:
                 IFileParser fileParser = new CsvParser();
                 return determineSpread(fileParser, topic, filePath);
             default:
                 return null;
         }
    }

    private String determineSpread(IFileParser fileParser, Topic topic, String filePath) {
        switch (topic) {
            case WEATHER:
                List<Weather> weathers = fileParser.parseWeather(filePath);
                WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer();
                return String.valueOf(weatherAnalyzer.calculateSpread(weathers));
            case FOOTBALL:
                List<Football> footballs = fileParser.parseFootball(filePath);
                FootballAnalyzer footballAnalyzer = new FootballAnalyzer();
                return footballAnalyzer.calculateSpread(footballs);
            default:
                return null;
        }
    }

}
