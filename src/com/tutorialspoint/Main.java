package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		AbstractApplicationContext content = new ClassPathXmlApplicationContext("Beans.xml");   //use ClassPathXmlApplicationContext
//		ApplicationContext content = new FileSystemXmlApplicationContext("D:/codesoftwares/JAVA/project/Spring/src/Beans.xml");	//use FileSystemXmlApplicationContext
		
//		HelloWorld helloWorld = (HelloWorld) content.getBean("HelloWorld");
//		helloWorld.setMessage("1");
//		helloWorld.getMessage();
//		helloWorld.getMessage1();
//		content.registerShutdownHook();
		
//		HelloWorld helloWorld2 = (HelloWorld) content.getBean("HelloWorld");
//		helloWorld2.getMessage();
		
//		HelloIndia helloIndia = (HelloIndia) content.getBean("HelloIndia");
//		helloIndia.getMessage();
//		helloIndia.getMessage1();
//		helloIndia.getMessage2();
		
		ApplicationContext content = new FileSystemXmlApplicationContext("D:/codesoftwares/JAVA/project/Spring/src/Beans1.xml");
		
		TextEditor textEditor = (TextEditor)content.getBean("textEditor");
		textEditor.spellCheck();
	}
}
