package com.viva;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.viva.entities.Course;
import com.viva.repos.CourseRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestEmployeeRepo {
	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	CourseRepo courseRepo;
//	@Test
	public void test() {
		Employee emp = new Employee("Sahil", 34343.34);
		try {
			repo.addEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void addCourse(){
		Course course = new Course("Angular", "framework from google!!");
		courseRepo.addCourse(course);
	}
	

}
