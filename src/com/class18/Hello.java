package com.class18;

public class Hello {

	void sayHello(String name) {
		
		System.out.println("Hello " + name);
	}
	
	
	public static void main(String[] args) {
		
		Hello obj = new Hello();
		obj.sayHello("Ntxm");
		obj.sayHello("Geg");
		obj.sayHelloDifferentLanguage("Russia");
		obj.isSnowing(false);
		

	}
	
	
	/*create a method that will say hello in different language based
	 * on the value that will be passed when user calls a method
	 */
	
	void sayHelloDifferentLanguage(String country) {
		
		
		
		switch(country.toLowerCase()) {
		
		case "usa":
			System.out.println("Hello");
			break;
		
		case "russia":
			System.out.println("Privet");
			break;
			
		case "mexico": 
			System.out.println("Hola");
			break;
		
		case "albania":
			System.out.println("Pershendetje");
			break;
			
		default:
			System.out.println("I don't know this country");
			
			
		}

	}

	
	//create a method that will check if it snowing
	//if snow --> stay at home, otherwise go for a walk
	
	void isSnowing(boolean isSnowing) {
		 
		
		if(isSnowing) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go for a walk");
		}
	}
}
