package basicjav.aprogramfor;

public class Factorial {

	public static void main(String[] args) {
		// factorial Program
		int num = 5;
		int fact = 1;

		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}