package com.studentsmap.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/studentsmap/entity/config2.xml");
		
		Student bean = (Student) context.getBean("students");
		System.out.println(bean);
	}
}
