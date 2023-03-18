package String_program;

public class string_6 {

	public static void main(String[] args) {
		// !(not) true --false  ;and false --true
		
		String x = " my 1234space 1508class ";
		  String y=" ";
		  for(int i=0;i<x.length();i++) {
			  if(!Character.isDigit(x.charAt(i)))
			  y=y+x.charAt(i);
		  }
		  System.out.println(y);
		
		
		

	}

}





