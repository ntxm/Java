package com.class10;

public class Task {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		//Second way
		
		char[] grades2 = new char[6];
		grades2[0] = 'A';
		grades2[1] = 'B';
		grades2[2] = 'C';
		grades2[3] = 'D';
		grades2[4] = 'F';
		grades2[5] = 'E';
		
		System.out.println(grades[1]);
		int a = 2;
		System.out.println(grades[a]);
		
		
		//Task2
		
		String[] names = {"Ivanna", "Ilya", "Natalie", "Ak", "Fatma"};
		System.out.println("My name is " + names[2] + "!");
		
		//second way
		String[] names2 = new String[5];
		names2[0] = "Ivanna";
		names2[1] = "Ilya";
		names2[2] = "Natalie";
		names2[3] = "AK";
		names2[4] = "Fatma";
		
		System.out.println("My name is " + names2[2]);
	

	
	// task3
	
	String[] words = {"Java", "Saturday", "Day", "coding", "is"};
	System.out.println(words[1] + " " + words[4] + " " + words[0] + " " 
	+ words[3] + " " + words[2]);
	
	
	//
	
	String[] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
	
	int size = animals.length;
	System.out.println(size);
	for(int i = 0; i < size ; i++) {
		System.out.print(animals[i] + " ");
	}
	
	System.out.println(" ");
	//create array to store 5 doubles, print in 1 line
	
	double[] numbers = {10, 11, 12, 5, 7};
	int lengthOfNumbers = numbers.length;
	
	for(int j = 0; j < lengthOfNumbers; j++) {
		System.out.print(numbers[j]+ " ");
	}
	
	
	System.out.println("-------------------------------------------");
	//print all values fromm array
	//when value is Dof --> I love dogs
	
	
	String[] animals2 = {"Cat", "Dog", "Cow", "Snake", "Elephant"};

	for(int i = 0; i < animals2.length; i++) {
		if(animals2.equals("Dog")) {
			System.out.println("I love dogs");
			
		}else {
			System.out.println(animals[i]);
		}
		
		
		System.out.println("------------------");
		
		String[] countries = {"Russia", "Turkey", "USA", "Columbia"};
		for(int b = 0;  b < countries.length; b++) {
			
			if(countries[b].equals("Russia")) {
				System.out.println("Moscow");
			}else if(countries[b].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[b].equals("USA")) {
				System.out.println("Washington, DC");
			}else if(countries[b].equals("Columbia")) {
				System.out.println("Bogota");
			}
		}
		
	}
	
	
	
}
}