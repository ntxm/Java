package com.class13;

public class ReplaceMethod {

	public static void main(String[] args) {
		
		// .replace()
		String str = "Hello Dear Dan, how are you, Dan?";
		System.out.println(str.replace('h', 'z'));
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
		
		System.out.println("====regular expression====");
		
	}

}
