package inheritance;

class bird {
	int a = 200;
}

class animal extends bird {
	float b = 300;
}

public class Program1 {
	public static void main(String[] args) {

		animal sc = new animal();
		System.out.println("print bird...."+sc.a);
		System.out.println("print animal..."+sc.b);

	}
}