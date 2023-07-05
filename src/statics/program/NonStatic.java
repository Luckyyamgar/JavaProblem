package statics.program;

//class A {
//	static int a = 10;
//	int b = 20;

//	public void sum() {
//		System.out.println(this.a);
//		System.out.println(this.b);
//
//	}
//}
//non static variable can call nonstatic method 
//but static variable can call nonstatic method as well as static method
public class NonStatic  {
	 static  int a = 20;
	 static  int b = 30;
	public static void main(String[] args) {
		NonStatic non = new NonStatic();
		non.sum();

		
	}
		public  static void sum() {
			System.out.println(a);
			System.out.println(b);

		}
		
	

public void  show() {
	
	System.out.println("NonStatic method");
}
	
}
class A extends NonStatic {
	
	public static void show(int a,int b) {	
		System.out.println(a+b);
			

 }
}