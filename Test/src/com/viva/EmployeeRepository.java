package com.viva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viva.Employee;

public class EmployeeRepository {
	
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
//			2. Get the connnection
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/appdb", "root", "rootroot");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


	public List<Employee> fetchAllEmployees() {
		Connection con = getConnection();
		
		try{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			ArrayList<Employee> employees = new ArrayList<>();
			
//			4. Get result
			while (rs.next()){
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
				Employee e = new Employee(rs.getInt("id"), rs.getString("name"), 0.0d);
				employees.add(e);
			}
				
//			5. Close DB connection
			con.close();
			return employees;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}

}
