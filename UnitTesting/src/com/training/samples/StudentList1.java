package com.training.samples;

import java.util.*;

public class StudentList1 {

	private HashSet<Student> stuset;

	public StudentList1() {
		stuset = new HashSet<Student>();
	}
	
	public void addStudent(Student s) {
		stuset.add(s);
	}

	public HashSet<Student> getStuset() {
		return stuset;
	}

	public void setStuset(HashSet<Student> stuset) {
		this.stuset = stuset;
	}	
}
