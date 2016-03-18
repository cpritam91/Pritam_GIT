package com.training.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class InPatient extends Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int wardNumber;
	private Timestamp date;
	
	public InPatient() {
		// TODO Auto-generated constructor stub
	}

	public InPatient(String name, int age, int wardNumber, Timestamp date) {
		super(name,age);
		this.wardNumber = wardNumber;
		this.date = date;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", date=" + date + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
}
