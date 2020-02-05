package com.viva.threadsdemo;

import java.util.concurrent.Callable;

import com.viva.Employee;

public class SalaryTaskCallable  implements Callable<Integer>{

	static int totalAmountAllocatedforSalaries = 1000000;
	
	Employee employee;
	
	public SalaryTaskCallable(Employee employee) {
		super();
		this.employee = employee;
	}



	@Override
	public Integer call() throws Exception {
		System.out.println("Salary transfer being done by: " + Thread.currentThread().getName());
		// totalAmountAllocatedforSalaries - employee.salary
		synchronized(SalaryTaskCallable.class){
			totalAmountAllocatedforSalaries -= employee.salary;
		}	
		System.out.println("Amout left: " + totalAmountAllocatedforSalaries);
		return totalAmountAllocatedforSalaries;
	}

}
