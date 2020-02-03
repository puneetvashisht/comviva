package com.viva.oops;

public class Engine {
	
	int id;
	String model;
	public Engine(int id, String model) {
		super();
		this.id = id;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", model=" + model + "]";
	}
	
	

}
