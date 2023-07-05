package basicjav.aprogramfor;

class A { // inhiritance program
	int a = 10, b = 20, c = 30;

	public void add() {
		// int a=10, b=20, c=30;
		System.out.println(a + b + c);
	}

	public void car() {
		System.out.println(" This is a BMW Car");

	}
}

class b extends A {
	void hello() {
		System.out.println("hello how are you ");
	}
}

public class program4 extends b {
	void sub() {
		System.out.println(a - b - c);
	}

	public static void main(String[] args) {

		program4 s = new program4();
		s.sub();
		s.add();
		s.hello();
		s.car();
	}
}
