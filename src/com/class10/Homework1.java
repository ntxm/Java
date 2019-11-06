package com.class10;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		//Secret number 
		
		Scanner scan = new Scanner(System.in);
		int secretNumber, guessNumber;
		
		secretNumber = 12;
		
		
		
		do {
			System.out.println("Please, enter the number from 1 to 20: ");
			guessNumber = scan.nextInt();
			
			if(guessNumber < secretNumber) {
				System.out.println("Too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Too large");
			}else {
				System.out.println("You got it!");
			}
		}while(guessNumber != secretNumber);

	}

}
