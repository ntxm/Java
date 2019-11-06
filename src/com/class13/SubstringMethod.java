package com.class13;

public class SubstringMethod {

	public static void main(String[] args) {
		
		System.out.println("=====subString()====");
		//This method returns a new strings that is a substring of
		//this string
		String str = "Java is getting interesting";
		System.out.println(str.substring(15));
		System.out.println(str.substring(8, 15)); //more useful. 
		
		//Task 1
		
		String day = "Sunday";
		//char[] dayR = day.toCharArray();
		for(int i = day.length() - 1; i >= 0; i--) {
		System.out.print(day.charAt(i));
		}
		
		System.out.println("");
		
		
		
		
		//Task 2
		
		String str1 = "Rabbita";
		
		int middle = str1.length()/2;
		if(!str.isEmpty()) {
			if(str1.length()%2 != 0 && str1.length() >= 3) {
				
				System.out.println(str1.charAt(middle));
			}
		}

	}

}
