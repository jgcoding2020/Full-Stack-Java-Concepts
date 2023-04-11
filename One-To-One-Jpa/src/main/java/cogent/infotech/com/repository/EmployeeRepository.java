package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
