package com.training.entity;

public class Employee {
	
	private Integer EmpId;
	private String EmpName;
	private Double Salary;
	private Long MobNo;
	private Boolean isEnabled;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double salary, long mobNo,
			boolean isEnabled) {
		super();
		EmpId = empId;
		EmpName = empName;
		Salary = salary;
		MobNo = mobNo;
		this.isEnabled = isEnabled;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName +  ", salary=" + Salary
				+ ", mobNo=" + MobNo + ", isEnabled=" + isEnabled + "]";
	}
	
	
}
