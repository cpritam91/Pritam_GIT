package com.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedPerfectNumberTest {

	private int numbers;
	private boolean result;
	
	public ParameterizedPerfectNumberTest(int numbers,boolean result) {
		this.numbers = numbers;
		this.result = result;
	}	
	
	@Test
	public void testPerfectByParam() {
		
		boolean actual = PerfectNumber.isPerfect(numbers);
		
		//assertTrue(numbers +  "is not Perfect Number",actual);
		assertEquals(actual,result);
		
	}
	
	@Parameters
	/*public static Collection<Object> data() {
		Object[] data = new Object[] { 6 , 33, 28, 44 };
	return Arrays.asList(data);
	}*/
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { {6,true} , {28,false}, {28,true}, {44,false} }; // 2nd test case will fail
	return Arrays.asList(data);
	}
	
}
