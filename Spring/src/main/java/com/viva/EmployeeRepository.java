package com.viva;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void fetchAllEmployees(){
//		List<Employee> employees = jdbcTemplateObject.queryForList("select * from employee", Employee.class);
		System.out.println(jdbcTemplateObject.queryForList("select * from employee"));
//		;
//		System.out.println(employees);
	}

}
