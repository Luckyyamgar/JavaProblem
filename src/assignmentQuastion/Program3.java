package assignmentQuastion;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Program3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
            System.out.println("Enter the value of user ");
            int m = sc.nextInt();
            if(m%2==0) {
            	System.out.println("number is even");
            }else {
            	System.out.println("Nuber is odd");
            }
	}

}
