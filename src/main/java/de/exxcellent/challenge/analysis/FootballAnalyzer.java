package de.exxcellent.challenge.analysis;

import de.exxcellent.challenge.model.Football;

import java.util.List;

/**
 * class FootballAnalyser
 *
 * @author Florian Wörle
 */
public class FootballAnalyzer {

    /**
     * Calculates the smallest distance (absolute difference) between ‘Goals’ and ‘Goals Allowed’.
     *
     * @param footballs
     * @return Corresponding team
     */
    public String calculateSpread(List<Football> footballs) {
        int smallestSpread = Integer.MAX_VALUE;
        String team = "";

        for (Football football: footballs) {
            int diff = Math.abs(football.getGoals() - football.getGoalsAllowed());
            if(smallestSpread > diff) {
                smallestSpread = diff;
                team = football.getTeam();
            }
        }

        return team;
    }
}
