package com.training.tests;

import static org.junit.Assert.*;

import org.junit.*;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {

	CurrencyConverter conv = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("Before Class");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called ==========");
		conv = new CurrencyConverter();
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("After Called **********");
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		double actual = conv.dollarToRupees(10);
		assertEquals(999.0, actual,1); //(expected_value,exact_value,error_relaxation)
	}


	@Test
	public void test2() {
		double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}
}
