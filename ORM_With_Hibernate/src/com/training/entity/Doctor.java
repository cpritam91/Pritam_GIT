package com.training.entity;

import java.io.Serializable;

public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clinic == null) ? 0 : clinic.hashCode());
		result = prime * result + doctorCode;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + (int) (handPhone ^ (handPhone >>> 32));
		result = prime * result + ((residence == null) ? 0 : residence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (clinic == null) {
			if (other.clinic != null)
				return false;
		} else if (!clinic.equals(other.clinic))
			return false;
		if (doctorCode != other.doctorCode)
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (handPhone != other.handPhone)
			return false;
		if (residence == null) {
			if (other.residence != null)
				return false;
		} else if (!residence.equals(other.residence))
			return false;
		return true;
	}

	private int doctorCode; // Identifier Property
	private String doctorName;
	private long handPhone;
	private Address residence;
	private Address clinic;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorCode, String doctorName, long handPhone, Address residence, Address clinic) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.handPhone = handPhone;
		this.residence = residence;
		this.clinic = clinic;
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

	@Override
	public String toString() {
		return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", handPhone=" + handPhone
				+ ", residence=" + residence + ", clinic=" + clinic + "]";
	}
}
