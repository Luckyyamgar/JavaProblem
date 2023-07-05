package logical.program;

public class FindDublicateElementInArray {
	public static void main(String[] args) {

		String arr[] = { "student", "java", "Employee", "java" };

		// Approch one
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("found Dublicate element:" + arr[i]);
				}
			}
		}

	}

}
