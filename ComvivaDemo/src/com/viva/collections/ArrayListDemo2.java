package com.viva.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.viva.Employee;


class Fruit{
	public Fruit(String name){
		this.name = name;
	}
	String name;
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Fruit other = (Fruit) obj;
		if (!this.name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class ArrayListDemo2 {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		String f1 = "Banana";
		
		fruits.add("Apples");
		fruits.add("Mango");
		fruits.add(f1);
		
		System.out.println(fruits);
		
		
		String f2 = "Banana";
		
		fruits.add(f2);
		System.out.println(f1.equals(f2));
		
		System.out.println(fruits.size());
		
		
		
		Set<Employee> employees = new LinkedHashSet<>();
		Employee e1 = new Employee(1, "Ravi", 34344.34);
		Employee e2 = new Employee(2, "Priya", 44344.34);
		Employee e3 = new Employee(3, "Amit", 34344.34);
		Employee e4 = new Employee(12, "Sameer", 44344.34);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		Employee searchForThisEmployee = new Employee(3, "Amit", 34344.34);
		employees.add(searchForThisEmployee);
		
//		employees.add(2, e4);
		
		
		System.out.println(employees.size());
		
		
		boolean result = employees.contains(searchForThisEmployee);
		System.out.println(result);
		
		

	}

}
