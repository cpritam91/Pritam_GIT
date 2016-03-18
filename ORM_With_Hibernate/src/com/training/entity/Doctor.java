package com.training.entity;

import java.io.Serializable;
import java.util.Set;

public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int doctorCode; // Identifier Property
	private String doctorName;
	private long handPhone;
	private Address residence;
	private Address clinic;
	private ClinicalAssistant assistant;
	private Set<Patient> patientSet;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorCode, String doctorName, long handPhone, Address residence, Address clinic,ClinicalAssistant assistant) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.residence = residence;
		this.clinic = clinic;
		this.assistant = assistant;
	}
	
	

	public ClinicalAssistant getAssistant() {
		return assistant;
	}

	public void setAssistant(ClinicalAssistant assistant) {
		this.assistant = assistant;
	}

	public int getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	
	public Address getResidence() {
		return residence;
	}

	public void setResidence(Address residence) {
		this.residence = residence;
	}

	public Address getClinic() {
		return clinic;
	}

	public void setClinic(Address clinic) {
		this.clinic = clinic;
	}
	
	

	public Set<Patient> getPatientSet() {
		return patientSet;
	}

	public void setPatientSet(Set<Patient> patientSet) {
		this.patientSet = patientSet;
	}

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", residence=" + residence + ", clinic=" + clinic + ", assistant=" + assistant + ", patientSet="
				+ patientSet + "]";
	}
}
