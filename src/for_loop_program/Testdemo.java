package for_loop_program;


public class Testdemo implements Mhaku2,raju,sachin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Testdemo s=new Testdemo();
    
    s.mobile();
    s.car();
    s.mul();
    s.sub();
    s.lucky();
    s.money();
	}


		
	

	@Override
	public void lucky() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println(1000);
	}

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
	System.out.println("redmi");	
	}

	@Override                                                                                
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=a*b;
		System.out.println(c);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=a-b;
		System.out.println(c);
		
	}

}
