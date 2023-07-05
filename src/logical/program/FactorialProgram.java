package logical.program;
public class FactorialProgram {
	public static void main(String[] args) {
		int a = 7;
		int fact = 1;
		for (int i = a; i >= 1; i--) {

			fact = fact * i;

		}
		
		System.out.println(fact);

	}
}
