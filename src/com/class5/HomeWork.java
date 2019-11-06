package com.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		boolean haveCreditCard = true;
		//int balance;
		
		Scanner checkBalance = new Scanner(System.in);
		
		if(haveCreditCard) {
			System.out.println("What is your balance?");
			int balance = checkBalance.nextInt();
			if(balance > 1000) {
			System.out.println("Please, pay off");
		}else {
			System.out.println("You can spend more");
		}
		}else {
			System.out.println("Would you like to apply for a credit card");
		}
	}

}
