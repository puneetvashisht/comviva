package com.viva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class EmployeeRestController {
	
	@Autowired
	EmployeeRepo repo;
	

	@RequestMapping(path="/employees" , method=RequestMethod.GET)
	public List<Employee> findAllEmployees(Model model){
		List<Employee> employees = repo.findAllEmployees();
		return employees;
	}

}
