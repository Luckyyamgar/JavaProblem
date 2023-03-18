package String_program;

public class string3 {

	public static void main(String[] args) {
		// converting string in to array by using splite 
		
		  String s1 = "my space class";
        String []s2 =s1.split(" ");
        for(int i=0;i<s2.length;i++) {
        	System.out.println(s2[i].length());
        }
	}

}
