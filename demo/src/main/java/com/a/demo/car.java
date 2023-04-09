package com.a.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class car implements Vechicle {
    
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("car drive");

	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
