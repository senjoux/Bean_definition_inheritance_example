package com.tn.ham.example;


/**
*
* @author Hamza
*/

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public abstract class A {

	protected String ch1="hello fr";
	protected String ch2="hello tn";
	
}
