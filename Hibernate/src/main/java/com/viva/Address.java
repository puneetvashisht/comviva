package com.viva;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	
	int houseNumber;
	String city;
	String country;
	public Address(int houseNumber, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", country=" + country + "]";
	}
	
	
	

}
