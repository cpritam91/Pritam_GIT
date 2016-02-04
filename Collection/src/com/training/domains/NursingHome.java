package com.training.domains;

import java.util.*;

import com.training.utils.MyComparators;

public class NursingHome {

	//Creating Type Safe Ordered Collection
	private ArrayList<Doctor> doclist;
	
	public NursingHome() {
		
		doclist = new ArrayList<Doctor>();
		
	}
	
	public boolean addDoctor(Doctor doc) {
		
		boolean result = false;
		try {
			
		result = doclist.add(doc);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return result;
	}
	
	public void printDoctorList() {
		
		for(Doctor doc : doclist) {
			
			System.out.println(doc);
		}
	}
	
	public void displayDoctorsSortedList()	{
		
		Collections.sort(doclist);
		printDoctorList();
		
	}
	public void displayDoctorsSortedList(int key)	{
		
		MyComparators comp = new MyComparators();
		switch (key) {
		case 1:
			displayDoctorsSortedList();
			break;
		case 2:
			
			MyComparators.NameComparator comp1 = new MyComparators().new NameComparator();
			Collections.sort(doclist,comp1);
			printDoctorList();
			break;
		case 3:
			MyComparators.SpecializationComparator comp2 = comp.new SpecializationComparator();
			Collections.sort(doclist,comp2);
			printDoctorList();
			break;
		default:
			break;
		}
		
	}
	
}
