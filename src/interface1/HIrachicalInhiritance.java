package interface1;

class larger{
  public void hello(){
System.out.println(" how are you");
	
	  
	  
  }
	
	
}

class medium extends larger{
	public void hi() {
		System.out.println(" i am comming");
	}
}
class smaller extends larger{
	public void go() {
		System.out.println("i will go");
	}
}
public class HIrachicalInhiritance {
	public static void main(String[] args) {
		
		smaller s=new smaller();
		s.go();
		s.hello();
		medium s1=new medium();
		s1.hi();
		s1.hello();
	}

}
