package com.class8;

public class Task {

	
	
	public static void main(String[] args) {
		
		//Task 1
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
	
		System.out.println(" ");
		//Task2
		for(int a=100; a>=1; a--) {
			System.out.print(a + " ");
		}
		
		System.out.println(" ");
		System.out.println("***********************************************");
		//task3
		for(int i=20; i>=1; i--) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("***********************************************");
		//task4
		
		for(int i=20; i<=50; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("***********************************************");

		//task5
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		//next
		int sumAll = 0;
		for(int i = 0; i <= 20; i+=5) {
			sumAll = sumAll + i;
		}
		System.out.println(sumAll);
		
		
		//multyply task
		
		int total=2;
		for(int y = 1; y <= 3; y++) {
			total = total * y;
		}
			System.out.println(total);

		
			System.out.println("***********************************************");
	//task
			
			int sumOdd = 0; 
			int sumEven = 0;
			int i;
			
			for(i = 1; i <= 20; i++) {
				if(i%2 == 0) {
					 sumEven = sumEven + i;
				}else {
					sumOdd = sumOdd + i;
				}
			}
		System.out.println(sumOdd);
		System.out.println(sumEven);
		
		
		
		
	}

}
