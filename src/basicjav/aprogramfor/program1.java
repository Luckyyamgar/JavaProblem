package basicjav.aprogramfor;

public class program1 {

	int a = 10; // instant variable
	static int b = 20;// static variable

	public static void main(String[] args) {
		program1 sc = new program1();
		System.out.println(sc.a); // 10

		System.out.println(sc.b); // 20

		sc.a = 100;
		sc.b = 200;
		System.out.println(sc.a); // 100

		System.out.println(sc.b); // 200

		program1 my = new program1();

		System.out.println(my.a); // 10
		System.out.println(my.b); // 200 because static varibale do not recive second object

		sc.a = 50;
		sc.b = 70;
		System.out.println(sc.a);// 50

		System.out.println(sc.b);// 70
	}

}

//public class program1 {
//}
