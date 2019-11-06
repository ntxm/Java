package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
		int a = 2;
		
		if(a == 20) {
			System.out.println("Numbers is " + a);
		}else {
			System.err.println("Number was not 20 but is " +a);
		}

		// example 2
		// .contains
		
		String sentence = "It was raining";
		String sentence1 = "raining";
		System.err.println(sentence1.contains(sentence));
		System.out.println(sentence.contains("w"));
		
		
		
		
		
	}

}
