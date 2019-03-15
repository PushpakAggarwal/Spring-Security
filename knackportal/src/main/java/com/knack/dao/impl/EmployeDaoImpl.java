package com.knack.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.knack.dao.EmployeDao;
import com.knack.models.Employe;

public class EmployeDaoImpl implements EmployeDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	public Employe ee,see;
	
	public void setDataSource(DataSource ds) {
		this.dataSource=ds;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public void save(String fname, String lname, String gender, String role, String empcode, String contact,
			String password) {
		String sql="insert into knack(fname,lname,gender,role,empcode,contact,password) values (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,fname,lname,gender,role,empcode,contact,password);
	}

	public List<Employe> getByid(String search) {
		String str=new String(search);
		String str2=str.substring(0, 2);
		String name=str2.concat("%");
		String sql="select * from knack where fname LIKE ? or empcode=? or role=?";
		List<Employe> employe=jdbcTemplate.query(sql, new Object[] {name,search,search} , new RowMapperResultSetExtractor());
		return employe;
	}

	public void update(Employe employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public boolean validate(String empcode, String password) {
		boolean check=true;
		EmployeeMapper obj=new EmployeeMapper();
		String sql="select * from knack where empcode=? and password=?";
		try {
			jdbcTemplate.queryForObject(sql, new Object[] {empcode,password}, obj);
			see=obj.emp;
			if(obj==null) {
				check=false;
			}
		}catch (Exception e) {
			check=false;
		}
		return check;
	}

	public List<Employe> getAll() {
		String sql="select * from knack";
		List<Employe> employe=jdbcTemplate.query(sql, new RowMapperResultSetExtractor());
		return employe;
	}
	
}
