package for_loop_program;

public class count_program {

	public static void main(String[] args) {
		// count program
		
		int count=0;
		for(int i=1;i<=100;i++) {
			
			if(i%3==0&&i%4==0) {
				count=count+1;
				System.out.println(i);
			}
		}System.out.println(count);

	}

}
