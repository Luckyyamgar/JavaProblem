package logical.program;

public class AdditionOfArrayElement {

	public static void main(String[] args) {
		
		int arr[]= {2,6,1,3,9};
		int sum=0;
		
		/*
		 * for(int i=0;i<=arr.length-1;i++) { sum=sum+arr[i]; } System.out.println(sum);
		 */
		for(int value:arr) {
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
