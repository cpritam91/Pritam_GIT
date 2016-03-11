package com.training.ifaces;

import java.util.List;

public interface DAO<T> {
	
	public int add(T t);
	
	public T find(int key);
	
	public List<T> findAll();
	
}
