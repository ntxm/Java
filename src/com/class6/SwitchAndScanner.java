package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender: F or M");
		char gender = scan.next().charAt(0);
		String userGender;
		switch(gender) {
		case 'M':
			userGender = "Male";
			break;
		
		case 'F':
			userGender = "Female";
			break;
			
		default:
			userGender = "Unknown";
			break;
			
		}
		System.out.println(userGender);
	}
	

}
