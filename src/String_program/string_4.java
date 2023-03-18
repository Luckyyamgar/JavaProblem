package String_program;

public class string_4 {

	public static void main(String[] args) {
		// WAP string reserve order
		
		  String x = " my space class ";
		  String y=" ";
		  for(int i=x.length()-1;i>0;i--) {
			  y=y+x.charAt(i);
		  }
		  System.out.println(y);

	}

}
