package com.viva;

public class RoadBicycle extends Bicycle{

	int speed;
	
	public RoadBicycle(int speed) {
		super(speed);
//		this.speed =speed;
	}
	
	public void speedUp(){
		this.speed+=2;
	}
	
	public void brakeDown(){
		this.speed-=2;
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}


	
}
