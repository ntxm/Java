package TestRepl;

import java.util.Scanner;

class BranchingStatements {
//    public static void main(String[] args) {
//        // put your code here
//
//        Scanner scan = new Scanner(System.in);
//
//        boolean isValue = scan.hasNext();
//        int i = 0;
//        do {
//        	
//            int num = scan.nextInt();
//            if(num % 2 == 0){
//                System.out.println("even");
//            }else {
//                System.out.println("odd");
//            }
//            i++;
//        } while (isValue == true && i < 5);
//        
    
	
	public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        boolean isValue = scan.hasNext();
        int num;
        do {
        	
            num = scan.nextInt();
            if(num % 2 == 0 && num != 0){
                System.out.println("even");
            }else if (num % 2 != 0) {
                System.out.println("odd");
            }
            
            
        } while (num != 0);
      

    }
}
