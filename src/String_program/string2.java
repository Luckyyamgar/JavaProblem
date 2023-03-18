package String_program;

public class string2 {

	public static void main(String[] args) {

		String s = "My 1name is Lucky";
		System.out.println(s.toUpperCase());

		System.out.println(s.length());

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));

		System.out.println(Character.isUpperCase(s.charAt(0)));
		System.out.println(Character.isUpperCase(s.charAt(1)));
		System.out.println(Character.isLowerCase(s.charAt(4)));

		System.out.println(Character.isDigit(s.charAt(0)));
		System.out.println(Character.isDigit(s.charAt(5)));
		System.out.println(Character.isDigit(s.charAt(3)));

		s = "Mhaku15";

		System.out.println(Character.isSpaceChar(0));

	}

}
