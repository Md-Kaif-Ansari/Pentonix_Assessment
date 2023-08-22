import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeByENOController {

    @GetMapping("/api")
    public String getEmployeeByENO(@RequestParam int ENO) {
        Employee employee = findEmployeeByEno(ENO);
        if (employee != null) {
            return employee.toJson();
        } else {
            return "Employee not found.";
        }
    }

    private Employee findEmployeeByEno(int eno) {

        Employee[] employees = {
            new Employee(1, "Amal", 10, 30000),
            new Employee(2, "Shyamal", 30, 50000),
            new Employee(3, "Kamal", 40, 10000),
            new Employee(4, "Nirmal", 50, 60000),
            new Employee(5, "Bial", 20, 40000),
            new Employee(6, "Parimal", 10, 20000),
        };

        for (Employee employee : employees) {
            if (employee.getEmpId() == eno) {
                return employee;
            }
        }
        return null;
    }
    public class Employee {
    private int empId;
    private String empName;
    private int dno;
    private double salary;

   Employee(int empId, String empName, int dno, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.dno = dno;
            this.salary = salary;
        }

    public String toJson() {
        return "{" +
                "\"empId\": " + empId +
                ", \"empName\": \"" + empName + "\"" +
                ", \"dno\": " + dno +
                ", \"salary\": " + salary +
                "}";
    }
}


    public String toJson() {
        return "{" +
                "\"empId\": " + empId +
                ", \"empName\": \"" + empName + "\"" +
                ", \"dno\": " + dno +
                ", \"salary\": " + salary +
                "}";
    }
}


