package arrayProgram;

public class ThreeDimentionalArray {
public static void main(String[] args) {
	

	int [][][] arr = {{{10,20,30},{40,50,60},{80,90}}};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.print(arr[i][j][k]+"   ");
			}
			System.out.println("");
		}
	System.out.println();
	} 
	
	
	
	
	
	
}	
	
	
}
