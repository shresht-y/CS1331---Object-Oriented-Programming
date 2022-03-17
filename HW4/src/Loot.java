/**
 * Abstract class that represents a general piece of loot.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public abstract class Loot {
    private double value;

    /**
     * Constructor for Loot object with one parameter.
     * @param value double representing the value of a piece of loot.
     */
    public Loot(double value) {
        if (value > 0) {
            this.value = value;
        }
    }

    /**
     * Constructor for Loot object with default value of 0.
     */
    public Loot() {
        this.value = 0.0;
    }

    /**
     * Getter for value variable.
     * @return double representing the value of a piece of loot.
     */
    public double getValue() {
        return value;
    }

    /**
     * Setter for value variable.
     * @param value double representing the new value for value variable.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Override of toString method to print all variables of Loot.
     */
    @Override
    public String toString() {
        return "A piece of loot worth " + value;
    }

    /**
     * Override of equals method to check if two pieces of loot are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Loot) {
            Loot l = (Loot) o;
            return l.value == this.value;
        } else {
            return false;
        }
    }
}
