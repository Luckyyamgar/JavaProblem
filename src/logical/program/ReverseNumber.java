package logical.program;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
//	Scanner scanner=new Scanner(System.in);
//	System.out.println("please enter number");
//	
//	int num=scanner.nextInt();
	
	//using sumAlgorithim
	int num=7873;
	int res=0;
	
	while(num!=0) {
		res=res*10 + num%10;
		num=num/10;
	}
	System.out.println("revers number:"+res);
	System.out.println("________________________________________________");
//second method Strinbuffer
	int reverse=6789;
	StringBuffer str=new StringBuffer(String.valueOf(reverse));
	       StringBuffer newvalue = str.reverse();
	       System.out.println("Using Stringbuffer:"+newvalue);
	       
	       System.out.println("_________________________________________");
	       
//Using String builder
	       int number=764680;
	       StringBuilder builder=new StringBuilder();
	       builder.append(number);
	     StringBuilder rev = builder.reverse();
	     System.out.println(rev);

}
}
