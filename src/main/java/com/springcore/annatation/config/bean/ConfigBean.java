package com.springcore.annatation.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

	/*
	 * creating a Emp class object 
	 * 
	 */
	
	@Bean
	public Emp getEmp() {
		
		Emp emp = new Emp( getSamosa() );
		
		return emp;
	}
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
}
