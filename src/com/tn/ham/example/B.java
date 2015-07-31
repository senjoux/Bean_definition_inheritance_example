package com.tn.ham.example;


/**
*
* @author Hamza
*/

import org.springframework.stereotype.Component;

@Component
public class B extends A{

	private String ch1="hello ned";
	private String ch3="hello uk";
		
	public void display_messages(){
		System.out.println(" Value of ch1 from A---> "+super.ch1);
		System.out.println(" Value of ch2 from A ---> "+super.ch2);
		
		System.out.println("Value of ch1 from B---> "+ch1);
		System.out.println("Value of ch2 from B---> "+ch2);
		System.out.println("Value of ch3 from B---> "+ch3);
	}
	
	
	
}
