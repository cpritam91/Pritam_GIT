package com.training.entity;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String plotNo;
	private String street;
	private String city;
	
	public Address() {
	}

	public Address(String plotNo, String street, String city) {
		super();
		this.plotNo = plotNo;
		this.street = street;
		this.city = city;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", street=" + street + ", city=" + city + "]";
	}
}
