package com.class5;

import java.util.Scanner;

public class isRainy {

	public static void main(String[] args) {
		Scanner rain = new Scanner(System.in);
		System.out.println("Is it rainy?");
		boolean isRainy = rain.nextBoolean();
		
		if(!isRainy) {
			System.out.println("In class");
		}else {
			System.out.println("Online");
		}
	}

}
