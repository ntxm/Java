package com.class20;

public class Task {

	//Task 1 Create a method that will take 1 parameter as a String and return reversed String. 
	//Method should be visibly only within same package.
	
	protected String reverse(String originalWord) {
		
		String rev = ""; 
		
		for(int i = originalWord.length()-1; i >=0; i-- ) {
			rev = rev + originalWord.charAt(i);
			
		}
		
		System.out.println(rev);
		return rev;
	}

	
	// Task2 Create a method that will take a String and return whether String is palindrome or not. 
	// Method should be available to all classes within your projects.
	
	public String isPalindrome(String word) {
		String reverse = "";
		String result;
		
		for(int i = word.length()-1; i >=0; i--) {
			reverse = reverse + word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			result = "Palindrome";
			
		}else {
			result = "Nope, try again";
		}
		System.out.println(result);
		return result;	
	}
	
	//Task3 Create a method that will take a string and return an array of words from that string. 
	//Method should be available only within same class.
	
	//private String StringToArray(String original) {
	//String result = "";
	//String[] strArray = original.split(" ");
	
	//	for(int i = 0; i < strArray.length; i ++) {
			
	//	}
		
//	}

	
	

	
	public static void main(String[] args) {
		
		
		//Task1 ===> reversed word
		Task word1 = new Task();
		word1.reverse("Morning");
		
		//task2 ===> isPalindrome
		word1.isPalindrome("Bamboo");
	
		Task word2 = new Task();
		word2.isPalindrome("madam");

	}

}
