package assignmentQuastion_exception;

import java.util.Scanner;

/*1. Using Exception Handling 
build a program to provide the input String from user and parse it to integer, if it is not a number 
it will throw 
number format exception Catch it and print "Entered input is not a valid format for an integer."
or else print the square of that number.

Enter an integer: 13
The square value is 169
The work has been done successfully

Sample input and output 2:
Enter an integer: Rajesh
Entered input is not a valid format for an integer.*/


public class Program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter user integer");
	    String input = sc.nextLine();
	   // int a = Integer.parseInt(input);
	  try { int a = Integer.parseInt(input);
	    System.out.println(a*a);
	    System.out.println("The work has been done");
	  } catch(NumberFormatException er){
		 // System.out.println(er);
		  System.out.println("Entered input is not a valid format for an integer");
		  
	  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
