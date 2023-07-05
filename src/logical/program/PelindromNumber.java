package logical.program;

import java.util.Scanner;

public class PelindromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int num = sc.nextInt();
		int origian = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (origian == rev) {
			System.out.println(origian + "This is pelendrom number");

		} else {
			System.out.println(origian + ":This is Not Pelendrom number");
		}

	}
}