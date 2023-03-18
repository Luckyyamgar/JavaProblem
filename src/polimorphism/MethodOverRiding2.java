package polimorphism;

public class MethodOverRiding2 {
	public static void main(String args[]){  
//		SBI s=new SBI();  
//		ICICI i=new ICICI();  
//		AXIS a=new AXIS();  
//		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); // without using static keyword 
//		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
//		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
		System.out.println(SBI.getRateOfInterest());
		System.out.println(ICICI.getRateOfInterest());
		System.out.println(AXIS.getRateOfInterest());
		}  
}

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank {
	static int getRateOfInterest() {
		return 0;
	}
}

//Creating child classes.  
class SBI extends Bank {
	static int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	static int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	static int getRateOfInterest() {
		return 9;
	}
}
  
