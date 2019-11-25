package com.class25;

public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.salary = 70000;
		Employee.companyName = "Syntax";
		emp1.work();
		emp1.getPaid();
		
		ScrumTeam emp2 = new ScrumTeam();
		emp2.salary = 90000;
		
		emp2.work();
		emp2.getPaid();
		emp2.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		emp2.ceremonies = "Sprint Demo, Planning, Retro, Daily Standup";
		emp2.attendScrumMeetings();
		
		Developer dev = new Developer();
		dev.salary = 130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies = "Sprint Demo, Planning, Retro, Daily Standup";
		dev.employeeId = 101;
		//dev.employeeSsn not accessible
		
		Tester tester = new Tester();
		tester.salary = 85000;
		tester.work();
		tester.getPaid();
		tester.test();
		tester.artifacts = "Sprint Backlog, BurnDown Chat";
		tester.ceremonies = "Sprint Demo, Planning, Daily Standup";
		tester.attendScrumMeetings();
		
	}

}
