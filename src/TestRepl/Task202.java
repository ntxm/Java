package TestRepl;

import java.util.HashSet;

/*
 * Set
Create a hashset contains below values. 
first
second
third
fourth 
fifth 

Create a logic to add the values of hashset to and array.

print the values of array one by one. 

Output:
Array elements: 
third 
fifth 
fourth 
first 
second
 */

public class Task202 {

	public static void main(String[] args) {
		
		
		HashSet<String> numbers = new HashSet<>();
		numbers.add("first");
		numbers.add("second");
		numbers.add("third");
		numbers.add("fourth");
		numbers.add("fifth");
		
		Object[] array = numbers.toArray();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
				
		

	}

}
