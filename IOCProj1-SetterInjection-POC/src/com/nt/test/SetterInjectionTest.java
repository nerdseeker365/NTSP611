package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
	  BeanFactory factory=null;
	  Resource res=null;
	  WishMessageGenerator generator=null;
	  System.out.println("SetterInjectionTest:: start of main(-) method");
	  //Locate or Hold SpringBean cfg file 
	  //res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
	    //res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
	  res=new ClassPathResource("applicationContext.xml");
	   //create IOC container
	  factory=new XmlBeanFactory(res);
	  //get Tagret Bean class object
	  //Class<WishMessageGenerator> c=WishMessageGenerator.class;
	  generator=factory.getBean("wmg",WishMessageGenerator.class);
	  //generator=factory.getBean("wmg",c);
	  
	  //invoke the methods
	  System.out.println("Result:::"+generator.generateWishMessage("karan")); 
	  
	  System.out.println("SetterInjectionTest:: end of main(-) method");
	}

}
