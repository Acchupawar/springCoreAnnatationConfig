package com.springcore.annatation.config.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
		Emp emp = context.getBean(Emp.class);
		
		emp.comapy();
		
	}

}
