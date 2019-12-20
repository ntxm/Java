package com.class27;
import java.util.Scanner;

class Main {
	
	
char revWord = ' ';
Scanner scan = new Scanner(System.in);
String word = scan.nextLine();

final char reverseString (String word){
  this.word = word;
  for(int i = word.length()-1; i >= 0; i-- ){
    
    revWord =  (char) (revWord + word.charAt(i));
  
  }
return revWord;
}

public static void main(String[] args){
  
  Main obj = new Main();
 obj.reverseString("hello");
 
 
  
}
  
}