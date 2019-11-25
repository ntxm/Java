package com.class24;

public class ThisWithConstructor {
	
	
	ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}
	
	
	ThisWithConstructor(String str){
		this(); // used to call current class constructor
		System.out.println("I am constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str, String str1){
		this(str); // MUST be a first statement
		System.out.println("I am constructor with 2 String parameters");
	}
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		//can we execute 2 constructor at the same time
		//yes - it can be achieved using this()
	}

}
