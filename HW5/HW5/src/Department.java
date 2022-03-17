/**
 * Class that represents a department.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Department {
    private String name;
    private boolean hasFireExtinguisher;

    /**
     * Constructor for Department class with 2 parameters.
     * @param name String representing the name of the Department.
     * @param hasFireExtinguisher boolean representing if the Department has a fire extinguisher.
     */
    public Department(String name, boolean hasFireExtinguisher) {
        this.name = name;
        this.hasFireExtinguisher = hasFireExtinguisher;
    }

    /**
     * Getter for hasFireExtinguisher variable.
     * @return boolean representing if thhe Department has a fire extinguisher.
     */
    public boolean getHasFireExtinguisher() {
        return hasFireExtinguisher;
    }
}
