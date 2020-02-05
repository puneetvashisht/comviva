package com.viva.threadsdemo;

import java.util.ArrayList;
import java.util.List;

import com.viva.Employee;

public class ParallelSalaryTransfer {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee(1, "Ravi", 30000.00);
		Employee e2 = new Employee(2, "Priya", 40000.0);
		Employee e3 = new Employee(3, "Amit", 50000.0);
		Employee e4 = new Employee(12, "Sameer", 20000.0);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		for(Employee e : employees){
			Thread t = new Thread(new SalaryTask(e));
			t.start();
		}
		

	}

}
