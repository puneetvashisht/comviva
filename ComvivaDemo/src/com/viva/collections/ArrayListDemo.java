package com.viva.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		String str[] = new String[4];
//		str[0] = "some string value";
//		str[1] = "sdgdsg";
		
		ArrayList list = new ArrayList();
		list.add("some string value");
		list.add("sdgdsg");
		list.add(34);
		
		for(Object o: list){
			System.out.println(o);
//			String s = (String) o;
//			System.out.println(s.charAt(0));
		}
		
		System.out.println(list);
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apples");
		fruits.add("Mango");
		fruits.add("Banana");
		
		System.out.println(fruits.get(0));
		
		

	}

}
