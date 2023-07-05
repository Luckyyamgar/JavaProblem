package statics.program;

class Helper {

	// Static method
	public  int sum(int a, int b) {
		// Simply returning the sum
		return a + b;
	}
}

// Class 2
public class Staticpro {

	// Main driver method
	public static void main(String[] args) {
		// Custom values for integer
		// to be summed up
		int n = 3, m = 6;

		// Calling the static method of above class
		// and storing sum in integer variable
		//int s = Helper.sum(n, m);
           Helper s1=new Helper();
          int sto = s1.sum(n, m);
          System.out.println(sto);
		// Print and display the sum
		//System.out.print("sum is = " + s);
	}
}
