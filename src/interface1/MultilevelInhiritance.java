package interface1;

class mhaku1{
	public void  home(){
		System.out.println("1 BHK");
	}
}
class lucky extends mhaku1{
	public void car() {
		System.out.println("fourtuner");
	}
}
class don extends lucky{
	public void moblie(){
		System.out.println("apple");
	}
}
public class MultilevelInhiritance {

	
	public static void main(String[] args) {
		
		don s=new don();
		s.car();
		s.moblie();
		s.home();
		
		
		
	}
}
