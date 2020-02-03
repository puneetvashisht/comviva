package com.viva;

public class Manager extends Employee{
		
	int numberOfResources;
	
	public Manager(int id, String name, double salary, int nOR){
//		super();
		super(id, name, salary);
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
		numberOfResources = nOR;
		
		
	}
	
	public void approveLeave(){
		System.out.println("Leave Approved!!");
	}

	@Override
	public String toString() {
		return "Manager [numberOfResources=" + numberOfResources + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}
