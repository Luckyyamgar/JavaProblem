package logical.program;

public class PelindromString {
//Pelindrom reverse String
	public static void main(String[] args) {

		String str = "MADAM";

		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (str.equals(rev)) {
			System.out.println("This is a palindrom:" + rev);
		} else {
			System.out.println("This is not palindrom::" + rev);
		}
	}
}