package TestRepl;
import java.util.*;
import java.util.Map.Entry;

public class Task209test {

	 public static void display(Map<String,Integer> map){
	   if(map.isEmpty()){
	     System.out.println("map is empty");
	   }else{
	     Set<Entry<String,Integer>>f=map.entrySet();
	     for(Entry<String,Integer> fu : f){
	       System.out.println(fu.getKey()+fu.getValue());
	     }
	   }
	 }
	 
	 
	 public static void main(String[] args){
	   HashMap<String,Integer> map = new HashMap<>();
	   map.put("mango", 10);
	   map.put("apple", 30);
	   map.put("orange", 20);
	   display(map);
	  map.clear();
	   display(map);
	 }
}
