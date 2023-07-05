package logical.program;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		//find missing number in arraylist
		//Array should not be dublicate
		//Array no need to sorted order
		
		int arr[]= {1,4,2,3,6,7,8,9,10,5,12};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("sum of element of array:"+sum);
		
		int sum1=0;
		for(int i=1;i<=12;i++) {
			sum1=sum1+i;
			
			
		}
		System.out.println("sum1 of range of element in array"+sum1);
		
		System.out.println(sum1-sum);
	}

}
