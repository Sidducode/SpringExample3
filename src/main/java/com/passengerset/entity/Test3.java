package com.passengerset.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/passengerset/entity/config3.xml");
		
		Passanger bean = (Passanger) context.getBean("passDetl");
          System.out.println(bean);
	}

}
