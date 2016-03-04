package com.training.entities;

import java.util.*;

public class TestOrder {

	private Integer orderNo;
	private Date date;
	private Doctor doctor;
	private Patient patient;
	
	public TestOrder() {
		// TODO Auto-generated constructor stub
	}

	public TestOrder(Integer orderNo, Date date, Doctor doctor, Patient patient) {
		super();
		this.orderNo = orderNo;
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
