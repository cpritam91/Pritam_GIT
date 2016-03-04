package com.training.entities;

public class Doctor {

	private Integer doctorCode;
	private String doctorName;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer doctorCode, String doctorName) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
	}
	public Integer getDoctorCode() {
		return doctorCode;
	}
	public void setDoctorCode(Integer doctorCode) {
		this.doctorCode = doctorCode;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
}
