package com.viva;

public class Employee {
	
	int id;
	String name;
	double salary;
	private Address address;
	
	public Employee(){
		
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(int id, String name, double salary, Address address) {
		this(id, name, salary);
		this.address = address;
	}
	
	

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		if(address.houseNumber > 0){
			this.address = address;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
