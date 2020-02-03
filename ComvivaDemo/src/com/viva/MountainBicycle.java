package com.viva;

public class MountainBicycle extends Bicycle{

	int gears;
	
	public MountainBicycle(int speed) {
		super(speed);
	}
	public MountainBicycle(int speed, int gears) {
		this(speed);
//		super(speed);
		this.gears = gears;
		
	}
	
//	public void speedUp(){
//		this.speed++;
//	}
//	
	@Override
	public void brakeDown(){
		this.speed--;
	}

	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}


	
}
