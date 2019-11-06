package com.class5;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		Scanner checkHeight = new Scanner(System.in);
		System.out.println("Please, enter yuor height:");
		int height = checkHeight.nextInt();
		
		if(height < 5) {
			System.out.println("Short");
		}else if(height == 5 || height == 6) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}

	}

}
