package com.pack.mockitodemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	
	Calculator c1 = null;
//	CalculatorService cs = new CalculatorService() { //Annonymous inner class - a class which doesnot has name
//		
//		public int add(int a, int b) {
//			// TODO Auto-generated method stub
//			return a+b;
//		}
//	};
	CalculatorService cs = Mockito.mock(CalculatorService.class); //for remote purpose --creates default instance which returns zero

	@Test
	public void testOperation() {
		assertEquals(30,c1.performCalculation(cs));
		System.out.println("Tested Operation");
	}
	
	@Before                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	public void createObject() {
		System.out.println("Object Created..");
		c1 = new Calculator();
	}
	
	@After
	public void removeObject() {
		System.out.println("Object removed");
		c1 = null;
	}

}
