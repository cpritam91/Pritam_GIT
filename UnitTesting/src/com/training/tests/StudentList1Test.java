package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.Student;
import com.training.samples.StudentList1;

public class StudentList1Test {

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
	public void testDuplicate() {
		Student s1 = new Student(101,"Pritam");
		Student s2 = new Student(101,"Pritam");		
		
		StudentList1 obj = new StudentList1();
		
		obj.addStudent(s1);
		obj.addStudent(s2);

		int size = obj.getStuset().size();
		
		assertEquals(1,size,0);
	}

}
