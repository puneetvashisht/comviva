package com.viva.threadsdemo;

import com.viva.Employee;

public class SalaryTask  implements Runnable{

	static int totalAmountAllocatedforSalaries = 1000000;
	
	Employee employee;
	
	public SalaryTask(Employee employee) {
		super();
		this.employee = employee;
	}



	@Override
	public void run() {
		System.out.println("Salary transfer being done by: " + Thread.currentThread().getName());
		// totalAmountAllocatedforSalaries - employee.salary
		synchronized(SalaryTask.class){
			totalAmountAllocatedforSalaries -= employee.salary;
		}	
		System.out.println("Amout left: " + totalAmountAllocatedforSalaries);
	}

}
