package com.viva;

public class A {
	
	B b;
	
	
	
//	public A(B b){
//		this.b = b;
//	}
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void execute() {
		
		b.execute();
		System.out.println("Execute method in A");
		
		
	}
	
	public void a1(){
		b.execute();
	}

}
