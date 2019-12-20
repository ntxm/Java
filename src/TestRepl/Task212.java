package TestRepl;

public class Task212 {

	public static void main(String[] args) {
		
		 int i = 0;
		 int [] array = {10,20,30};
		    
		    
		
		    	try {
		    		System.out.println(array[4]);
		    	}catch(ArrayIndexOutOfBoundsException ex){
		    		System.out.println("java.lang.ArrayIndexOutOfBoundsException: 4\n" + 
		    				"	at Main.main(Main.java:5)");
		    	
		    }
		    
		   System.out.println("next");
	}

}
