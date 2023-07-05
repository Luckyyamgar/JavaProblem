package basicjav.aprogramfor;

class pen {
	String colour;
	String type; // most imp program
	int a;

	public void write() {
		System.out.println("write a program");
	}

	public void colour() {
		System.out.println(this.colour);
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen sc = new pen();

		sc.colour = " blue";
		sc.type = "gel";
		sc.a = 10;
		sc.write();
		pen sm = new pen();
		sm.colour = " red";
		sm.type = " Ball pen";

	}

}
