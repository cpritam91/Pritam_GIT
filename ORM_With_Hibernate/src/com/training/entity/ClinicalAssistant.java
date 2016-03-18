package com.training.entity;

public class ClinicalAssistant {

	private int id;
	private String name;
	
	public ClinicalAssistant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClinicalAssistant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ClinicalAssistant [id=" + id + ", name=" + name + "]";
	}
	
	
}
