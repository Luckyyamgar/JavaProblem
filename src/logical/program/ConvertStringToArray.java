package logical.program;

public class ConvertStringToArray {

//Convert String into Array By Using Split method.....

	public static void main(String[] args) {

		String str = "My College Name KEC";
		String strs[] = str.split(" ");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i].length());

		}
	}
}