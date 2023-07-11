package Arry_all_program;

public class arry_simpleprogram {

	public static void main(String[] args) {
	
		int ar[]=new int [6];
		ar [0]=5;
		ar [1]=55;
		ar [2]=25;
		ar [03]=35;
		ar [4]=45;
		ar [5]=55;
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}System.out.println(sum);
		
		int mul=1;
		
		for(int i=0; i<ar.length;i++) {
			mul=mul*ar[i];
		}System.out.println(mul);
		
		
    int div=ar[0];
		
		for(int i=0; i<ar.length;i++) {
			div=div/ar[i];
		}System.out.println(div);
		
		
		
		
		
		
		

	}

}
