package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private BlueDart bDart;
	
	static {
		System.out.println("Flipkart.static block");
	}
	
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}

	/*public Flipkart(BlueDart bDart) {
		System.out.println("Flipkart:: 1 -param constructor");
		this.bDart = bDart;
	}*/
	
	public void setBDart(BlueDart bDart) {
		System.out.println("Flipkart.setbDart(-)");
		this.bDart = bDart;
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
		msg=bDart.deliver(oid);
		return  Arrays.toString(items)+" having prices"+Arrays.toString(prices)+"  are purchased having bill Amt :: "+billAmt+" -->"+msg;
	}
	

	

}
