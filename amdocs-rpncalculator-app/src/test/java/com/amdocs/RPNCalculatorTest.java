package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest {
	
	RPNCalculator rpnCalculator;
	private double actualResult,expectedResult; 
	
	//Before Class method will be executed once. 
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class Method");
	}
	
	//Before method will be executed before executing each test case
	@Before
	public void init() {
	System.out.println("Before Method");
	rpnCalculator=new RPNCalculator();
	actualResult=expectedResult=0;

	}
	
	//After method will be executed after executing each test case
	@After
	public void cleanUp() {
	
	System.out.println("After Method");	
		
	rpnCalculator=null;
	

	}
	
	//After Class method will be executed once. 
	@AfterClass
	
	public static void tearDown() {
		
		System.out.println("After Class Method");	
	}

	@Category(SmokeTest.class)
	@Test
	public void testSimpleAddition() {
		
		
		double actualResult=rpnCalculator.evaluate("10 15 +");
		double expectedResult=25.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
		

		actualResult=rpnCalculator.evaluate("10 115 +");
		expectedResult=125.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
	
	}
	
	
	@Test
	public void testSimpleSubtraction() {
		
		
		
		actualResult=rpnCalculator.evaluate("45 15 -");
		expectedResult=30.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
		

		actualResult=rpnCalculator.evaluate("10 115 -");
		expectedResult=-105;
		
		assertEquals(expectedResult,actualResult,0.0001);
	
	}
	
	@Test
	public void testSimpleMultiplication() {
		
		
		
		actualResult=rpnCalculator.evaluate("5 3 *");
		expectedResult=15.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
		

		actualResult=rpnCalculator.evaluate("10 115 *");
		expectedResult=1150;
		
		assertEquals(expectedResult,actualResult,0.0001);
	
	}
	
	@Test
	public void testSimpleDivision() {
	
		
		actualResult=rpnCalculator.evaluate("15 3 /");
		expectedResult=5.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
		
		
		actualResult=rpnCalculator.evaluate("10 10 + 100 20 / *");
		expectedResult=100.0;
		
		assertEquals(expectedResult,actualResult,0.0001);
		
		
		
		
		
	
	}


}
