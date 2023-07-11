package Arry_all_program;

public class arry_2 {

	public static void main(String[] args) {
		// basic program arry_program {3,5,`6,1,9}

		int ar[] = { 3, 5, 6, 1, 9 };
		int searchnum = 9;
		boolean bflag = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == searchnum) {
				bflag = true;
				break;
			}

		}

		if (bflag == true) {

			System.out.println("number is found");
		} else {
			System.out.println("number is not found");
		}

	}

}
