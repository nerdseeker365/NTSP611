package com.nt.demo;

public class Demo {
	 private int a,b;
	private  Demo() {
		System.out.println("Demo: 0-param constructor (private)");
	}
	
	private Demo(int a,int b) {
		System.out.println("Demo: 2-param constructor (private)");
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}
	
	
	
	

}
