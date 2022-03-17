/**
 * Class that extends Loot.
 * Represents sugar.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Sugar extends Loot {
    private double amount;
    private double sweetness; //0-100 range

    /**
     * Constructor for Sugar with amount and sweetness as parameters.
     * @param amount double representing the amount of sugar.
     * @param sweetness double representing how sweet the Sugar is, can range from [0 - 100].
     */
    public Sugar(double amount, double sweetness) {
        this.amount = amount;
        if (sweetness >= 0 && sweetness <= 100) {
            this.sweetness = sweetness;
        } else {
            this.sweetness = 0;
        }
        double newValue = amount * sweetness;
        setValue(newValue);
    }

    /**
     * Override for toString method that prints all the variables in Sugar.
     */
    @Override
    public String toString() {
        return "A pile of sugar of size " + amount + " and sweetness " + sweetness + ".";
    }

    /**
     * Override for equals method that checks if two Sugar objects are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Sugar s = (Sugar) o;
            return this.amount == s.amount && this.sweetness == s.sweetness;
        } else {
            return false;
        }
    }
}
