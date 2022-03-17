/**
 * Class that extends Tournament.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class SummerShowdown extends Tournament {
    private String backupReferee;

    /**
     * Constructor that takes in all parameters excluding name.
     * @param numTeams int representing the amount of teams in the Tournament.
     * @param knockout boolean representing whether or not the Tournament is a knockout Tournament.
     * @param finalReferee String representing the name of the referee in the final game.
     * @param maxCapacity int representing the max capacity for all statiums.
     * @param backupReferee String representing the name of the backup referee.
     */
    public SummerShowdown(int numTeams, boolean knockout, String finalReferee, int maxCapacity, String backupReferee) {
        super("SummerShowdown", numTeams, knockout, finalReferee, maxCapacity);
        this.backupReferee = backupReferee;
    }

    /**
     * Constructor with default values for all variables excluding finalReferee and backupReferee.
     * @param finalReferee String representing the name of the referee in the final game.
     * @param backupReferee String representing the name of the backup referee.
     */
    public SummerShowdown(String finalReferee, String backupReferee) {
        this(64, false, finalReferee, 20000, backupReferee);
    }

    /**
     * Overrides toString method to print all variables for an instance of SummerShowdown.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + ", Number of Teams: " + getNumTeams() + ", Final Referee: "
            + getFinalReferee() + ", Backup Referee: " + backupReferee + ", Maximum Capacity: " + maxCapacity;
    }

    /**
     * Overrides equals method to check if two SummerShowdown are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof SummerShowdown) {
            SummerShowdown s = (SummerShowdown) o;
            return this.getFinalReferee().equals(s.getFinalReferee()) && maxCapacity == s.maxCapacity;
        } else {
            //System.out.println("else case .equals");
            return false;
        }
    }

    /**
     * Overrides abstract method refereeHire to update the referee in the final game.
     */
    @Override
    public void refereeHire(String referee) {
        if (this.getFinalReferee() == referee) {
            System.out.printf("We need a new referee! %s is already refereeing the final!\n", backupReferee);
            backupReferee = "undecided";
        } else if (backupReferee == referee) {
            System.out.printf("Be ready for some conflicts!\n");
            maxCapacity /= 2;
        } else {
            System.out.printf("Ready to play!\n");
        }
    }
}
