package basicjav.aprogramfor;

public class Reserveno {
                                                //IMP Program  reserve number 
	public static void main(String[] args) {
	int no=5432,rem,res=0;
	
	while(no!=0) {
		rem=no%10;
		res=res*10+rem;
		no=no/10;
		
	}
		
		System.out.println(res);
		
		
		
		
		

	}

}
