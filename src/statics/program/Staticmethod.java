package statics.program;

public class Staticmethod {
	public static void main(String[] args) {
		Staticmethod s = new Staticmethod();

		Staticmethod a = new Staticmethod(); // static method call static method as well as non static metho
		a.add();
	} // non static method can not call static method
		// non static method call non static method

	public void add() {
		int a = 10;
		int b = 2;
		System.out.println(a + b);
		sub();

	}

	public static void sub() {
		int c = 19;
		int d = 13;
		System.out.println(d - c);
	}
}
