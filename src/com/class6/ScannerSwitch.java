package com.class6;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		
		String country;
		String foodName = null; 
		String newFoodName;
		
		
		Scanner askUser = new Scanner(System.in);
		System.out.println("Where are you from? ");
		country = askUser.nextLine();
		
		switch(country) {
		
		case "Belarus":
			foodName = "Draniki";
			break;
		case "Ukraine":
			foodName = "Salo and borsch";
			break;
		case "USA":
			foodName = "Burger and french fries";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		default:
			System.out.println("I don't know about your food. Give me your favorite food");
			newFoodName = askUser.nextLine();
			break;
		}
		
		System.out.println("Your are from " + country + " and your favorite food " + foodName);
	}

}
