/**
 * Class that extends Tournament.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class ConferenceLeague extends Tournament {
    private int teamsPerLeague;
    private String currentHolder;

    /**
     * Constructor with finalReferee, teamsPerLeague, and currentHolder as parameters.
     * @param finalReferee String representing the name of the referee in the final game.
     * @param teamsPerLeague int representing the amount of teams per league.
     * @param currentHolder String representing the name of the current holder.
     */
    public ConferenceLeague(String finalReferee, int teamsPerLeague, String currentHolder) {
        super("Conference League", 32, true, finalReferee, 15000);
        this.teamsPerLeague = teamsPerLeague;
        this.currentHolder = currentHolder;
    }

    /**
     * Overrides toString method to print all variables for an instance of ConferenceLeague.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + ", Number of Teams: " + getNumTeams() + ", Final Referee: "
            + getFinalReferee() + ", Teams per League: " + teamsPerLeague + ", Current Holder: " + currentHolder;
    }

    /**
     * Overrides equals method to check if two ConferenceLeagues are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof ConferenceLeague) {
            ConferenceLeague c = (ConferenceLeague) o;
            return c.currentHolder.equals(this.currentHolder) && c.getFinalReferee().equals(this.getFinalReferee());
        } else {
            return false;
        }
    }

    /**
     * Reduces the number of teams if there are more than 2 teams.
     * If there are 2 teams, adjusts maxCapacity to not be greater than FINAL_CAPACITY.
     */
    public void nextRound() {
        if (getKnockout() && getNumTeams() > 2) {
            int newValue = getNumTeams() / 2;
            setNumTeams(newValue);
        } else {
            System.out.println("We have reached the final!");
            if (maxCapacity > getFinalCapacity()) {
                maxCapacity = getFinalCapacity();
            }
        }
    }

    /**
     * Changes the finalReferee to "undecided" if the referee passed in is the same.
     * if finalReferee and the referee passed in are different, doubles max capacity.
     */
    @Override
    public void refereeHire(String referee) {
        if (this.getFinalReferee() == referee) {
            System.out.println("We need a new referee!");
            setFinalReferee("undecided");
        } else {
            System.out.println("We're ready to go!");
            //int newValue = maxCapacity * 2;
            maxCapacity *= 2;
        }
    }
}
