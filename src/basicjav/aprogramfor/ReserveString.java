package basicjav.aprogramfor;

public class ReserveString {
       //Reserve String program
	public static void main(String[] args) {

             String name = "Mhaku";   // ukahm
             
            int length = name.length();
             String  rev="";
             for(int i=length-1;i>=0;i--) {
            	 
            	 rev=rev+name.charAt(i);
            	 
             }
             System.out.println(rev);
             
	}

}
