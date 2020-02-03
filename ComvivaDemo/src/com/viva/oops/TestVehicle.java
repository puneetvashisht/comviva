package com.viva.oops;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void testCar() {
		Engine scorpioEngine = new Engine(232434, "Fiat");
		Car scorpio = new Car(300, scorpioEngine);
		System.out.println(scorpio);
	}
	
	@Test
	public void testPlane(){
		
	}

}
