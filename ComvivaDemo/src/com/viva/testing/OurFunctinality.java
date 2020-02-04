package com.viva.testing;

public class OurFunctinality {
	
	public static int sum(int x, int y){
		if(y == 0) throw new RuntimeException("Negative values not allowed");
		return x + y;
	}

}
