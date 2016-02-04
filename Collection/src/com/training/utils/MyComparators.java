package com.training.utils;

import java.util.*;

import com.training.domains.Doctor;

public class MyComparators {

	//Inner Class
	public class NameComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			//String Class already implements Comparable
			//Doctor class is implemented. So we use getter method
			return (o1.getDoctorName()).compareTo(o2.getDoctorName());
		}
		
		
	}
	
	public class SpecializationComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			
			return (o1.getSpecialization()).compareTo(o2.getSpecialization());
		}
		
		
	}
	
	
}
