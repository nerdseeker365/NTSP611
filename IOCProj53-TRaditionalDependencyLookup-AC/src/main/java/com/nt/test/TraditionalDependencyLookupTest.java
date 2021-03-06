package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Viechle;

public class TraditionalDependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
	   //create  IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Viechel class object
		viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.journey("hyd","goa");
		viechle.entertainment();
		viechle.soundHorn();
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}//main
}//class
