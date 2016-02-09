package com.training.handson;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {

	BankAccount obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testNull() {
		
		obj = new BankAccount(0,null,0);
	}
	@Test
	public void checkValue() {
		obj = new BankAccount(101,"Pritam",10978.0);
		assertEquals(101,obj.getAccNo());
		assertEquals("Pritam",obj.getAccHolderName());
		assertEquals(10978.0,obj.getBalance(),0);
	}
	public void testDeposit() {
		obj = new BankAccount(101,"Pritam",10978.0);
		double prevBal = obj.getBalance();
//		obj.deposit(-100);
//		double newBal = obj.getBalance();
		assertEquals(newBal, prevBal, 0);
		assertEquals(double,)
	}
}
