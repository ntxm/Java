package com.class2;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String name = "Anna";
		//Display in a console Good morning Anna
		
		System.out.println("Good morning, " + name);
		
		String firstName = "Barbara";
		String city = "New York";
		long phoneNumber = 8124001010l;
		
		String text = "My phone number is ";
		
		System.out.println("My name is " + firstName);
		System.out.println("I live in city of " + city);
		System.out.println(text + phoneNumber);
		
		String fruit = "banana";
		char dollar = '$';
		double price = 1.99;
		
		System.out.println("The price of " + fruit + " is " + dollar + price);
		
		//task1
		double d1 = 10.5;
		double d2 = 2.99;
		double sum = d1 + d2;
		double sub = d1 - d2;
		double div = d1 / d2;
		double mul = d1 * d2;
		
		System.out.println("The sum of 2 numbers " + d1 + " and " + d2 + " is equl = " + sum);
		System.out.println("The sub of 2 numbers " + d1 + " and " + d2 + " is equl = " + sub);
		System.out.println("The div of 2 numbers " + d1 + " and " + d2 + " is equl = " + div);
		System.out.println("The mul of 2 numbers " + d1 + " and " + d2 + " is equl = " + mul);
		
		//task2
		double d3 = 3.9;
		double square = d3 * 1/2; 
		System.out.println("The square of the " + d3 + " = " + square);
		
		//task3
		int widthOfRectangle = 5;
		int heightOfRectangle = 8;
		int area = widthOfRectangle * heightOfRectangle;
		int perimeter = 2 * (widthOfRectangle + heightOfRectangle);
		String message = "The perimetr of a rectangle with width " + widthOfRectangle + 
				" and height " + heightOfRectangle + " is equal to " + perimeter;
		
		System.out.println(message);
 
		
		
	}
	
	

}
