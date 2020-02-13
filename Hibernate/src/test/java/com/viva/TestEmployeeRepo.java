package com.viva;

import org.junit.Test;

public class TestEmployeeRepo {

	@Test
	public void test() {
		
		Employee emp = new Employee("Ravi", 34343.34);
		
		EmployeeRepo repo = new EmployeeRepo();
		repo.addEmployee(emp);
	}

}
