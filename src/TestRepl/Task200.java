package TestRepl;
/*
 * Create a Hashset.
Just add the values as

first
second
third
fourth 
fifth 

first print the all values

then remove "second"

then print the values

Then remove all the elements.

Then Print the values. 

output

[third, fifth, fourth, first, second]
[third, fifth, fourth, first]
[]
 */

import java.util.HashSet;
import java.util.Set;

public class Task200 {

	public static void main(String[] args) {
		
		
		Set<String> numbers = new HashSet<>();
		numbers.add("first");
		numbers.add("second");
		numbers.add("third");
		numbers.add("fourth");
		numbers.add("fifth");
		
		System.out.println(numbers);
		numbers.remove("second");
		System.out.println(numbers);
		

	}

}
