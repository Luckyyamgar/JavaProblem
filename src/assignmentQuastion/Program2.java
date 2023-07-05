package assignmentQuastion;

import java.util.Scanner;

//Take 10 integer inputs from user and store them in an array and print them on screen
public class Program2 {
public static void main(String[] args) {
	String[] a = new String[10];
	// System.out.println("Enter first Integer in user");
	 for(int i=0; i<10; i++) {
			Scanner sc =new Scanner(System.in);
			 System.out.println("Enter user input ");
			 String myInput = sc.nextLine();
			 a[i] = myInput;
			 
	 }
	for(int i=0; i<10; i++) {
		System.out.print(a[i]);
}
	}
	
}
