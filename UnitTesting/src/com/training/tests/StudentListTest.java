package com.training.tests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.StudentList;

public class StudentListTest {

	StudentList obj = new StudentList();
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

	@Test
	public void test() {
		obj.addStudent("Ramesh");
		obj.addStudent("Suresh");
		int size = obj.getNames().size();
		int actsize = obj.addStudent("Ramesh");
		assertEquals(size,actsize,0);
	}
	@Test
	public void testNull() {
		Set<Double> testSet = obj.getNumbers(); 
		assertNotNull(testSet);
	}

}
