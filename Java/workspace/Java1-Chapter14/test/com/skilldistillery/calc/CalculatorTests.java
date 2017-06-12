package com.skilldistillery.calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
	
	Calculator calc;	
	
	@Before
	public void setUp() throws Exception {
	calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	calc = null;
	
	}

	@Test
	public void test_add_adds_two_numbers() {
		int expected = 15;
		int result = calc.add(9, 6);
		assertEquals(expected, result);
		assertEquals(-3, calc.add(-1, -2));
		
	}
	@Test
	public void test_sub_subtracts_two_numbers() {
		int expected = 3;
		int result = calc.sub(9, 6);
		assertEquals(expected, result);
		//assertEquals(1, calc.add(-1, -2));

	}
	@Test
	public void testDivIntsDividesArg1ByArg2AndReturnsWholeNumberTruncated() {
		int expected = 4;
		int result = calc.divInt(14, 3);
		assertEquals(expected, result);
		assertEquals(2, calc.divInt(5,2));
		
	}
	@Test(expected = CannotDoThatException.class)
	public void testDivInts_Throws_ArithmeticException_when_arg2_is_zero(){
		calc.divInt(5, 0);
		
	}
	@Test
	public void testDivIntsThrowsArithmeticExceptionWhenArg2IsZero(){
		try {
			calc.divInt(6, 0);
			fail("Should have thrown exception here");
			
		} catch (CannotDoThatException cdte) {
			// TODO: handle exception
			
			
		}
		
	}
	
	@Test
	public void testDivIntsMultipliesArg1ByArg2() {
		int expected = 4;
		int result = calc.mult(2, 2);
		assertEquals(expected, result);
		assertEquals(10, calc.mult(5,2));
		
	}
	@Test
	public void testDivDouDividesArg1ByArg2AndReturnsDouble() {
		int expected = 4;
		int result = calc.divInt(14, 3);
		assertEquals(expected, result);
		assertEquals(2, calc.divInt(5,2));
		
	}
}
