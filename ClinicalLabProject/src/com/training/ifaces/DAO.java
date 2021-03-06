package com.training.ifaces;

import java.util.List;

public interface DAO<T> {

	public int add(T t);
	public T find(Object key);
	public List<T> findAll();
	public int update(T t);
	public int delete(Object key);	
}