package com.class4;

import java.util.Scanner;

public class CheckScanner {

	public static void main(String[] args) {
		
		Scanner checkValue = new Scanner(System.in);
	    
	    System.out.println("Input the boolean value");
	    boolean check = checkValue.nextBoolean();
	    System.out.println("The value is " + check);
	}

}
