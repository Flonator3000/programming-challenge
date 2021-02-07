package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.model.Weather;

import java.util.List;

/**
 * class WeatherAnalyzer
 *
 * @author Florian Wörle
 */
public class WeatherAnalyzer {

    /**
     *  Calculates smallest temperature spread (difference between maximum & minimum temperature of the day.)
     *
     * @param weathers
     * @return Corresponding day
     */
    public int calculateSpread(List<Weather> weathers) {
        int smallestSpread = Integer.MAX_VALUE;
        int day = 0;

        for (Weather weather: weathers) {
            int diff = Math.abs(weather.getMxT() - weather.getMnT());
            if(smallestSpread > diff) {
                smallestSpread = diff;
                day = weather.getDay();
            }
        }

        return day;
    }
}
