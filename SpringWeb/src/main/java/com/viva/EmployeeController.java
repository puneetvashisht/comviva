package com.viva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping(path="/hello" , method=RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("message", "Welcome user to this session");
		model.addAttribute("user", "Ravi");
		return "hello";
	}
	@RequestMapping(path="/employees" , method=RequestMethod.GET)
	public String findAllEmployees(Model model){
		List<Employee> employees = repo.findAllEmployees();
		model.addAttribute("emps", employees);
		return "employees";
	}

}
