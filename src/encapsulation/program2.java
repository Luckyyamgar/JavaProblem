package encapsulation;

public class program2 {
public static void main(String[] args) {
	car car1=new car();
	car1.setColour("white");
	car1.setPrice(12333);
	System.out.println(car1.getColour());
	System.out.println(car1.getPrice());
}
}
