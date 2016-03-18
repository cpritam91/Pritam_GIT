package com.training.apps;

import java.util.Date;
import java.sql.Timestamp;
import org.hibernate.*;

import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class InheritenceApplication {

	public static void main(String[] args) {
		
		SessionFactory factory = HiberUtils.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//Patient patient = new InPatient("Pritam",23,303,new Timestamp(new Date().getTime()));
		
		//System.out.println(patient);
		//session.save(patient);
		
		InPatient pat = (InPatient)session.get(InPatient.class, "Pritam");
		System.out.println(pat);
		tx.commit();
		session.close();

	}

}
