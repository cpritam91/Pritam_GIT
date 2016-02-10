package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectTest {

	boolean result;
	
	@Test
	public void testPositive() {		
		result = PerfectNumber.isPerfect(0);
		assertFalse("PerfectNumber should be positive.",result);		
	}
	@Test
	public void testBoolean() {
		
		Object actual = PerfectNumber.isPerfect(5).getClass();
		assertEquals(actual,Boolean.class);
	}
	
	@Test
	public void testTrueCondition() {
		assertTrue(PerfectNumber.isPerfect(6));
		assertTrue(PerfectNumber.isPerfect(28));
	}
	
	@Test
	public void testFalseCondition() {
		assertFalse(PerfectNumber.isPerfect(1));
		assertFalse(PerfectNumber.isPerfect(7));
		assertFalse(PerfectNumber.isPerfect(29));
	}
	
	@Test(timeout = 1000)
	public void testInfiniteLoop() {
		PerfectNumber.isPerfect(496);
	}
	
		
}
