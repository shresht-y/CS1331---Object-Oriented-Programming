/**
 * Class that extends Loot.
 * Represents a coin.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Coin extends Loot {
    private boolean heads;
    private int yearMade;
    private String material;

    /**
     * Constructor for coin object with custom parameters.
     * @param value double representing what a coin is worth.
     * @param heads boolean representing if the heads side of a coin is facing up.
     * @param yearMade int representing the year a coin was made.
     * @param material String representing the material the coin is made out of.
     */
    public Coin(double value, boolean heads, int yearMade, String material) {
        super(value);
        this.heads = heads;
        if (yearMade >= 0 && yearMade <= 1700) {
            this.yearMade = yearMade;
        } else {
            this.yearMade = 1700;
        }
        this.material = material;
    }

    /**
     * Constructor for coin object with two parameters: heads and yearMade.
     * @param heads boolean representing if the heads side of a coin is facing up.
     * @param yearMade int representing the year a coin was made.
     */
    public Coin(boolean heads, int yearMade) {
        this(((3000.0 - yearMade) / 100.0), heads, yearMade, "Gold");
    }

    /**
     * Override for String method to print all variables in coin object.
     */
    @Override
    public String toString() {
        return "A " + material + " coin made in " + yearMade + ". Heads side is up: " + heads + ".";
    }

    /**
     * Override for equals method to check if two coins are the same.
     */
    @Override
    public boolean equals(Object o) { //look this over idk if it right
        if (super.equals(o)) {
            Coin c = (Coin) o;
            return this.yearMade == c.yearMade && this.material.equals(c.material);
        } else {
            return false;
        }
    }
}
