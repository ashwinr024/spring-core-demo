package com.a.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages="com.a.demo")
@Configuration
@PropertySource("classpath:sports.properties")
public class appconfig {
	
	
// manually creating bean
	
//	
//	public bike getbike()
//	{
//		return new bike();
//	}
//	
//	public car getcar()
//	{
//		return new car();
//	}
	

}
