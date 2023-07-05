package logical.program;

public class ReverseString {
public static void main(String[] args) {
	//Reverse String 
	
	String name="yamger";
	
	String rev="";
	int len = name.length();
	
	for(int i=len-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	
	System.out.println(rev);
	System.out.println("**********************************************************************8");
	//Second method
	String tring="Hyderabad";
	String reve="";
	StringBuffer st=new StringBuffer(tring);
	StringBuffer v = st.reverse();
	System.out.println(v);
	System.out.println("@@@@@@@@@@@@@@");
	StringBuilder s=new StringBuilder(tring);
	System.out.println(s.reverse());
}
	
	
	
	
	
}
