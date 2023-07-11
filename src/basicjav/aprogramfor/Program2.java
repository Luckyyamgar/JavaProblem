package basicjav.aprogramfor;

public class Program2 {
	
	int a =20;
		
	static int b=30;
//                              Identifier : space not are used
	//                         onlay under scoer and symbol are used  (doller)
	//                         reserve word are not used  i.e int public =10;  //public are identifier
//variable   
	
	public void  add() {
		
		int c=40;
		int add=a+b+c;
		System.out.println(add);
	}
	
		public void addi () {
	         int d=50;            //not scope in other  method
			int addi =a+b+d ;
			System.out.println(addi);
			
		}
		
//		public void adddd() {
//			int addd=a+b+d;       d is not access in other class
//		}
	public static void main(String[] args) {
		Program2 sc=new Program2();
		sc.add();
		sc.addi();
	}
	
}
 
	
	
	
	
	
	
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
