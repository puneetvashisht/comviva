package com.viva.threadsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.viva.Employee;

public class ConcurrentSalaryTransfer {

	private static int amountLeft;

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
		
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
		
		for(Employee e : employees){
//			This is discouraged
//			Thread t = new Thread(new SalaryTask(e));
//			t.start();
			Future<Integer> future = executor.submit(new SalaryTaskCallable(e));
			try {
				amountLeft = future.get();
				System.out.println("In the main thread" + amountLeft);
			} catch (InterruptedException | ExecutionException e5) {
				// TODO Auto-generated catch block
				e5.printStackTrace();
			}
			
			
		}
		

	}

}
