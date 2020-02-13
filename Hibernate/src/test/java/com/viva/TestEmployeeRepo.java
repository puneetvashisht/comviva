package com.viva;

import java.util.List;

import org.junit.Test;

public class TestEmployeeRepo {

//	@Test
	public void test() {
		
		Employee emp = new Employee("Ravi", 34343.34);
		
		EmployeeRepo repo = new EmployeeRepo();
		repo.addEmployee(emp);
	}
	
//	@Test
	public void testFindEmplyoee() {
		
//		Employee emp = new Employee("Ravi", 34343.34);
		
		EmployeeRepo repo = new EmployeeRepo();
		System.out.println(repo.findEmployee(2));
	}
	
//	@Test
	public void testIncrementSalaryEmplyoee() {
		
//		Employee emp = new Employee("Ravi", 34343.34);
		
		
//		repo.incrementSalary(2, 50000d);
	}
	
	@Test
public void testFindAllEmplyoees() {
		EmployeeRepo repo = new EmployeeRepo();	
		List<Employee> employees = repo.findAllEmployeesGreaterThanSalary(35000d);
		System.out.println(employees);
	}

}
