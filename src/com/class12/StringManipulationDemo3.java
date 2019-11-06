package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) {
		
		//This method checks whether a String is empty or not.
		//This method returns true if the given string
		// is empty else return false
		
		
		String str = "";
		System.out.println("Is string empty = "  + str.isEmpty());
		String str2 = "Hello";
		System.out.println("Is this string empty = " + str.isEmpty());
		
		
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.out.println(" ");
			System.err.println("This is empty String");
		}
		
		
		
		String sentence = "Each day has a promise to brighten up the day, \nBut first you must";
		
		System.out.println(sentence);
		
		//Concatenation
		
		String w1 = "Hello";
		String w2 = "World";
		
		System.out.println(w1 + " " + w2);
		System.out.println(w1.concat(" " + w2));
		
		// this method returns a copy of the string
		// with leading and trailing whitespace omitted
		
		
		String str6 = "  How are you?";
		System.out.println(str6.trim());
		
		
		// This method returns the characters located at the string's specified index
		
		String str7 = "We migth be done early today";
		System.out.println(str7.charAt(4));
		
		
		//This method returns the index within this string of the first occurance of the
		//specified character or -1 if the character does not occur
		
		String str8 = "We migth be done early";
		System.out.println(str8.indexOf("m"));
		System.out.println(str8.indexOf("m", 12)); // starts looking for from index 12 --> return -1
		
	}

}
