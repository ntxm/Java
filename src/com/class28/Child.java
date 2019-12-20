package com.class28;

class Child extends Parent {
	
	String name = "James";
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.callName();
		
	}
	
	public void callName() {
		
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}
	
	public void callingMethod() {
		callName(); //by default THIS is added -->
		//so, we are calling current class method
		super.callName();
	}
	
	
	
}
