package com.class7;

public class DoWhile {

	public static void main(String[] args) {
		
		int num = 1;
		while(num < 7) {
			System.out.println("Hello");
			num++;
		}

		int num1 = 1;
		
		do {
			System.out.println("Bye");
			num1++;
			
		}while(num1 < 7);
	
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	//print even numbers from 20 to 50 using do while
	
	int a = 20;
	do {
		if(a%2 == 0) {
			System.out.println(a);
			a+=2;
		}
	}while(a <= 50);
	
	
	
	
	
	
	}
	
	
	

}

