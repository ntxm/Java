package TestRepl;

import java.util.LinkedList;

/*
 * LinkList and Methods. 
Create a method the return an LinkList. without parameters. 
inside the method put the logic to add below values to the linklist and return the list. 

In Main Class. 
call the method and store it to a new Linklist. 

Print the values of LinkList. 


Output

John
Brian
Ryan
 */

public class Task192 {
	
	public LinkedList<String> linkListCreate() {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("John");
		list.add("Brian");
		list.add("Ryan");
	    return list;
	  }

	
	public static void main(String[] args) {
		
		Task192 obj = new Task192();
		
		LinkedList<String> newList = new LinkedList<>();
		
		newList.addAll(obj.linkListCreate());
		
		
		for(String l: newList) {
			System.out.println(l);
		}
		

	}

}
