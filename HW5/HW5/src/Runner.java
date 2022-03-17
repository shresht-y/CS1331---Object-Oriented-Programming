import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shresht", 100);
        Employee e2 = new Employee("Krish", 93);
        Employee e3 = new Employee("Samarth", 86);
        Employee e4 = new Employee("Michael", 79);
        Employee e5 = new Employee("Ashvin", 61);
        Employee e6 = new Employee("George", 54);
        Employee e7 = new Employee("Ricardo", 43);
        Employee e8 = new Employee("Mike", 33);
        Employee e9 = new Employee("Mikefgsfsdg", 12);

        ArrayList<Employee> employees = new ArrayList<>();
        
        
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        
        
        
        //employees.add(e9);


        Office o1 = new Office("Heaven");
        Office o2 = new Office("Hell");

        o1.addEmployee(e1);
        o1.addEmployee(e2);
        o1.addEmployee(e3);
        o1.addEmployee(e4);
        o1.addEmployee(e5);

        o2.addEmployee(e3);
        o2.addEmployee(e1);
        o2.addEmployee(e5);
        o2.addEmployee(e4);
        o2.addEmployee(e6);
        o2.addEmployee(e2);
        

        Department d1 = new Department("one", true);
        Department d2 = new Department("two", false);
        Department d3 = new Department("three", true);
        Department d4 = new Department("four", false);
        Department d5 = new Department("five", false);
        Department d6 = new Department("six", false);
        Department d7 = new Department("seven", true);

        o1.addDepartment(d1);
        o1.addDepartment(d2);
        o1.addDepartment(d3);
        o1.addDepartment(d4);
        o1.addDepartment(d5);
        o1.addDepartment(d6);
        o1.addDepartment(d7);
        
        //o1.removeEmployee(e3);
        Dwight d = new Dwight();

        //System.out.println(e8.equals(e9));
        //d.doRecount(o1, employees);
        for(int i = 0; i < o2.getEmployees().size(); i++) {
           System.out.println(o2.getEmployees().get(i));
        }
        
        System.out.println(d.findEmployee(e4, employees));
        //System.out.println(o2.toString());
    }
}
