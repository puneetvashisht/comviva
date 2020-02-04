package com.viva.testing;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOurFunctionality {
	static int oper1;
	@BeforeClass
	public static void setup(){
		System.out.println("Before every test case");
		oper1=-3; 
	}

	@Test
	public void test() {
		int oper1 = 3;
		int oper2 = 3;
		int result = OurFunctinality.sum(oper1, oper2);
		
		int expectedValue = 6;
		
		assertSame(expectedValue, result);
	}
	
	@Test(timeout=1000)
	public void testNegativeValues() {
//		int oper1 = -3;
		int oper2 = -3;
		int result = OurFunctinality.sum(oper1, oper2);
		
		int expectedValue = -6;
		
		assertSame(expectedValue, result);
	}
	
	@Test(expected=RuntimeException.class)
	public void testZeroDivision() {
//		int oper1 = -3;
		int oper2 = 0;
		int result = OurFunctinality.sum(oper1, oper2);
		
		int expectedValue = -6;
		
		assertSame(expectedValue, result);
	}

}
