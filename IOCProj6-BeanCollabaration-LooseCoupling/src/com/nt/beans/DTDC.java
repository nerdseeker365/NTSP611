package com.nt.beans;

public class DTDC  implements Courier{
	 static {
		 System.out.println("DTDC:static block");
	 }
	 
	 public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}
	
	public   String  deliver(int oid) {
		System.out.println("DTDC.deliver(-)");
		return  oid+ " order id  order products  about deliver(DTDC)";
	}

}
