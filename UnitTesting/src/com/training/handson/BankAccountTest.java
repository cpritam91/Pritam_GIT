package com.training.handson;

import static org.junit.Assert.*;


import org.junit.Test;

public class BankAccountTest {

	BankAccount obj = new BankAccount(101,"Pritam",10978.0);
	
	@Test(expected=NullPointerException.class)
	public void testNull() {
		
		obj = new BankAccount(0,null,0.0);
	}
	@Test
	public void testValue() {
		assertEquals(101,obj.getAccNo());
		assertEquals("Pritam",obj.getAccHolderName());
		assertEquals(10978.0,obj.getBalance(),0);
	}
	@Test
	public void testDeposit() {
		
		double actual = obj.deposit(500);
		assertTrue("deposit() should return a positive value.",actual>0);
	}
	@Test(timeout=1000)
	public void testWithdraw() {
		double actual = obj.withdraw(11000);
		assertTrue("withdraw() should return a non-negative value.",actual>=0);
	}
	@Test
	public void testDepositWorking() {
		double prevBal = obj.getBalance();
		double actual = obj.deposit(500);
		assertEquals(actual,prevBal+500,0);
	}
	@Test(timeout=100)
	public void testInfiniteLoop() {
		obj.withdraw(50);
	}
	@Test
	public void testConstructorNullPointer() {
		
		try {
			obj = new BankAccount(null,"Pritam",10978.0);
			fail("Doesn't throw Null pointer exception for accNo = null");
		} catch(NullPointerException e) {
			try {
				obj = new BankAccount(101,null,10978.0);
				fail("Doesn't throw Null pointer exception for AccountName = null");
			} catch(NullPointerException f) {
				try {
					obj = new BankAccount(101,"Pritam",null);
					fail("Doesn't throw Null pointer exception for AccBalance = null");
				} catch(NullPointerException g) {}
			}
		}
	}
}
