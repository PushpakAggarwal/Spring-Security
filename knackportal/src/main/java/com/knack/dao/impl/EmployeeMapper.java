package com.knack.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.knack.models.Employe;

public class EmployeeMapper implements RowMapper<Employe>{
	public Employe emp=new Employe();
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		emp.setFname(rs.getString("fname"));
		emp.setLname(rs.getString("lname"));
		emp.setGender(rs.getString("gender"));
		emp.setRole(rs.getString("role"));
		emp.setEmpcode(rs.getString("empcode"));
		emp.setContact(rs.getString("contact"));
		emp.setPassword(rs.getString("password"));
		return emp;
	}
	
}
