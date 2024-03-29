package assignmentQuastion_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. Using Exception Handling: Try-catch Use multiple catch block 	
//
//
//Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to 
//enter a particular index and prints the element at that index. Index starts from zero.
//
//This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms 
//to handle this exception.
//
//Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the 
//index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed
//
//Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the 
//index of the array element you want to access 9 java.lang.ArrayIndexOutOfBoundsException
//
//Sample Input and Output 3: Enter the number of elements in the array 2 Enter the elements in the array 30 j 
//java.lang.NumberFormatException
public class Program3 {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter user input");
			int input = sc.nextInt();
			int[] arr = new int[input];

			System.out.println("Enter the element in array");

			for (int i = 0; i < input; i++) {
				arr[i] = sc.nextInt();

			}
			System.out.println("enter the arry index");

			int index = sc.nextInt();
			System.out.println("the arry element at index..." + index + "  " + arr[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException er) {
			er.printStackTrace();
			System.out.println(er.getMessage());
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
