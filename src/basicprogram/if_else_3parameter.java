package basicprogram;

public class if_else_3parameter {

	public static void main(String[] args) {
		// using 3 parameter used

		int a = 100;
		int b = 200;
		int c = 50;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greter than c");
			} else {
				System.out.println("c is greatter than a");
			}
		} else {
			if (b > c) {
				System.out.println("b is gretter than c");

			} else {
				System.out.println("c is gretter trhan b");
			}
		}

	}

}
