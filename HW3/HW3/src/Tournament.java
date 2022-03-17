/**
 * The abstract class Tournament.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public abstract class Tournament {
    private String name;
    private int numTeams;
    private boolean knockout = true;
    private String finalReferee;
    protected int maxCapacity;
    private static final int FINAL_CAPACITY = 30000;

    /**
     * Constructor for abstract class tournament.
     * @param name String representing the name of the Tournament.
     * @param numTeams int representing the amount of teams in the Tournament.
     * @param knockout boolean representing whether or not the Tournament is a knockout Tournament.
     * @param finalReferee String representing the name of the referee in the final game.
     * @param maxCapacity int representing the max capacity for all statiums.
     */
    public Tournament(String name, int numTeams, boolean knockout, String finalReferee, int maxCapacity) {
        this.name = name;
        if (numTeams % 2 == 0) {
            this.numTeams = numTeams;
        } else {
            this.numTeams = 16;
        }
        this.finalReferee = finalReferee;
        this.maxCapacity = maxCapacity;
        if (numTeams > 64) { //&& knockout == false
            this.knockout = true;
        } else if (knockout) {
            this.knockout = true;
        } else {
            this.knockout = false;
        }
    }

    /**
     * Overrides toString class to print all variables for an instance of Tournament,
     *  specifying whether or not a Tournament is a KO Tournament.
     */
    @Override
    public String toString() {
        if (knockout) {
            return "Name: " + name + ", Number of Teams: " + numTeams
                + ", KO: this is a KO tournament, Final Referee: "
                + finalReferee + ", Maximum Capacity: " + maxCapacity;
        } else {
            return "Name: " + name + ", Number of Teams: " + numTeams
                + ", KO: this isn't a KO tournament, Final Referee: "
                + finalReferee + ", Maximum Capacity: " + maxCapacity;
        }
    }

    /**
     * Overrides equals class to compare name, numTeams, and knockout
     *  variables to determine if two Tournament objects are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Tournament) {
            Tournament t = (Tournament) o;
            return t.name.equals(this.name) && t.numTeams == this.numTeams && t.knockout == this.knockout;
        } else {
            //System.out.println("equals method");
            return false;
        }
    }

    /**
     * abstract method for hiring referee.
     * @param s String representing the name of the referee.
     */
    public abstract void refereeHire(String s);

    /**
     * Getter for name variable.
     * @return String representing the name of the Tournament.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for numTeams variable.
     * @return int representing the amount of teams in the Tournament.
     */
    public int getNumTeams() {
        return numTeams;
    }

    /**
     * Getter for finalReferee variable.
     * @return String representing the name of the referee in the final game.
     */
    public String getFinalReferee() {
        return finalReferee;
    }

    /**
     * Getter for knockout variable.
     * @return boolean representing whether or not the Tournament is a knockout Tournament.
     */
    public boolean getKnockout() {
        return knockout;
    }

    /**
     * Getter for FINAL_CAPACITY constant.
     * @return int representing the maximum capacity of all stadiums.
     */
    public static int getFinalCapacity() {
        return FINAL_CAPACITY;
    }

    /**
     * Setter for numTeams that is only visible to subclasses of Tournament.
     * @param newValue int representing the new value of maxCapacity.
     */
    protected void setMaxCapacity(int newValue) {
        maxCapacity = newValue;
    }

    /**
     * Setter for numTeams that is only visible to subclasses of Tournament.
     * @param newValue int representing the new value of numTeams.
     */
    protected void setNumTeams(int newValue) {
        numTeams = newValue;
    }

    /**
     * Setter for finalReferee that is only visible to subclasses of Tournament.
     * @param newValue String representing the new value of finalReferee.
     */
    protected void setFinalReferee(String newValue) {
        finalReferee = newValue;
    }
}
