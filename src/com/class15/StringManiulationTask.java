package com.class15;

import java.util.Scanner;

public class StringManiulationTask {

	public static void main(String[] args) {
		
		//ask user to enter browser
		//based on the input we say
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the browser name");
		String browser = scan.nextLine();
		
		
		System.out.println(browser.toLowerCase());
		
		switch(browser.toLowerCase()) {
		
		case "firefox": 
			System.out.println("Execution be performed on " + browser);
			break;
			
		case "chrome": 
			System.out.println("Execution be performed on " + browser);
			break;
			
		case "ie": 
			System.out.println("Execution be performed on " + browser);
			break;
			
		case "safari": 
			System.out.println("Execution be performed on " + browser);
			break;
			
		default: 
			System.out.println("another one");
			break;
			
		
		}
		
		
		
		

	}

}
