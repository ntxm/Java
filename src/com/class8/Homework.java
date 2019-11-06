package com.class8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			 price = scan.nextInt();
		}while(price != 5);

		System.out.println("Enjoy your coffee");
	
	//way 2
		int price1;
		
		System.out.println("Please pay for your coffee");
		price1 = scan.nextInt();
		
		while(price1 != 5) {
			System.out.println("Please pay for your coffee");
			price1 = scan.nextInt();
		}
			System.out.println("Enjoy your coffee");
	
	
	
	
	
	}
	
	

}
