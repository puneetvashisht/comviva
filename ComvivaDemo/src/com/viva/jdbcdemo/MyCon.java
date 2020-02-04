package com.viva.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.viva.Employee;

class MyCon {
	public static void main(String args[]) {
		try {
//			1. Load the driver class 
			Class.forName("com.mysql.jdbc.Driver");
//			2. Get the connnection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/appdb", "root", "rootroot");
			System.out.println("Connected to database....");
			// here sonoo is database name, root is username and password
//			3. Fire the query
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
			System.out.println(employees);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
