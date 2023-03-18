package encapsulation;

//Encapsulation : hinding of code and show the only function
//if you declar data type  is private and access to other class is public datamodifier
public class program1 {
	public static void main(String[] args) {

		car s = new car();
		s.setColour("Read");
		s.setPrice(12.12);
		System.out.println("colour is==" + s.getColour());
		System.out.println("price is==" + s.getPrice());
	}

}

class car { // only one class is public
	private String colour;// this is decleard private and assee to getter and setter
	private double price;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
