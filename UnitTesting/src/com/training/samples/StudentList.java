package com.training.samples;

import java.util.*;

public class StudentList {

	private Set<String> names;
	private Set<Double> numbers; // To check for null Test
	public StudentList() {
		
		names = new HashSet<String>();
		numbers = new HashSet<Double>(); // if this line is commented, the null test will fail
		/*names.add("Ramesh");
		names.add("Suresh");
		names.add("Ramesh");*/
	}

	public Set<String> getNames() {
		return names;
	}

	public void setNames(Set<String> names) {
		this.names = names;
	}
	
	public Set<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<Double> numbers) {
		this.numbers = numbers;
	}

	public int addStudent(String stu)
	{
		names.add(stu);
		
		return names.size();
	}
}
