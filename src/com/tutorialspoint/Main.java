package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext content = new ClassPathXmlApplicationContext("Beans.xml");   //use ClassPathXmlApplicationContext
		ApplicationContext content = new FileSystemXmlApplicationContext("D:/codesoftwares/JAVA/project/Spring/src/Beans.xml");	//use FileSystemXmlApplicationContext
		HelloWorld helloWorld = (HelloWorld) content.getBean("HelloWorld");
		helloWorld.getMessage();
	}
}
