package com.training.domains;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component("carRental")
public class CarRental {

	@NotEmpty
	private String name;
	
	@Max(9999999999L)
	@Min(1000000000L)
	private Long mobileNumber;
	@Email
	private String email;
	private String type;
	public CarRental() {
		super();
	}
	public CarRental(String name, Long mobileNumber, String email, String type) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", type=" + type
				+ "]";
	}
	
}
