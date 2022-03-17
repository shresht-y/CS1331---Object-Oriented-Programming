/**
 * Creates a BlackCat object using parameters of a String and a boolean.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class BlackCat {
    private String name;
    private boolean familiar;

    /**
     * Constructor for BlackCat object.
     * @param name String representing the name of the BlackCat.
     * @param familiar boolean representing whether or not a BlackCat is a familiar.
     */
    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }

    /**
     * Method that prints whether or not a BlackCat instance is a familiar.
     */
    public void meow() {
        if (familiar) {
            System.out.printf("%s is a familiar\n", name);
        } else {
            System.out.printf("%s is not a familiar\n", name);
        }
    }

    /**
     * Getter for name variable.
     * @return String representing name of the BlackCat.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for familiar variable.
     * @return boolean representing whether or not BlackCat is a familiar.
     */
    public boolean getFamiliar() {
        return familiar;
    }

    /**
     * Setter for familiar variable.
     * @param familiar boolean representing whether or not BlackCat is a familiar.
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    /**
     * Setter for name variable.
     * @param name String representing name of the BlackCat.
     */
    public void setName(String name) {
        this.name = name;
    }
}
