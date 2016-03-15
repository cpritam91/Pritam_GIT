package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ent")
@Lazy
@Scope("prototype")
public class Doctor {
	
	@Value("Rajesh Khanna")
	private String docName;
	@Value("7865567898")
	private long phoneNumber;
	@Autowired
	@Qualifier("inPat")
	private Patient patient;
	
	public Doctor(String docName, long phoneNumber, Patient patient) {
		super();
		this.docName = docName;
		this.phoneNumber = phoneNumber;
		this.patient = patient;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", phoneNumber=" + phoneNumber + ", patient=" + patient + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("-----Init Called-----");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("-----Destroy Called-----");
	}
}
