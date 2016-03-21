package com.training.domains;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component("department")
public class Department {

	private int deptId;
	private Set<Student> students;
	
	public Department() {
		super();
	}

	public Department(int deptId, Set<Student> students) {
		super();
		this.deptId = deptId;
		this.students = students;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
		return "Department [deptId=" + deptId + ", students=" + students + "]";
	}
}
