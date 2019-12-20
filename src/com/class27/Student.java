package com.class27;

public class Student {
	
	public void  study() {
		System.out.println("A am a student and I need to study");
	}
	
	private void doHomework() {
		System.out.println("I have exams and need to do homework");
	}
	
	protected void research() {
		System.out.println("Student need to do research");
	}
	
	void attendClasses() {
		System.out.println("Student needs to do attend classes");
	}
}

class SyntaxStudent extends Student {
	// @Override - we are not overriding
	// child class having it is own method doHomework()
	
	public void doHomework() {
		System.out.println("SS student have exams and need to do homework");
	}
	
	
	public void study() {
		System.out.println("A am a student at Syntax and I need to study a lot");
	}
	@Override
	public void research() {
		System.out.println("Syntax Student need to do research");
	}
	@Override
	void attendClasses() {
		System.out.println("Syntax Student needs to do attend ALL classes");
	}
	
	
}

class CollegeStudent extends Student {
	public void studentStatus() {
		System.out.println("A am a student at College");
	}
	
}

class SchoolStudent extends Student {
	
	public void studentStatus() {
		System.out.println("A am a student at School");
	}
	
}