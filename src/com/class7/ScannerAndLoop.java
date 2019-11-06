package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		while(i <= 5) {
		
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		
		
		System.out.println("Good aftenoon " + name);
		
		i++;
		}
		
	}

}
