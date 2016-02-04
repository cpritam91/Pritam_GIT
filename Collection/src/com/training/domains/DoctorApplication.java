package com.training.domains;

import java.util.Scanner;

public class DoctorApplication {
	
	public static void main(String[] args)
	{
		NursingHome nh = new NursingHome();
		
		Doctor d2 = new Doctor(101,"Dr. Saikat Ghosh", "Orthopaedic");
		Doctor d3 = new Doctor(102,"Dr. D. N. Guha Majumdar", "Gastroenterologist");
		Doctor d1 = new Doctor(103,"Dr. Suman Chakraborty", "General Physician");
		Doctor d4 = new Doctor(104,"Dr. Sunip Banerjee", "Cardiologist");
		
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
		
	}

}
