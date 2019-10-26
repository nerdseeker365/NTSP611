package com.nt.demo;

public class Test {
	
	static {
		System.out.println("Test::static block");
	}
	
	public Test() {
		System.out.println("Test:0-param constructor");
	}
	
	public Test(int x) {
		System.out.println("Test:1-param constructor:::"+x);
	}
	
	public void disp(String name) {
		System.out.println("hell Mr::"+name);
	}
	
	

	@Override
	public String toString() {
		return "Test []";
	}
	
	

}
