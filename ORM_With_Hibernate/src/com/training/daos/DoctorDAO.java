package com.training.daos;

import java.io.Serializable;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor> {

	private SessionFactory factory;
	private Session session;
	
	public DoctorDAO() {
		factory = HiberUtils.getFactory();
	}

	@Override
	public Serializable add(Doctor t) {
		session = factory.openSession();
		Transaction tx = session.beginTransaction();
		int key = (Integer)session.save(t);
		tx.commit();
		session.close();
		return key;
	}

	@Override
	public Doctor find(Serializable key) {
		session = factory.openSession();
		Doctor doc = (Doctor)session.get(Doctor.class, (Integer)key);
		System.out.println("\n\n"+doc+"\n\n");
		session.close();
		return doc;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> findAll() {
		session = factory.openSession();
		List<Doctor> docList = session.createQuery("from Doctor").list() ; //Here Doctor is the name of the class
		session.close();
		return docList;
	}

	@Override
	public Serializable update(Doctor t) {
		session = factory.openSession();
		
		try {
			Transaction tx = session.beginTransaction();
			Doctor doc =(Doctor)session.load(Doctor.class, t.getDoctorCode());
			
			doc.setDoctorName(t.getDoctorName());
			doc.setHandPhone(t.getHandPhone());
			doc.setResidence(t.getResidence());
			doc.setClinic(t.getClinic());
			
			session.update(doc);
			tx.commit();
			return t.getDoctorCode();
			
		} catch (HibernateException e) {
			
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean delete(Serializable obj) {
		session = factory.openSession();
		try {
			Transaction tx = session.beginTransaction();
			Doctor doc =(Doctor)session.load(Doctor.class, obj);
			session.delete(doc);
			tx.commit();
			return true;
			
		} catch (HibernateException e) {
			System.out.println("Hibernate Exception thrown for illegal delete!!");
			return false;
		} finally {
			session.close();
		}
	}

}
