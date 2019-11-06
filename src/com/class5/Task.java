package com.class5;

public class Task {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”


Prompt the user to enter person heights in inches. Person should be classified as one of the following:
short (under 5 feet)
medium(5 to 6 feet)
tall (6 feet and over)
		 * 
		 */
		
		
		int day = 90;
		
		if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday");
		}else if(day == 6 || day == 7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
