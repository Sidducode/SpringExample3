package com.employeelist.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/employeelist/entity/config1.xml");
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);

	}

}
