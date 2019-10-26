package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
	    WishMessageGenerator generator=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		// Get Target Bean class obj
		generator=(WishMessageGenerator)factory.getBean("wmg");
		//invoke  method
		System.out.println("Result is::"+generator.generateWishMessage("raja"));

	}//main
}//class
