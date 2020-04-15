package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanCollection.xml");
		JavaCollection javaCollection = (JavaCollection)context.getBean("javaCollection");
		javaCollection.getAddressList();
	}

}
