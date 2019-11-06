package com.class9;

import java.util.Scanner;

public class Task6 {

	/*
	 * Write a program that reads a range of integers (start and end point) provided
	 * by user. Ad then from that range print sum of Odd and Even
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, i;
		int sumEven = 0;
		int sumOdd = 0;

		System.out.println("Enter the first number: ");
		a = scan.nextInt();

		System.out.println("Enter the second number: ");
		b = scan.nextInt();

		for (i = a; i <= b; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;

			} else {
				sumOdd = sumOdd + i;
			}

		}

		System.out.println("Even: " + sumEven);
		System.out.println("Odd: " + sumOdd);

	}

}
