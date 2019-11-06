package com.class10;

import java.util.Scanner;

public class Task78 {

	public static void main(String[] args) {
		
		
		int i, j, k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int[] arrayInt = new int[5]; 
		
		for(i = 0; i < 5; i++){
		  System.out.println("Enter the value " + i);
		  arrayInt[i] = scan.nextInt();
		  
		}
		System.out.println(arrayInt.length);
	
		for(j = arrayInt.length -1; j >= 0; j--) {
			
			
			System.out.println(arrayInt[j]);
		}
		
	
	  char[] array1 = new char[0];
	}

	}


