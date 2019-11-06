package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {

		/*
		 * check age, if age less than 16 --> to young to drive otherwise we will check
		 * if you are older than 18 --> you can get Driver License and if not, you can
		 * get a driver permit
		 */

		int age = 21;

		if (age < 16) {
			System.out.println("You are too young");
			int yearsBeforeEligibileToPermit = 16 - age;

			System.out.println("Please, wait " + yearsBeforeEligibileToPermit
					+ " year(s) before you will eligiblile to learner permit");

		} else {

			System.out.println("You are eligibile to drive");

			if (age < 18) {

				System.out.println("You can get a learner permit");

			} else {

				System.out.println("You can get a driver license");

			}
		}

		/*
		 * check if student completed the quiz if yes --> good job, if not --> not good
		 * if they completed, check score. If more then 90 -> you got an A if more than
		 * 80 -> you got a B anything else below -> you shoud study more
		 */

		boolean quizCompleted = true;
		int score = 88;

		if (quizCompleted) {
			
			System.out.println("Good Job!");
			
			if (score >= 90) {
				
				System.out.println("Your score is " + score);
				System.out.println("You got A.");
				
			} else if (score >= 80) {
				
				System.out.println("Your score is " + score);
				System.out.println("You got B.");
				
			} else {
				
				System.out.println("You failed the quiz. You should stydy more");
			}
		} else {
			
			System.out.println("Not good!!!");
		}

	}

}
