package com.viva;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBicycle {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
//		boolean result = functionlity();
//		Bicycle b = new Bicycle();
		Bicycle rb = new RoadBicycle(5);
		Bicycle mb = new MountainBicycle(10);
		Bicycle bicycles[] = {rb, mb};
		
		for(Bicycle b: bicycles){
			System.out.println(b);
			b.speedUp();
			System.out.println(b);
			b.brakeDown();
			System.out.println(b);
			
		}
		
		
		System.out.println("hello world with junit");
		assertTrue(true);
	}

}
