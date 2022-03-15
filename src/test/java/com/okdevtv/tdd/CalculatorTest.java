package com.okdevtv.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

private Calculator calculator ;
	
	@Before
	public void setup() {
		calculator = new Calculator() ;
	}

	@Test
	public void testAdd() {
		assertEquals(2, calculator.add(1, 1)) ;
	}
	
	@Test
	public void testSubtract() {
		assertEquals(0, calculator.subtract(1, 1)) ;
	}
	
	@Test
	public void testMultiply() {
		assertEquals(1, calculator.multiply(1, 1)) ;
	}
	
	@Test
	public void testDivide() {
		assertEquals(1, calculator.devide(1, 1)) ;
	}

}
