package cogent.infotech.com.service;

import java.util.List;

import cogent.infotech.com.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> fetchEmployee();
}
