package com.class5;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner userInfo = new Scanner(System.in);

		System.out.println("Enter quiz points");
		int quiz = userInfo.nextInt();
		System.out.println("Enter mid term points");
		int mid = userInfo.nextInt();
		System.out.println("Enter final score");
		int finalScore = userInfo.nextInt();
		int totalScore = (quiz + mid + finalScore)/3;

		if (totalScore >= 90) {
			System.out.println("Your total scor is " + totalScore + " Grade A");
		} else if (totalScore >= 70 && totalScore < 90) {
			System.out.println("Your total scor is " + totalScore + " Grade B");
		} else if (totalScore >= 50 && totalScore < 70) {
			System.out.println("Your total scor is " + totalScore + " Grade C");
		} else if (totalScore < 50) {
			System.out.println("Your total scor is " + totalScore + " Grade F");
		}else {
			System.out.println("Unknown");
		}

		// Task2

	}

}
