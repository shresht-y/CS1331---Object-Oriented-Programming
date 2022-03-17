/**
 * Creates a Witch object using parameters of three strings, an int, and a BlackCat object.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;

    /**
     * Constructor for Witch object with no default values.
     * @param name String representing the name of the Witch.
     * @param neighborhood String representing the name of the neighborhood.
     * @param numCandy int representing how much candy an instance of Ghost has.
     * @param signatureSpell String representing the spell the Witch casts.
     * @param companion BlackCat object representing the companion of the Witch.
     */
    public Witch(String name, String neighborhood, int numCandy, String signatureSpell, BlackCat companion) {
        super(name, neighborhood, numCandy);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }

    /**
     * Constructor for Witch object with default neighborhood and numCandy values.
     * @param name String representing the name of the Witch.
     * @param signatureSpell String representing the spell the Witch casts.
     * @param companion BlackCat object representing the companion of the Witch.
     */
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }

    /**
     * Constructor that makes a deep copy of Witch using an empty Witch object.
     * @param otherWitch Witch object that will copy current instance of Witch.
     */
    public Witch(Witch otherWitch) {
        this(new String(otherWitch.getName()), new String(otherWitch.getNeighborhood()),
            otherWitch.getNumCandy(), new String(otherWitch.getSignatureSpell()),
            new BlackCat(otherWitch.getCompanion().getName(), otherWitch.getCompanion().getFamiliar()));
    }

    /**
     * Method that prints the name of Witch and their signatureSpell.
     * Doubles the value of numCandy and adds the new value to static totalCandy variable.
     */
    public void castSpell() {
        System.out.printf("%s casts %s!%n", name, signatureSpell);
        setTotalCandy(numCandy);
        numCandy *= 2;
    }

    /**
     * Setter for signatureSpell variable.
     * @param signatureSpell String representing the spell the Witch casts.
     */
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }

    /**
     * Setter for companion BlackCat object.
     * @param companion BlackCat object representing the companion of the Witch.
     */
    public void setCompanion(BlackCat companion) {
        this.companion = companion;
    }

    /**
     * Getter for signatureSpell variable.
     * @return String representing the spell the Witch casts.
     */
    public String getSignatureSpell() {
        return signatureSpell;
    }

    /**
     * Getter for campanion BlackCat object.
     * @return BlackCat object representing the companion of the Witch.
     */
    public BlackCat getCompanion() {
        return companion;
    }
}
