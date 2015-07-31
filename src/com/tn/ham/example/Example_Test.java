package com.tn.ham.example;


/**
*
* @author Hamza
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.tn.ham.example")
@Configuration
public class Example_Test {

	
	public static void main(String args[]){
	
			ApplicationContext context=new AnnotationConfigApplicationContext(Example_Test.class);
			B temp=context.getBean(B.class);
			temp.display_messages();
			
			
	}
}
