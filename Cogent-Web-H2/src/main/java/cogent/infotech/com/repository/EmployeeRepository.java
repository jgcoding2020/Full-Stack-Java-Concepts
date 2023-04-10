package cogent.infotech.com.repository;

import org.springframework.data.repository.CrudRepository;

import cogent.infotech.com.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
