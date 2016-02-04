package com.training.domains;

public class Patient implements Comparable<Patient>{
	
	private int patientID;
	private String patientName;
	private long patientPhNo;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientID, String patientName, long patientPhNo) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientPhNo = patientPhNo;
	}
	
	
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientPhNo() {
		return patientPhNo;
	}
	public void setPatientPhNo(long patientPhNo) {
		this.patientPhNo = patientPhNo;
	}
	@Override
	public String toString() {
		return patientID+"\t::\t"+patientName+"\t::\t"+patientPhNo;
	}
	
	@Override
	public int compareTo(Patient o) {
		if(patientID < o.patientID)
			return -1;
		if(patientID > o.patientID)
			return 1;
		return 0;
	}

	
	
	
}
