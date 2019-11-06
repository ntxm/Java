package com.class9;

public class Triangle {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) { // 5 rows
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
				
			}
			System.out.println(" ");
		}
		
		System.out.println("------------------------------");
		
		//task2
		
		
		for(int a = 1; a <= 5; a++) { //5 rows
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int c = 1; c <= 4; c++ ) {
			for(int d = 4; d >= c; d-- ) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}

	}

}
