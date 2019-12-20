package TestRepl;

import java.util.ArrayList;
import java.util.List;

public class Task189 {

	public static void main(String[] args) {
		/*
		 * Create an array list to type String. 
		 *Add these values below to your arraylist
		 *hi
		 *yo
		 *sup
		 *yolo
		 *boop
		 *
		 *Remove 1, 3, 5
		 *
		 *print remained values one by one in one line
		 *
		 *Output 
		 *
		 *yo yolo 
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("hi");
		list.add("yo");
		list.add("sup");
		list.add("yolo");
		list.add("boop");
		
		System.out.println(list);
		
		list.remove(0);
		list.remove(1);
		list.remove(2);
		System.out.println(list);
		
		for(String l: list ) {
			System.out.print(l + " ");
		}

	}

}
