package com.class23;

public class Task {
	
	/*
	 * Write a program that will have a constructor: one with parameters and 
	 * second without any parameters. Create a separate 
	 * Test class where you will execute both of the constructors.
	 */
	
	static String role;
	public String name;
	public int group;
	
	
	//constructor1 without parameters
	Task(){
		System.out.println("Constructor withour parameter");
		
	}
	
	//constructor2 with parameters
	Task(String studentName, int studentGroup){
		name = studentName;
		group = studentGroup;
		System.out.println(studentName + " attended to group #" + group + "(" + role + ")" );

	}
	
	
	
	
	
	

}
