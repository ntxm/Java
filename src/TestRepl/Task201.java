package TestRepl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task201 {

	public static void main(String[] args) {
		
		
		HashSet<String> numbers = new HashSet<>();
		numbers.add("first");
		numbers.add("second");
		numbers.add("third");
		numbers.add("fourth");
		numbers.add("fifth");
		
		for(String n: numbers) {
			System.out.println(n);
		}
		

	}

}
