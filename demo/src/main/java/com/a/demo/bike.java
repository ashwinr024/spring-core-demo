package com.a.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class bike implements Vechicle {

	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("bike drive");
		
	}
	
	

}
