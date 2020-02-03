package com.viva;

public class Address {
	
	int houseNumber;
	String location;
	String city;
	
	
	public Address() {
		super();
	}
	public Address(int houseNumber, String location, String city) {
		super();
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", location=" + location + ", city=" + city + "]";
	}
	
	

}
