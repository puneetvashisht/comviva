package com.viva;
// import statements 

public class Vehicle extends Object{
	
	// constructor
	public Vehicle(int id, int maxSpeed){
		this.id = id;
		this.maxSpeed = maxSpeed;
	}
	
	// fields or instance variables
	int id;
	int maxSpeed;
	String make;
	
	
	// functionality methods
	void speedUp(){
		this.maxSpeed++;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", maxSpeed=" + maxSpeed + ", make=" + make + "]";
	}



	public static void main(String[] args) {
		Vehicle v = new Vehicle(21, 100);
//		v.maxSpeed = 100;
		System.out.println(v);
		System.out.println(v.toString());
		System.out.println(v.maxSpeed);
		System.out.println(v.make);
		System.out.println(v.id);
		
		Vehicle v1 = new Vehicle(434, 300);
//		v1.maxSpeed = 200;
		System.out.println(v1);
		System.out.println(v1.maxSpeed);
		System.out.println(v1.toString());
	}

}




