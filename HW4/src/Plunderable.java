/**
 * Interface for the ability for a ship object to be plundered.
 * Implemented in ship.java.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public interface Plunderable {
    /**
     * Method for a ship to be plundered.
     * @return Loot[] containing all objects that were plundered.
     */
    Loot[] bePlundered();
}
