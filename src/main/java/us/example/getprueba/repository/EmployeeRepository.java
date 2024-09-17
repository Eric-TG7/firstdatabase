package us.example.getprueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.example.getprueba.entity.Employee;
import us.example.getprueba.entity.Supplier;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
