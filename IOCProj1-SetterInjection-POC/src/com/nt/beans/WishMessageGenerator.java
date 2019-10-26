//Target class As POJO class/component class
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//Attribute/Filed/Property
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator: static block");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param constructor");
	}
	
	//setter method for setter Injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date=date;
	}
	
	//write b.logic in B.method
	public   String  generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage(-)");
		int hour=0;
		//get current hour of the day
		hour=date.getHours();  //24 hrs format
		//generate wish Message
		if(hour<12)
			 return "Good Morning::"+user;
		else if(hour<17)
			return "Good AfterNoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
		
	}//method
}//class
