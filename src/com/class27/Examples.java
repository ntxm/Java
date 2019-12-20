package com.class27;

public class Examples {
	
	//thi is Overloading
	public String helloName(String str) {
		return str;
	}
	
	public String helloName (String str, String str2) {
		return str + " " + str2;
	}
	
	//This is Overriding method from line 6
	
	class smallExample extends Examples {
		
		public String helloName(String str) {
			
			return "Hello " + str;
		}
	}
	
	
	
	

}
