import java.util.ArrayList;

/**
 * Class that represents an Office.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Office {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Employee> employees;

    /**
     * Constructor with one parameter.
     * @param name String representing the name of the Office.
     */
    public Office(String name) {
        this.name = name;
        departments = new ArrayList<>();
        employees = new ArrayList<>();
    }

    /**
     * Adds a department to the departments ArrayList.
     * @param d Department object.
     */
    public void addDepartment(Department d) {
        departments.add(d);
    }

    /**
     * Adds an employee to ArrayList employees in decending height order.
     * @param e Employee object to be added.
     */
    public void addEmployee(Employee e) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).compareTo(e) == -1) {
                employees.add(i, e);
                break;
            } else if (i == employees.size() - 1) {
                employees.add(e);
                break;
            }
        }
        if (employees.size() == 0) {
            employees.add(e);
        }
    }

    /**
     * Removes the specified employee from the employees ArrayList.
     * @param e Employee object to be removed.
     * @return Employee object that was removed.
     */
    public Employee removeEmployee(Employee e) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(e)) {
                return employees.remove(i);
            }
        }
        return null;
    }

    /**
     * Getter for departments ArrayList.
     * @return ArrayList of Departments.
     */
    public ArrayList<Department> getDepartments() {
        return departments;
    }

    /**
     * Getter for employees ArrayList.
     * @return ArrayList of employees.
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
