package com.viva.oops;

public class Car extends Vehicle{

	public Car(int speed, Engine engine) {
		super(speed, engine);
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", engine=" + engine + "]";
	}
	
	
	

}
