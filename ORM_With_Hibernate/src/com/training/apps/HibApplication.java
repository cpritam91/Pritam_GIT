package com.training.apps;

import org.hibernate.*;

import com.training.daos.DoctorDAO;
import com.training.entity.Address;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

@SuppressWarnings("unused")
public class HibApplication {

	public static void main(String[] args) {
		
		DoctorDAO ddao = new DoctorDAO();
		
		Address cli = new Address("411","Sector 21A","Gurgaon");
		Address res = new Address("1/41","Behala","Kolkata");
		Doctor doc = new Doctor(103, "Dr. Pritam", 7867653332L,res,cli);
		
		System.out.println(ddao.update(doc));
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
