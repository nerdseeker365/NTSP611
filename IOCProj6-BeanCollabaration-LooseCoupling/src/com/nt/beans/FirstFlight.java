package com.nt.beans;

public class FirstFlight implements Courier {
	
	static {
		System.out.println("FirstFlight:static block");
	}
	
	
	public FirstFlight() {
		System.out.println("FirstFlight:0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver(-)");
		return  oid+ " order id  order products  about deliver(First Flight)";
	}

}
