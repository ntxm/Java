package com.class37;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW2 {

	public static void main(String[] args) {
		
		Map<String, Double> empMap = new HashMap<>();
		
		empMap.put("Amit", 100000.00);
		empMap.put("Samit", 90000.00);
		empMap.put("Amitar",80000.00);
		empMap.put("Arianna",110000.00);
		
		Set<String> empSet = empMap.keySet();
		
		String maxEmpName = "";
		String empName;
		
		double maxSalary = 0;
		double salary  = 0;
		
		
		Iterator<String> it = empSet.iterator();
		
		while(it.hasNext()) {
			empName = it.next();
			salary = empMap.get(empName);
			if(salary > maxSalary) {
				maxSalary = salary;
				maxEmpName = empName;
			}
		}
		
		System.out.println(maxEmpName + " " + maxSalary);

	}
	
	

}
