import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("SELECT d.dno FROM Department d WHERE d.dname = ?1")
    int findDnoByDname(String dname);
}
