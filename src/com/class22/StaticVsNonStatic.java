package com.class22;

public class StaticVsNonStatic {
	
	//template for a students 
	
	static String school = "Syntax";
	String name;
	char grade;
	
	//instance method, non static
	void getInfo() {
		System.out.println("My name is " + name + " and I am going to " + school 
							+ " my grade is " + grade);
	}
	
	
	
	//static method
	static void getInfo1() {
		System.out.println("I am attending classes at " + school);
		//System.out.println("My name is " + name);
		//Compiler error
		//You CANNOT access to NON static members within STATIC method
	}

}
