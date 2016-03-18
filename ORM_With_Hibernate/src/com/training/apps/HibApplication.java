package com.training.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;

import com.training.daos.DoctorDAO;
import com.training.entity.Address;
import com.training.entity.ClinicalAssistant;
import com.training.entity.Doctor;
import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;
import java.util.Date;
import java.sql.Timestamp;

@SuppressWarnings("unused")
public class HibApplication {

	public static void main(String[] args) {
		
		DoctorDAO ddao = new DoctorDAO();
		
		Address cli = new Address("411","Sector 21A","Gurgaon");
		Address res = new Address("1/41","Behala","Kolkata");
		ClinicalAssistant ass = new ClinicalAssistant(101, "Rohit");
		
		Timestamp time = new Timestamp(new Date().getTime());
		Patient pat1 = new InPatient("Shubham", 22,202,time);
		Patient pat2 = new InPatient("Harshit", 24,303,time);
		
		Set<Patient> pSet = new HashSet<Patient>();
		pSet.add(pat1);
		pSet.add(pat2);
		
		Doctor doc = new Doctor(103, "Dr. Pritam", 7867653332L,res,cli,ass);
		
		doc.setPatientSet(pSet);
		
		ddao.find(103);
		//ddao.add(doc);
		
		//System.out.println(ddao.delete(103));
		//System.out.println(ddao.delete(doc.getDoctorCode()));
		
		
		/*SessionFactory factory = HiberUtils.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Address cli = new Address("411","Sector 21A","Gurgaon");
		Address res = new Address("1/41","Rabindranagar","Kolkata");
		
		Doctor doc = new Doctor(103, "Dr. Saikat Ghosh", 7867653332L,res,cli);
		
		session.save(doc); // It returns the primary key
	
		Doctor doc1 =(Doctor)session.get(Doctor.class, 103);  // Prints the queries in terminal

		System.out.println(doc1);
		
		tx.commit();
		factory.close();*/

	}

}
