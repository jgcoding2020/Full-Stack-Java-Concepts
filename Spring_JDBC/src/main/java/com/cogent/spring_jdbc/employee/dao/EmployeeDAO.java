package com.cogent.spring_jdbc.employee.dao;

import java.util.List;

import com.cogent.spring.spring_jdbc.employee.dto.Employee;

public interface EmployeeDAO {

	int create(Employee emp);
	Employee read(int id);
	List<Employee> read();
	int update(Employee emp);
	int delete(Employee emp);
}
