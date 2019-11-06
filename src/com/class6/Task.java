package com.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner checkSale = new Scanner(System.in);
		
		boolean ifSale = true;
		double price;
		double salesPrice = 0;
		double discount = 0;
		
		System.out.println("Enter the price");
		price = checkSale.nextDouble();
		
	
		if( ifSale) {
			if(price < 20) {
				salesPrice = price - (price * 0.1);
				discount = 10;
			
			}else if(price >= 20 && price <100) {
				salesPrice = price - (price * 0.2);
				discount = 20;
				
			}else if(price >= 100 && price < 500) {
				salesPrice = price - (price * 0.3);
				discount = 30;

			}else if(price >= 500) {
				salesPrice = price - (price * 0.5);
				discount = 50;
			}
		}else {
			System.out.println("I'm not shopping");
		}
		System.out.println("After discount " + discount +  "% the price of the item reduce from " + price +  " to " + salesPrice);;
	}

}
