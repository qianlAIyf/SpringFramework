package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorTest implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("BeforeInitialize: " + beanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("AfterInitialize: " + beanName);
		return bean;
	}
}
