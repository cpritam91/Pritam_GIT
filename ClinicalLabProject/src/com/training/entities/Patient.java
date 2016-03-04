package com.training.entities;

public class Patient {
	
	private Integer patientCode;
	private String patientName;
	private Integer age;
	private Long handPhone;
	private String email;
	private String gender;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer patientCode, String patientName, Integer age, Long handPhone, String email, String gender) {
		super();
		this.patientCode = patientCode;
		this.patientName = patientName;
		this.age = age;
		this.handPhone = handPhone;
		this.email = email;
		this.gender = gender;
	}
	public Integer getPatientCode() {
		return patientCode;
	}
	public void setPatientCode(Integer patientCode) {
		this.patientCode = patientCode;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(Long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
