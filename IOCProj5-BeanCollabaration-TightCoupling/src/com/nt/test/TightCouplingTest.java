package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Flipkart;

public class TightCouplingTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fpkt=null;
		
		//Hold spring Bean cfg file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get target class object
		fpkt=factory.getBean("fkart",Flipkart.class);
		//invoke method
		System.out.println(fpkt.shopping(new String[] {"flag","sweets","kurta"}, new float[] {1200.0f,3000,10000}));
	}//main
}//class
