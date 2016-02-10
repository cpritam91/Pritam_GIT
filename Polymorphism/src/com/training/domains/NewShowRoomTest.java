package com.training.domains;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class NewShowRoomTest {

	int key;
	@SuppressWarnings("rawtypes")
	Class actual;
	NewShowRoom nsr = new NewShowRoom();
	
	@SuppressWarnings("rawtypes")
	public NewShowRoomTest(int key,Class actual) {
		this.key = key;
		this.actual = actual;
	}
	
	@Test
	public void testAutomobileByParameters() {
		Object auto = nsr.getItem(key);
		assertEquals(auto.getClass(),actual);
	}
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { {2,LuxuryCar.class} , {1,PassengerCar.class}, {3,Sportscar.class}, {4,SportsBike.class} };
	return Arrays.asList(data);
	}
	/*@Test
	public void testAutomobile() {
		Object ob = nsr.getItem(1);
		assertEquals(ob.getClass(),Automobile.class);
	}*/
	/*@Test
	public void testPassengerCar() {
		Object ob = nsr.getItem(1);
		assertEquals(ob.getClass(),PassengerCar.class);
	}
	@Test
	public void testLuxuryCar() {
		Object ob = nsr.getItem(2);
		assertEquals(ob.getClass(),LuxuryCar.class);
	}
	@Test
	public void testSportsCar() {
		Object ob = nsr.getItem(3);
		assertEquals(ob.getClass(),Sportscar.class);
	}
	@Test
	public void testSportsBike() {
		Object ob = nsr.getItem(4);
		assertEquals(ob.getClass(),SportsBike.class);
	}*/
	@Test
	public void testDefault() {
		assertNull(nsr.getItem(5));
	}
	
	
	
}
