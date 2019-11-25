package com.class22;

public class Human {
	
	//instance variables
	String name;
	String lastName;
	
	//static variables
	static int eyes = 2;
	static int nose = 1;
	static boolean brain = true;
	
	
	
	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.name = "John";
		human1.lastName = "Smith";
		
		//print statements
		System.out.println("Printing static variables");
		System.out.println(Human.eyes);
		System.out.println(human1.nose);
		System.out.println(brain);
		
		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Doe";
		
		//print statements
		System.out.println(human2.lastName);
		System.out.println(human1.lastName);
		
	}

}
