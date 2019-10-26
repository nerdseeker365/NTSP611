package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.demo.Test;

public class NewInstanceDemo {
	public static void main(String[] args) {
		  Class c1=null,c2=null;
		  Object obj1=null,obj2,obj3=null,obj4=null;
		  Constructor cons[]=null,cons1[]=null;
		  try {
		//Load java class dynamucally at runtime
		  c1=Class.forName(args[0]);
		  //create object
		  obj1=c1.newInstance();
		  System.out.println(obj1.toString());
		  System.out.println("................................");
		  
		  c2=Class.forName(args[1]);
		  obj2=c2.newInstance();
		  System.out.println(obj2.toString());
		  Test t1=(Test)obj2;
			 t1.disp("raja");
		  System.out.println(".....................................");
		  
		  cons=c2.getDeclaredConstructors();
		  obj3=cons[0].newInstance(100);
		  System.out.println(obj3.toString());
		 System.out.println("............................");
		 
		 cons1=c1.getDeclaredConstructors();
		 obj4=cons1[5].newInstance(119,7,15);
		 System.out.println(obj4.toString());
		  
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		
		
	}

}
