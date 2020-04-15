package com.tutorialspoint;

public class HelloIndia {
	private String message;
	private String message1;
	private	String message2;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println(message);
	}
	
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public void getMessage1() {
		System.out.println(message1);
	}
	
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	public void getMessage2() {
		System.out.println(message2);
	}
	
	public void init() {
		System.out.println("inited!");
	}
	
	public void destroy() {
		System.out.println("destroyed!");
	}
}
