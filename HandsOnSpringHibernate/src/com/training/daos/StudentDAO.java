package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.domains.Student;
import com.training.ifaces.DAO;

public class StudentDAO extends HibernateDaoSupport implements DAO<Student> {

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Serializable add(Student t) {
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Student find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable update(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
