package com.training.domains;

public class Doctor implements Comparable<Doctor> {

	private long doctorId;
	private String doctorName;
	private String specialization;
	
	
	public Doctor() {
		super();
	}


	public Doctor(long doctorId, String doctorName, String specialization) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
	}


	public long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	@Override
	public String toString() {
		String str = doctorId+"\t::\t"+doctorName+"\t::\t"+specialization;
		return str;
	}


	@Override
	public int compareTo(Doctor o) {

		if(doctorId < o.doctorId)
			return -1;
		if(doctorId > o.doctorId)
			return 1;
		return 0;
	}
	
	
	
}
