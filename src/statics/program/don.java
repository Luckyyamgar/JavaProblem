package statics.program;

public class don {
   static int a=10;
   static int b=20;
   int c=20;
   public void add() {
	   System.out.println(a+b);
	   System.out.println(c);
	   hellow();                     // static variable call nonstatic method as well as static method
   }
   
   public static void hellow() {
	   System.out.println(a+b);
	   System.out.println("hello how are you");
	   //System.out.println(c);       do not call nonstatic variable in static metho
        // add();                    do not call nonstatic method in static method
	   
   }
   
   public static void allstatic() {
	   System.out.println("Static method call static metod");
	   hellow();
   }
   
   public void  nonstatic() {
	   add();
   }
	public static void main(String[] args) {
		don d=new don();
		d.add();
		allstatic();
	}
	
	
}
