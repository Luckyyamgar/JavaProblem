package basicjav.aprogramfor;

public class SwitchProgram {

	public static void main(String[] args) {
		// Swith program
		int a = 20, b = 10, c;

		int num = (3);

		switch (num) {

		case 1:
			c = a + b;

			System.out.println("this is first month" + c);

			break;

		case 2:
			c = a - b;
			System.out.println(c);

			break;
		case 3:
			c = a + b + 1;
			System.out.println("This is Thied Month:" + c);
			break;
		default:
			System.out.println("india");
			break;
		}

	}

}
