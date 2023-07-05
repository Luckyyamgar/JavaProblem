package assignmentQuastion_exception;

import java.util.Scanner;

/*2. Using Exception Handling: Try-catch 	

Write a program that takes as input the size of the array and the elements in the array.
The program then asks the user to enter a particular index and prints the element at that index.
This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the class name of the exception thrown. 

Sample Input and Output 1: 

I/PEnter the number of elements in the array 3 
Enter the elements  in the array 20 90 
Enter the index of the array element you want to access 2 
The array element at index 2 = 4 

O/P:
The array element successfully accessed
Sample Input and Output 2: 
Enter the number of elements in the array 3 
Enter the elements in the array 20 90 4 
Enter the index of the array element you want to access 6 

o/p:

java.lang.ArrayIndexOutOfBoundsException*/

public class Program2 {
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter user input");
			int in = sc.nextInt();

			int[] ar = new int[in];

			System.out.println("Enter the elements in the array: ");
			for (int i = 0; i < in; i++) {
				ar[i] = sc.nextInt();
			}
				

			System.out.println("Enter the index of the array element you want to access");

			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + ar[index]);
			System.out.println("The array element successfully accessed");

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
