package interface1;

    class supe{
   public void add(int a,int b){
	   int c=a+b;
	   System.out.println(c);
	   
   }
    }	
	class child extends supe{
		public void mul(int a,int b) {
			int c=a*b;
			System.out.println(c);
		}
	}

public class SinglelevelInhiritance{
	
	
	
	public static void main(String[] args) {
		
		
		
		child s=new child();
		s.add(10, 20);
		s.mul(15, 5);
	}
	
}





















	
	
	


