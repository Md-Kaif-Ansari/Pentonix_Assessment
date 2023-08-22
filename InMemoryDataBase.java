import java.util.*;
public class InMemoryDataBase {

    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> departments = new LinkedHashMap<>();
        departments.put(10, "Admin");
        departments.put(20, "Accounts");
        departments.put(30, "Sales");
        departments.put(40, "Marketing");
        departments.put(50, "Purchasing");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amal", 10, 30000));
        employees.add(new Employee(2, "Shyamal", 30, 50000));
        employees.add(new Employee(3, "Kamal", 40, 10000));
        employees.add(new Employee(4, "Nirmal", 50, 60000));
        employees.add(new Employee(5, "Bimal", 20, 40000));
        employees.add(new Employee(6, "Parimal", 10, 20000));

       
        System.out.println("Departments Table:");
        System.out.println("DNO\tDNAME");
        for (Map.Entry<Integer, String> entry : departments.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("\nEmployees Table:");
        System.out.println("ENO\tENAME\t\tDNO\tSALARY");
        for (Employee employee : employees) {
            System.out.println(employee.empId + "\t" + employee.empName + "\t\t" + employee.dno +"\t" + employee.salary);
        }
    }

    
    static class Employee {
        int empId;
        String empName;
        int dno;
        double salary;

        Employee(int empId, String empName, int dno, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.dno = dno;
            this.salary = salary;
        }
    }
}
