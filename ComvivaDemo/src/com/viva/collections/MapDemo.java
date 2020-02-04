package com.viva.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.viva.Employee;

public class MapDemo {

	public static void main(String[] args) {
		Map<Long, Employee> employeeMap = new HashMap<>();
		Employee e1 = new Employee(1, "Ravi", 34344.34);
		Employee e2 = new Employee(2, "Priya", 14344.34);
		Employee e3 = new Employee(3, "Amit", 44344.34);
		Employee e4 = new Employee(12, "Sameer", 24344.34);
		employeeMap.put(9988776655l,e1);
		employeeMap.put(9988776654l,e2);
		employeeMap.put(9988776653l,e3);
		employeeMap.put(9988776655l, e4);
		
		Set<Long> keys = employeeMap.keySet();
		System.out.println(keys);
		
		System.out.println(employeeMap.get(9988776653l));

	}

}
