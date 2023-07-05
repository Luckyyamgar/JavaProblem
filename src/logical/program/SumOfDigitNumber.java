package logical.program;

public class SumOfDigitNumber {

	public static void main(String[] args) {
		// sum of digit number
		int num = 12345;
		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;// % These are gives remender (Baki)
			num = num / 10; // / These are gives Quest
		}

		System.out.println("sum of digit number:"+sum);

	}

}
