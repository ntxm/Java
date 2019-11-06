package com.class14;

public class Tasks {

	public static void main(String[] args) {
		
		//task1
		//Create a String that will hold a sentence. Write a program to get a new String without 
		//any spaces.

		String  str = "Today is String Manipulation Java class till 3pm";
		System.out.println(str.replace(" ", ""));
		
		
		//task2
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		String  str1 = "Today is String Manipulation ~~~ 2-nd Java class ~~~ from 10 a.m. to 3 p.m.";
		String str2 = str1.replaceAll("[^0-9]", "");
		System.out.println(str2);
		System.out.println(str2.length());
		
		//task3
		//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String str3 = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = str3.split("\\?");
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i].trim());
			count++;
		}
		System.out.println(count);
		
	}	

}
