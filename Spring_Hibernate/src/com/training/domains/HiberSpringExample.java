package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.ifaces.DAO;

public class HiberSpringExample extends HibernateDaoSupport implements DAO<Doctor>{

	
	@Override
	public Serializable add(Doctor doc) {
		Serializable key = getHibernateTemplate().save(doc);
		return key;
	}

	@Override
	public Doctor find(Serializable obj) {
		Doctor doc = getHibernateTemplate().get(Doctor.class, obj);
		return doc;
	}

	@Override
	public List findAll() {
		List<Doctor> docList = (List<Doctor>)getHibernateTemplate().find("from Doctor");
		return null;
	}

	@Override
	public Serializable update(Doctor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
