package com.class18;

public class Task {

	public static void main(String[] args) {
		
		Task obj = new Task();
		obj.compare(10, 20);
		obj.evenOrOdd(5);
		obj.isPalindrome("madam");

	}

	
	//Task1
	
	void compare(int a, int b) {
		if(a  > b) {
			System.out.println("A > B");
		}else if(a < b) {
			System.out.println("A < B");
		}else {
			System.out.println("A = B");
		}
	}
	
	//Task 2
	
	void evenOrOdd(int c) {
		if (c%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	//Task3 
	
	void isPalindrome(String word) {
		String rev = "";
		
		char[] arr = word.toCharArray();
		for(int i = arr.length-1; i >= 0; i--) {
			rev = rev + arr[i];
		}
		
		if(rev.equals(word)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}
	
}
