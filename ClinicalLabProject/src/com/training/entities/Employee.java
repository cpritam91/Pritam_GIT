package com.training.entities;

public class Employee {

	private Integer empId;
	private String empName;
	private String address;
	private Long phone;
	private Double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, String address, Long phone, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.phone = phone;
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", phone=" + phone
				+ ", salary=" + salary + "]";
	}
	
}
