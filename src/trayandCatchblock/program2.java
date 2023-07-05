package trayandCatchblock;

public class program2 {
	public static void main(String[] args) {
		try{int a=100, b=0;
				int c=a/b;
				System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			System.err.println(e.getMessage());
		}
		
	}

	
	
	
	
}
