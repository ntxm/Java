package com.class27;

public class FinalKeyword {
	
	public final String str = "Hello";

	public static void main(String[] args) {
		
		
	}
	
	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}


}

class FinalKeywordChild extends FinalKeyword {
	
	//final methods cannot be overriden, we will get CE public final void hello()
}
