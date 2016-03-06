package com.training.entities;

public class User {
	
	private Integer empId;
	private String role;
	private String userName;
	private String passWord;
	private String labCode;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer empId, String userName, String role, String passWord, String labCode) {
		super();
		this.role = role;
		this.labCode = labCode;
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLabCode() {
		return labCode;
	}

	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [role=" + role + ", userName=" + userName + ", passWord=" + passWord + ", labCode=" + labCode
				+ "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
		
}
