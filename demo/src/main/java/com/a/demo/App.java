package com.a.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=new AnnotationConfigApplicationContext(appconfig.class);
        Vechicle v=(Vechicle)c.getBean("bike");
        v.drive();
        System.out.println(v.getEmail());
    }
}
