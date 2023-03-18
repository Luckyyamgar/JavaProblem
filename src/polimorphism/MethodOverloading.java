package polimorphism;

public class MethodOverloading {
	public void car(String string) {

		System.out.println(string);
	}

	public void car(String string, int a) {
		System.out.println(string+a);
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.car("This is Foryuner car");
		m.car("This is BMW car::",50);
		
	}
}
