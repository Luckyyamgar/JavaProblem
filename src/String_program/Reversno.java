package String_program;

public class Reversno { 
public static void main(String[] args) {
	

	String no="1233336";
	String res="";
	//System.out.println(no);
	for(int i=no.length()-1;i>0;i--) {
		res=res+no.charAt(i);
		
	}
	System.out.println(res);
}

}
