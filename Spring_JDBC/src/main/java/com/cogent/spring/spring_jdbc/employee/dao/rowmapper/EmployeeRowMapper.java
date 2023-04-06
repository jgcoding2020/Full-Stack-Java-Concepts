package com.cogent.spring.spring_jdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.cogent.spring.spring_jdbc.employee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
        emp.setId(rs.getInt("id"));
        emp.setfName(rs.getString("fname"));
        emp.setlName(rs.getString("lname"));
        return emp;
	}
}
