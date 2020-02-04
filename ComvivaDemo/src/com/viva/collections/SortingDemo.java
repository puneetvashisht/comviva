package com.viva.collections;

import java.util.TreeSet;

import com.viva.Employee;

public class SortingDemo {

	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<>(new SalaryComparator());
		Employee e1 = new Employee(1, "Ravi", 34344.34);
		Employee e2 = new Employee(2, "Priya", 14344.34);
		Employee e3 = new Employee(3, "Amit", 44344.34);
		Employee e4 = new Employee(12, "Sameer", 24344.34);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(employees);
		
//		Collections.sort(employees , new SalaryComparator());
//		System.out.println(employees);
//		
//		Collections.sort(employees);
//		System.out.println(employees);

	}

}
