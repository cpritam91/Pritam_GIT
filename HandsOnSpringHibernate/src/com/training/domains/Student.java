package com.training.domains;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	private int rollNo;
	private String name;
	private double marks_Academic;
	private double marks_Event;
	private double marks_Sport;
	private double marks_Cultural;
	private int deptId;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, double marks_Academic, double marks_Event, double marks_Sport,
			double marks_Cultural,int deptId) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks_Academic = marks_Academic;
		this.marks_Event = marks_Event;
		this.marks_Sport = marks_Sport;
		this.marks_Cultural = marks_Cultural;
		this.deptId = deptId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks_Academic() {
		return marks_Academic;
	}

	public void setMarks_Academic(double marks_Academic) {
		this.marks_Academic = marks_Academic;
	}

	public double getMarks_Event() {
		return marks_Event;
	}

	public void setMarks_Event(double marks_Event) {
		this.marks_Event = marks_Event;
	}

	public double getMarks_Sport() {
		return marks_Sport;
	}

	public void setMarks_Sport(double marks_Sport) {
		this.marks_Sport = marks_Sport;
	}

	public double getMarks_Cultural() {
		return marks_Cultural;
	}

	public void setMarks_Cultural(double marks_Cultural) {
		this.marks_Cultural = marks_Cultural;
	}
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks_Academic=" + marks_Academic + ", marks_Event="
				+ marks_Event + ", marks_Sport=" + marks_Sport + ", marks_Cultural=" + marks_Cultural + ", dept_id="
				+ deptId + "]";
	}
}
