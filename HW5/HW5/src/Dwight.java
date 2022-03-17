import java.util.ArrayList;

/**
 * Class that extends Employee.
 * Represents Employee Dwight.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Dwight extends Employee {

    /**
     * Constructor that sets default values.
     */
    public Dwight() {
        super("Dwight Schrute", 74);
    }

    /**
     * Overrides toString to be specific to Dwight.
     */
    @Override
    public String toString() {
        return "My name is Dwight and I am the fire marshal";
    }

    /**
     * checks to ake sure at least half of the offices have a fire extinguishers.
     * @param o Office object that needs to be checked.
     * @return boolean confirming whether or not 50% or more of the offices have fire extinguishers.
     */
    public boolean checkOffice(Office o) {
        ArrayList<Department> departments = o.getDepartments();
        int counter = 0;
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getHasFireExtinguisher()) {
                counter++;
            }
        }
        if (counter >= departments.size() / 2.0) {
            return true;
        }
        return false;
    }

    /**
     * Checks the given employees ArrayList for the given employee.
     * Uses a binary search.
     * @param e Employee that must be looked for.
     * @param employees ArrayList that needs to be checked for e.
     * @return boolean representing if e is in the ArrayList.
     */
    public boolean findEmployee(Employee e, ArrayList<Employee> employees) {
        int lowerBound = 0;
        int upperBound = employees.size();
        int mid = employees.size() / 2;
        boolean output = false;
        if (employees.size() == 0) {
            output = false;
        } else if (e.equals(employees.get(mid))) {
            output = true;
        } else if (e.compareTo(employees.get(mid)) == -1) {
            ArrayList<Employee> secondHalf = new ArrayList<>(employees.subList(mid + 1, upperBound));
            output = findEmployee(e, secondHalf);
        } else if (e.compareTo(employees.get(mid)) == 1) {
            ArrayList<Employee> firstHalf = new ArrayList<>(employees.subList(lowerBound, mid));
            output = findEmployee(e, firstHalf);
        }
        return output;
    }

    /**
     * Checks for employess that are in the office but not in the given ArrayList.
     * @param o Office that will be checked for missing employees.
     * @param employees ArrayList that the missing employees must be added to.
     * @return ArrayList of all the employees that were missing.
     */
    public ArrayList<Employee> doRecount(Office o, ArrayList<Employee> employees) {
        ArrayList<Employee> employeesInOffice = o.getEmployees();
        Office output = new Office("output");
        for (int i = 0; i < employeesInOffice.size(); i++) {
            if (!(findEmployee(employeesInOffice.get(i), employees))) {
                output.addEmployee(employeesInOffice.get(i));
            }
        }
        return output.getEmployees();
    }
}
