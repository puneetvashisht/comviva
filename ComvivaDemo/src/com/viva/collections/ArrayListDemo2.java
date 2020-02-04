package com.viva.collections;

import java.util.ArrayList;


class Fruit{
	public Fruit(String name){
		this.name = name;
	}
	String name;
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Fruit other = (Fruit) obj;
		if (!this.name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Fruit> fruits = new ArrayList<>();
		Fruit f1 = new Fruit("Banana");
		
		fruits.add(new Fruit("Apples"));
		fruits.add(new Fruit("Mango"));
		fruits.add(f1);
		
		System.out.println(fruits);
		
		
		Fruit f2 = new Fruit("Banana");
		System.out.println(f1.equals(f2));
		
		System.out.println(fruits.contains(f2));

	}

}
