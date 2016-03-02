package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private long customerId;
	private String customerName;
	private String email;
	private long handPhone;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String customerName, String email, long handPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.handPhone = handPhone;
		
		log.info("Parameterized Constructor Called");
	}
	public long getCustomerId() {

		log.info("Getter for customerId Called");
		return customerId;
	}
	public void setCustomerId(long customerId) {
		log.info("Setter for customerId Called");
		this.customerId = customerId;
	}
	public String getCustomerName() {
		log.info("Getter for customerName Called");
		return customerName;
	}
	public void setCustomerName(String customerName) {
		log.info("Setter for customerName Called");
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", handPhone=" + handPhone + "]";
	}
	
	
}
