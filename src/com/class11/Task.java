package com.class11;

public class Task {

	public static void main(String[] args) {
		
		String[] cars = {"BMW", "Jaguar", "Audi", "Ford", "Ferrari", "Honda"};
		
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Second way:")
		
		;
		int b = 0;
		do {
			System.out.println(cars[b]);
			b++;
		}while(b < cars.length);
		
		
		//Task 2
		
		int[] array = {2,5,8,9,11,4,22,5};
		
		int sum = 0;
		
		for(int j = 0; j < array.length; j++) {
			
			sum = sum + array[j];
			
		}
		System.out.println("Sum of elements = " + sum);

		//Task 3
		
		String[] countries = {"Belarus", "USA", "Italy", "Russia"};
	
	
		for(int k = 0; k < countries.length; k++) {
			
			if(countries[k].equals("Belarus")) {
				System.out.println("Minsk");
			}else if(countries[k].equals("USA")) {
				System.out.println("Washington, DC");
			}else if(countries[k].equals("Italy")) {
				System.out.println("Roma");
			}else if(countries[k].equals("Russia")) {
				System.out.println("Moscow");
			}else {
				System.out.println("UNKNOWN");
			}
		
		}
		
		//Second Way
	
	
	
	
	
	
	}
}
