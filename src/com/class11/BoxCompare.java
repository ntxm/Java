package com.class11;

import java.util.Scanner;

public class BoxCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a1, a2, a3, b1, b2, b3;
		int sumBox1 = 0;
		int sumBox2 = 0;
		
		//System.out.println("1st box:");
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		a3 = scan.nextInt();
		
		//System.out.println("2st box:");
		b1 = scan.nextInt();
		b2 = scan.nextInt();
		b3 = scan.nextInt();
		
		sumBox1 = a1 + a2 + a3;
		sumBox2 = b1 + b2 + b3;
		
		if(sumBox1 == sumBox2) {
			
			if(a1 > b1  || a1 > b2 || a1 > b3 || a2 > b1 || a2 > b2 ||
			 a2 > b3 || a3 > b1 || a3 > b2 || a3 > b3) {
				System.out.println("Incomparable");
			}else{
				System.out.println("Box 1 = Box 2");
			}
			
		}else if(sumBox1 > sumBox2) {
			System.out.println("Box 1 > Box 2");
		}else {
			System.out.println("Box 1 < Box 2");
		}
		
		
		

	}

}
