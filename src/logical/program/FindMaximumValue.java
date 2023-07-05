package logical.program;

public class FindMaximumValue {
public static void main(String [] arg) {
	//find maximum value of array
	int a[]= {12,17,6,50,100,60,45,30};
	
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("Maximum number:"+max);
	
	//find minimum value of array
	
	int arr[]= {12,5,17,55,65,4,50,100};
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("Minimum value of array:"+min);
}
}
