package com.training.domains;

import java.util.*;

public class DoctorApplication {
	
	public static void main(String[] args)
	{
		NursingHome nh = new NursingHome();
		
		Doctor d2 = new Doctor(101,"Dr. Saikat Ghosh", "Orthopaedic");
		Doctor d3 = new Doctor(102,"Dr. D. N. Guha Majumdar", "Gastroenterologist");
		Doctor d1 = new Doctor(103,"Dr. Suman Chakraborty", "General Physician");
		Doctor d4 = new Doctor(104,"Dr. Sunip Banerjee", "Cardiologist");
		
		
		Patient p1 = new Patient(301,"Rajesh",980000);
		Patient p2 = new Patient(302,"Mukesh",982311);
		Patient p3 = new Patient(303,"Rajnish",989876);
		Patient p4 = new Patient(302,"Mukesh",982311);
		
		TreeSet<Patient> patients = new TreeSet<Patient>(); //Requires Comparable/Comparator because Tree Set is ordered.
		//HashSet<Patient> patients = new HashSet<Patient>(); //Doesn't require Comparable/Comparator because it is not ordered.
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		boolean test = patients.add(p4); // to check for duplicate property
		
		d1.setPatients(patients);
		
		
		nh.addDoctor(d1);
		nh.addDoctor(d2);
		nh.addDoctor(d3);
		nh.addDoctor(d4);
		
		nh.printDoctorList();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Display List Sorted on 1->ID 2->Name 3->Specialization\nEnter Your Choice :");
		int ch = sc.nextInt();
		
		nh.displayDoctorsSortedList(ch);
		
		sc.close();
		System.out.println(test); // to check for duplicate property
	}

}
