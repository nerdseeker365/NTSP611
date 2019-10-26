package com.nt.beans;

public class BlueDart {
	static {
		System.out.println("BlueDart:static block");
	}
	
	public BlueDart() {
        System.out.println("BlueDart.0-param constructor");		
	}
	
	public   String  deliver(int oid) {
		System.out.println("BlueDart.deliver(-)");
		return  oid+ " order id  order products  about deliver(BlueDart)";
	}

}
