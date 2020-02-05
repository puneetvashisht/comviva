package com.viva.jdbcdemo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.viva.Employee;

import junit.framework.Assert;

public class TestDB {
	
	EmployeeRepository employeeRepo;
	
	@Before
	public void setUp(){
		employeeRepo = new EmployeeRepository();

	}

//	@Test
//	public void testInsertEmployee() {
//		Employee employee = new Employee(12, "Ravi", 343334.3);
//		int recordsInserted = employeeRepo.saveEmployee(employee);
//		assertTrue(recordsInserted > 0);
//	}
	
	@Test
	public void fetchEmployees(){
		List<Employee> employees = employeeRepo.fetchAllEmployees();
		System.out.println(employees);
		assertTrue(employees.size()>0);
		
		
	}

}
