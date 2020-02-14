package com.viva;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestEmployeeRepository {
	
	@Autowired
	EmployeeRepo repo;

	@Test
	public void test() {
//		fail("Not yet implemented");
		Employee emp = new Employee("Sahil", 34343.34);
		try {
			repo.addEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
