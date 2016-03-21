package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.domains.Student;
import com.training.ifaces.DAO;

public class StudentDAO extends HibernateDaoSupport implements DAO<Student> {


	@Override
	public Serializable add(Student t) {
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Student find(Serializable obj) {
		Student stu = getHibernateTemplate().get(Student.class, obj);
		return stu;
	}

	@Override
	public List<Student> findAll() {
		@SuppressWarnings("unchecked")
		List<Student> stuList = (List<Student>)getHibernateTemplate().find("from Student");
		return stuList;
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
