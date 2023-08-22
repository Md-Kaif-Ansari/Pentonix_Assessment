import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeByDNAMEController {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeByDNAMEController(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/api/employeesByDNAME")
    public List<Employee> getEmployeesByDNAME(@RequestParam String DNAME) {
        int dno = departmentRepository.findDnoByDname(DNAME);
        if (dno != -1) {
            return employeeRepository.findByDno(dno);
        } else {
            return null;
        }
    }
}

