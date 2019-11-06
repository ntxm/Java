package com.class4;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		/*nextInt(); --> for numbers
		 *nextLine(); --> for Strings
		 *nextDouble(); --> double
		 */	
		System.out.println("How old are you?");
		
			int number = scan.nextInt();
		
			System.out.println("Your age is: " + number);
			
			
			//example 2
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your name");
			String name = input.nextLine();
			System.out.println("Hello, " + name + "!");
			
			
			//Scanner 3
			
			Scanner checkPerson = new Scanner(System.in);
			System.out.println("Enter your name:");
			String firstName = checkPerson.nextLine();
			System.out.println("Enter your last name:");
			String lastName = checkPerson.nextLine();
			System.out.println("How old are you?");
			int age = checkPerson.nextInt();
			System.out.println("Where are you from?");
			String city = checkPerson.nextLine();
			
			System.out.println("Are you aggree the agreement?");
			boolean isAllowed = checkPerson.nextBoolean();
			
			System.out.println("Hello " + firstName + " " + lastName + "!");
			System.out.println("You are came from " + city + "and you are " + age + " years old.");
	}
	
	
}
