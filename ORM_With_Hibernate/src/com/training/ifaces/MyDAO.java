package com.training.ifaces;

import java.util.List;

public interface MyDAO<T> {
	
	public Object add(T t);
	public T find(Object obj);
	public List<T> findAll();
	public Object update(T t);
	public boolean delete(Object obj);
}
