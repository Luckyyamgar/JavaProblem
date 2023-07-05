package assignmentQuastion;

import java.util.Scanner;

//Write a Java program that reads an integer and check whether it is negative, zero, or positive
public class Program4 {
public static void main(String[] args) {
	System.out.println(" enter the user value");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
	if(num>0) {
		System.out.println("number is positive");
	}
	else if(num<0) {
		System.out.println("number is negative");
	}
	else if(num==0) {
		System.out.println("number is zero");
	}
}
}
