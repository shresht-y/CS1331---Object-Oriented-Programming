/**
 * The parent class for Ghost and Witch.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class TrickOrTreater {
    protected String name;
    protected String neighborhood;
    protected int numCandy;
    protected static int totalCandy;

    /**
     * @param name String representing the name of the TrickOrTreater.
     * @param neighborhood String representing the name of the neighborhood.
     * @param numCandy int representing how much candy an instance of TrickOrTreater has.
     */
    public TrickOrTreater(String name, String neighborhood, int numCandy) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.numCandy = numCandy;
        setTotalCandy(numCandy);
    }
    /**
     * Chains contructor with the default values of a TrickOrTreater.
     */
    public TrickOrTreater() {
        this("Agnes", "Halloweentown", 0);
    }

    /**
     * Determines how much candy a TrickOrTreater gains based on the multiplier of luck.
     * Calls setTotalCandy() method to update static variable totalCandy.
     * @param luck int representing the multiple of three that the TrickOrTreater gains in the form of candy.
     */
    public void seekCandy(int luck) {
        if (luck >= 0) {
            int gain = 3 * luck;
            numCandy = numCandy + gain;
            setTotalCandy(gain);
        }
    }

    /**
     * Getter for name variable.
     * @return String representing name of the TrickOrTreater.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for neighborhood variable.
     * @return String representing name of neighborhood.
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Getter for numCandy variable.
     * @return int representing the amount of candy an instance of TrickOrTreater has.
     */
    public int getNumCandy() {
        return numCandy;
    }

    /**
     * Getter for static totalCandy variable.
     * @return int representing total candy held by all instances of TrickOrTreater.
     */
    public static int getTotalCandy() {
        return totalCandy;
    }

    /**
     * Setter for name variable of an instance of TrickOrTreater.
     * @param name String representing name of instance of TrickOrTreater.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter for neighborhood variable for an instance of TrickOrTreater.
     * @param neighborhood String representing the name of neighborhood for an instance of TrickOrTreater.
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Setter for numCandy variable for an instance of TrickOrTreater.
     * @param numCandy int representing the amount of candy an instance of TrickOrTreater has.
     */
    public void setNumCandy(int numCandy) {
        this.numCandy = numCandy;
    }

    /**
     * Setter for static totalCandy variable.
     * @param candy int representing how much the totalCandy varible must increase by.
     */
    public static void setTotalCandy(int candy) {
        totalCandy += candy;
    }
}

