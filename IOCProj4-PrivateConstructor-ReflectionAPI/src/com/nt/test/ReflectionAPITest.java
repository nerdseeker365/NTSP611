package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.demo.Demo;

public class ReflectionAPITest {

	public static void main(String[] args) {
		Class c=null;
		Constructor cons[]=null;
		Demo d1=null,d2=null;
		try {
			//Load the class
			c=Class.forName("com.nt.demo.Demo");
			//get All the constructor of the class
			cons=c.getDeclaredConstructors();
			//get Access to Prviate Constructor
			cons[0].setAccessible(true);
			//create object
			d1=(Demo)cons[0].newInstance();
			System.out.println(d1);
			System.out.println("..................................");
			//get Access Private Constructor
			cons[1].setAccessible(true);
			d2=(Demo)cons[1].newInstance(10,20);
			System.out.println(d2);
			
			
		}//try
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}//main
}//class
