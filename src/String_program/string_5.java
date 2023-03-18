package String_program;

public class string_5 {

	public static void main(String[] args) {
		// write program for digi  
		  String x = " my 1234space 1508class ";
		  String y=" ";
		  for(int i=0;i<x.length();i++) {
			  if(Character.isDigit(x.charAt(i))) {
				  y=y+x.charAt(i);
			  }
			  
		  }
		  System.out.println(y);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
