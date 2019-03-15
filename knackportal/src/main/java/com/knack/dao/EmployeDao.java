package com.knack.dao;

import java.util.List;
import javax.sql.DataSource;
import com.knack.models.Employe;

public interface EmployeDao {
	
	public void setDataSource(DataSource ds);
	
	public void save(String fname,String lname,String gender,String role,String empcode,String contact, String password);
	//Read
		public List<Employe> getByid(String empcode);
		//Update
		public void update(Employe employee);
		//Delete
		public void deleteById(int id);
		//Get All
		public boolean validate(String empcode,String password);
		public List<Employe> getAll();

}
