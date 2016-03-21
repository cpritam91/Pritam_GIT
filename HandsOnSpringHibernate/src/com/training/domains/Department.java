package com.training.domains;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component("department")
public class Department {

	private int deptId;
	private String deptName;
	private Set<Student> students;
	
	public Department() {
		super();
	}

	public Department(int deptId, String deptName, Set<Student> students) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.students = students;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public void addStudent(Student stu) {
		students.add(stu);
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", students=" + students + "]";
	}
}
