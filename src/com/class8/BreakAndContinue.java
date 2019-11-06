package com.class8;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Iam outside of the loop");
		
		
		//continue -> it will skip Current iteration
		
		for(int i = 1; i <= 5; i++) {
			if(i == 2 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Iam outside of the loop");

		
		System.out.println("---------------------------");
		//I want to print numbers from 1 to 20 except 5,6,7
		
		for(int i = 1; i <= 20; i++) {
			if(i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		//task1
		for(int i = 1; i <= 50; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		//task2
		Scanner scan = new Scanner(System.in);
		String askUser;
		
		for(int i = 1; i <= 10; i++) {
		
			System.out.println("Would you like to apply for credit card?");
			askUser = scan.nextLine();
			if(askUser.equalsIgnoreCase("Yes")) {
				break;
			}
			
		}
		System.out.println("Please click the link below");
		
		
		
		
		
	}

}
