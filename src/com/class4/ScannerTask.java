package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		//task1
		Scanner loanCheck = new Scanner(System.in);
		System.out.println("What the amount of loan is needed?");
		double amount = loanCheck.nextDouble();
		
		if(amount < 200000) {
			System.out.println("Perfect!");
		}else {
			System.out.println("Rejected.");
		}

		
		//task2
		Scanner ageCheck = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = ageCheck.nextInt();
		
		if(age >= 18 ) {
			System.out.println("You are eligible for Driver License");
		}else {
			System.out.println("You can get a driver permit");
		}
		
		//task3
		Scanner temperatureConverter = new Scanner(System.in);
		System.out.println("Please, enter your City:");
		String city = temperatureConverter.nextLine();
		System.out.println("Enter temperature in Fahrenheit:");
		int temp = temperatureConverter.nextInt();
		//converter
		int tempInCelsius = (temp - 32) * 5/9;
		
		//Output result in Celsius
		System.out.println("The temperature in the " + city + " today: " + tempInCelsius + " Celsius.");
		
		//(F − 32) × 5/9 = 0°C

		
		
	}

}
