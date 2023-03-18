package polimorphism;

public class method_overloading {
	public static void main(String[] args) {
		Adder ad=new Adder();
		System.out.println(Adder.add(11, 11, 11));
		
		System.out.println(Adder.add(12, 011));
		//System.out.println(Adder.add(2,3 ));
	}
}

class Adder {
	public static int add(int a, int b) {
		return a+b;

		//return a + b;
	}

	//public static double add(double v, double m) {
		//return v+m;
	public static int add(int a,int b,int c) {
		return a+b+c;

		
	}
}
