/**
 * Creates a Ghost object using two Strings and two ints.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Ghost extends TrickOrTreater {
    private int transparency;

    /**
     * Constructor for Ghost object with no default values.
     * @param name String representing the name of the Ghost.
     * @param neighborhood String representing the name of the neighborhood.
     * @param numCandy int representing how much candy an instance of Ghost has.
     * @param transparency int representing how transparent a Ghost object is.
     */
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        super(name, neighborhood, numCandy);
        this.transparency = transparency;
    }

    /**
     * Contructor for Ghost object with default vaues and transparency parameter.
     * @param transparency int represent how transparent a Ghost object is.
     */
    public Ghost(int transparency) {
        super();
        this.transparency = transparency;
    }

    /**
     * Constructor that makes a deep copy of Ghost using an empty Ghost object.
     * @param otherGhost Ghost object that will copy current instance of Ghost.
     */
    public Ghost(Ghost otherGhost) {
        this(otherGhost.name, otherGhost.neighborhood, otherGhost.numCandy, otherGhost.transparency);
    }

    /**
     * Method that prints how spooky a Ghost is based on the value of int transparency.
     */
    public void spook() {
        if (transparency >= 10) {
            System.out.printf("Very spooky");
        } else if (transparency >= 3) {
            System.out.printf("Boo!");
        } else {
            System.out.println("Not very spooky");
        }
    }

    /**
     * Getter for transparency variable.
     * @return int representing how transparent a Ghost object is.
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * Setter for transparency.
     * @param transparency int representing how transparent a Ghost object is.
     */
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}
