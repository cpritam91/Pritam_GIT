package com.training.samples;

public class Student {

	private int StudentId;
	private String StudentName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName) {
		super();
		StudentId = studentId;
		StudentName = studentName;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudentId;
		result = prime * result + ((StudentName == null) ? 0 : StudentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentId != other.StudentId)
			return false;
		if (StudentName == null) {
			if (other.StudentName != null)
				return false;
		} else if (!StudentName.equals(other.StudentName))
			return false;
		return true;
	}
	
	
}
