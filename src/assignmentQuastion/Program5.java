package assignmentQuastion;

/*5. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
/*respectively by creating a class named 'Rectangle' with a method 
named 'Area' which returns the area of length and breadth passed as parameters to its constructor.*/
public class Program5 {
	int length;
	int breadth;

	Program5(int l, int b) {
		length = l;
		breadth = b;

	}

	public int are() {
		return length * breadth;
		
	}

	public static void main(String[] args) {
		Program5 sc = new Program5(4, 5);
		Program5 sc1=new Program5 (5,8);
		System.out.println(sc.are());
		System.out.println(sc1.are());

	}

}
