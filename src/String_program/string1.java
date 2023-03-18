package String_program;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1 = "mhaku";
		String s2="mhaku";
		String s3=new String("mhaku");
		String s4=new String ("Mhaku");
		if(s3==s4) {
			System.out.println("true");
		}
		else {System.out.println("false");
		}
		if(s3.equals(s4)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		if(s1==s2) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
        if(s1==s3) {
        	System.out.println("tru");
        }else {
        	System.out.println("false");
        }
        if(s1.equals(s3)) {
        	System.out.println("true");
        }else {
        	System.out.println("");
        }
	}

}
