package com.cogent.spring.spring_jdbc.employee.dao_impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.cogent.spring.spring_jdbc.employee.dto.Employee;
import com.cogent.spring_jdbc.employee.dao.EmployeeDAO;
import com.cogent.spring.spring_jdbc.employee.dao.rowmapper.EmployeeRowMapper;

@Component("employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee emp) {
		String query = "insert into employee(id, fname, lname) values(?,?,?)";
		int result = jdbcTemplate.update(query, emp.getId(), emp.getfName(), emp.getlName());
		return result;
	}

	@Override
	public Employee read(int id) {
		String query = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(query, rowMapper, id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		String query = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(query, rowMapper);
		return result;
	}
	
	@Override
	public int update(Employee emp) {
		String query = "update employee set fname=?, lname=? where id=?";
		int result = jdbcTemplate.update(query, emp.getfName(), emp.getlName(), emp.getId());
		return result;
	}

	@Override
	public int delete(Employee emp) {
		String query = "delete from employee where id=?";
		int result = jdbcTemplate.update(query, emp.getId());
		return result;
	}

	

}
