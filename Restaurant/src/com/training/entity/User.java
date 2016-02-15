package com.training.entity;

public class User {

	private Integer empId;
	private String password;
	private String role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer empId, String password, String role) {
		super();
		this.empId = empId;
		this.password = password;
		this.role = role;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [empId=" + empId + ", password=" + password + ", role=" + role + "]";
	}	
}
