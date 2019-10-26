package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	
	static {
		System.out.println("Flipkart.static block");
	}
	
	public Flipkart(Courier courier) {
	  System.out.println("Flipkart:1-param constructor");
		this.courier = courier;
	}

	public  String  shopping(String [] items, float prices[]) {
		System.out.println("Flipkart.shopping(-,-)");
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		//generate bill Amount
		for(float price:prices)
			billAmt=billAmt+price;
		//generate order id
		oid= new Random().nextInt(100000);
		//deliver products
		msg=courier.deliver(oid);
		return  Arrays.toString(items)+" having prices"+Arrays.toString(prices)+"  are purchased having bill Amt :: "+billAmt+" -->"+msg;
	}
	

	

}
