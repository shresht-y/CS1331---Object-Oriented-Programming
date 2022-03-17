/**
 * Class that represents an Employee.
 * Implements Comparable of type Employee.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int height;

    /**
     * Constructor with two parameters.
     * @param name String reprsenting the name of the Employee.
     * @param height int representing the height of the Employee.
     */
    public Employee(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /**
     * toString override to print constructor variables.
     */
    @Override
    public String toString() {
        return String.format("My name is %s and I am %d inches tall", name, height);
    }

    /**
     * equals method override to determine equality based on name and height.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            return (this.name.equals(e.name)) && (this.height == e.height);
        }
        return false;
    }

    /**
     * compareTo override that compares height variables.
     */
    @Override
    public int compareTo(Employee e) {
        if (this.height > e.height) {
            return 1;
        } else if (this.height < e.height) {
            return -1;
        } else if (this.height == e.height) {
            return 0;
        } else {
            return -99;
        }
    }
}
