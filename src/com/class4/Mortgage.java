package com.class4;

public class Mortgage {

	public static void main(String[] args) {
		double mortgageRate = 3.9;
		int mortgagePrice = 210000;
		
		//check rate
		if(mortgageRate > 4.5) {
			// rate > 4.5
			System.out.println("High rate. Do not buy a house.");
			
		}else {
			
			//rate < 4.5 you can buy a house
			System.out.println("Standard rate. You can buy a house.");
			
				if(mortgagePrice > 200000) {
					
					System.out.println("Expensive house.You should take a loan.");
					
				}else {
					
					System.out.println("You can pay cash.");
				}
		
		}

	}

}
