package inheritance;

public class program2  extends Car{

	protected String brand = "Ford";

	public void honk() {
		System.out.println("Tuut, tuut!");
	}
		public static void main(String[] args) {

			program2 myFastCar = new program2();
			myFastCar.honk();
			System.out.println(myFastCar.brand + " " + myFastCar.getModelName());
		
		
	}

}

class Car  {
	private String modelName = "Mustang";

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
}
