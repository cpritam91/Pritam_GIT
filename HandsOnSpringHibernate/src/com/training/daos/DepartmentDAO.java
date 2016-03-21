package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.domains.Department;
import com.training.ifaces.DAO;

public class DepartmentDAO extends HibernateDaoSupport implements DAO<Department> {

	@Override
	public Serializable add(Department t) {
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Department find(Serializable obj) {
		Department dept = getHibernateTemplate().get(Department.class, obj);
		return dept;
	}

	@Override
	public List<Department> findAll() {
		@SuppressWarnings("unchecked")
		List<Department> deptList = (List<Department>)getHibernateTemplate().find("from Department");
		return deptList;
	}

	@Override
	public Serializable update(Department t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
