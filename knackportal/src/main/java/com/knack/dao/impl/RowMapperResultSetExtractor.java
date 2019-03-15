package com.knack.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.knack.models.Employe;

public class RowMapperResultSetExtractor extends java.lang.Object implements ResultSetExtractor<java.util.List<Employe>>{

	public List<Employe> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employe employe;
		int i=0;
		List<Employe> employeList=new ArrayList<Employe>();
		//List<<List>> callableList = new ArrayList<ShardJdbcTemplate.QueryCallable<List>>();
		while(rs.next()) {
			employe=new Employe();
			employe.setFname(rs.getString("fname"));
			employe.setLname(rs.getString("lname"));
			employe.setGender(rs.getString("gender"));
			employe.setRole(rs.getString("role"));
			employe.setEmpcode(rs.getString("empcode"));
			employe.setContact(rs.getString("contact"));
			employe.setPassword(rs.getString("password"));
			employeList.add(i, employe);
			i++;
		}
		return employeList;
	}

}
