package com.ltts;

import java.util.Scanner;

class InvalidAgeRangeException extends Exception{  
	InvalidAgeRangeException(String s){  
	  super(s);  
	 }  
	} 
	class CustomException{  
	  
	   static void validate(int age)throws InvalidAgeRangeException{  
	     if(age<19)  
	      throw new InvalidAgeRangeException("not eligible");  
	     else  
	      System.out.println("Player age :"+age);  
	   }  
	     
	   public static void main(String args[]){  
		    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter player name");
		    String Name = myObj.nextLine();  // Read user input
		    System.out.println("Enter player age");
		    int age = myObj.nextInt();
		    System.out.println("Player name: "+ Name);
	      try{  
	      validate(age);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      //System.out.println("rest of the code...");  
	  }  
	}  