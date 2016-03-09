package com.training.domains;
import java.util.logging.Logger;
public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private Address address;
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public Customer() {
		super();
		log.info("Default Constructor Called");
	}

	public Customer(int customerId, String customerName, long phoneNumber,Address addr) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = addr;
		log.info("Parameterized Constructor Called");
	}

	public int getCustomerId() {
		log.info("Getter of Customer Id");
		return customerId;
		
	}

	public void setCustomerId(int customerId) {
		log.info("Setter of Customer Id");
		this.customerId = customerId;
	}

	public String getCustomerName() {
		log.info("Getter of Customer Name");
		return customerName;
	}

	public void setCustomerName(String customerName) {
		log.info("Setter of Customer Name");
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		log.info("Getter of Phone Number");
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		log.info("Setter of Phone Number");
		this.phoneNumber = phoneNumber;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address addr) {
		this.address = addr;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", addr=" + address + "]";
	}
	
}