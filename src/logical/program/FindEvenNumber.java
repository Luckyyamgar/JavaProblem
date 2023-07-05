package logical.program;

public class FindEvenNumber {
	public static void main(String[] Mhaku) {
		// find even number

		int i;
		for (i = 0; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println("even nuber:"+i);
			} else {
				 System.out.println("odd number:"+i);
			}
		}
		System.out.println("____________________________________");
		// find odd number

		for (int k = 0; k <= 20; k++) {
			if(k % 2 != 0) {
				System.out.println(k);

			}
		}
	}
}