package statics.program;

class Abc{

	// static method
	static void show() {
		System.out.println("Parent");
	}
}

// Parent inherit in Child class
class Child extends Abc {

	// override show() of Parent
	static void show() {
		System.out.println("Child");
	}
}

public class Parient {
	public static void main(String[] args) {
		Abc p = new Abc();
		Child ch=new Child();
		ch.show();                   //only static method can be overide only static method
		// calling Parent's show()
		p.show(); 
		
		//because  static method
		// cannot override Parent's show()
	}
}
