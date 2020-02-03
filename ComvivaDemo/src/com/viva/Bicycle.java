package com.viva;

public abstract class Bicycle {
	
	int speed;

	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public void speedUp(){
		this.speed++;
	}
	public abstract void brakeDown();

}
