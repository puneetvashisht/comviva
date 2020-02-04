package com.viva;

public class Employee {
	
	Integer id;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
//	
//	@Override
//	 public boolean equals(Object obj) {
//	     Employee emp = (Employee) obj;
//	     return this.id.equals(emp.id);
//	 }
	
	
	
	

}
