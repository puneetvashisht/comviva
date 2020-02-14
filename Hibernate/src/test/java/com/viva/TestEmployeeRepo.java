//package com.viva;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//
//public class TestEmployeeRepo {
//
////	@Test
//	public void test() {
//		
//		Address address = new Address(23, "GK", "DElhi");
//		Address officeAddress = new Address(2, "Sector 59", "Gurgaon");
//		
//		List<Address> addresses = new ArrayList<>();
//		addresses.add(address);
//		addresses.add(officeAddress);
//		
//		
//		
//		Employee emp = new Employee("Priya", 34343.34);
//		emp.setAddresses(addresses);
//		
////		System.out.println(emp);
//		
//		EmployeeRepo repo = new EmployeeRepo();
//		repo.addEmployee(emp);
//	}
//	
//	@Test
//	public void testFindEmplyoee() {
//		
////		Employee emp = new Employee("Ravi", 34343.34);
//		
//		EmployeeRepo repo = new EmployeeRepo();
//		Employee emp = repo.findEmployee(1);
//		System.out.println(emp);
//		System.out.println(emp.getAddresses());
//		
//		
//	}
//	
////	@Test
//	public void testIncrementSalaryEmplyoee() {
//		
////		Employee emp = new Employee("Ravi", 34343.34);
//		
//		
////		repo.incrementSalary(2, 50000d);
//	}
//	
////	@Test
//public void testFindAllEmplyoees() {
//		EmployeeRepo repo = new EmployeeRepo();	
//		List<Employee> employees = repo.findAllEmployeesGreaterThanSalary(35000d);
//		System.out.println(employees);
//	}
//
//}
