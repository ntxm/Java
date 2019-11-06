package com.class11;

import java.util.Scanner;

public class Task104 {
	public static void main(String[] args) {
		
		
			   Scanner inp = new Scanner(System.in);
			   System.out.print("In:");
			   String word = inp.nextLine();
			   //write your code below
			  char[] x=word.toCharArray();
			            for(int i=0; i<x.length; i++) {
			                if(i%2==0) {
			                
			                System.out.print(x[i]);}
			            }
			        
			    }
			
		
		
		
		
	}

	


