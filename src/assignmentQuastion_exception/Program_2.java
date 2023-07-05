package assignmentQuastion_exception;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the user iput ");
		int input = sc.nextInt();
		
	try {	int  [] ar=new int [input];
		System.out.println(" enter the element in array");
		for(int i=0;i<input;i++) {
			ar[i]=sc.nextInt();
			
		}
		System.out.println("Enter the value of arry index");
		int index = sc.nextInt();
		System.out.println(" value of arry index is "+ index +".... "+ar[index] );
		
	}catch(Exception e){
			//System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
