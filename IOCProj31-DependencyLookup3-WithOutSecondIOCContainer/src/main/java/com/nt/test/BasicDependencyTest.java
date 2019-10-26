package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.USVisa;

public class BasicDependencyTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory  factory=null;
		XmlBeanDefinitionReader reader=null;
		Person per=null;
		USVisa visa=null;
		//create IOC container for Dependency Lookup
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		  //get Target class object
			per=factory.getBean("per",Person.class);
			visa=factory.getBean("visa",USVisa.class);
			//invoke the methods
			per.eating();
			per.dancing();
			per.officeWork();
			per.travellingToUSA(visa);
	}//main
}//class
