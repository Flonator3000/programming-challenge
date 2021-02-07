package de.exxcellent.challenge.model;

/**
 * class Football
 *
 * @author Florian Wörle
 */
public class Football {

    private String team;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private int goals;
    private int goalsAllowed;
    private int points;

    public Football(String content) {
        String[] footballData = content.split(",");

        this.team = footballData[0];
        this.games = Integer.parseInt(footballData[1]);
        this.wins = Integer.parseInt(footballData[2]);
        this.losses = Integer.parseInt(footballData[3]);
        this.draws = Integer.parseInt(footballData[4]);
        this.goals = Integer.parseInt(footballData[5]);
        this.goalsAllowed = Integer.parseInt(footballData[6]);
        this.points = Integer.parseInt(footballData[7]);
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }
}
