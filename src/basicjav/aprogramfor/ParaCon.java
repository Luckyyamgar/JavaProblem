package basicjav.aprogramfor;

public class ParaCon {
	String name;
	int a;

	ParaCon(String name, int a) {

		this.name = name;
		this.a = a;
		
	}

	public static void main(String[] args) {
		
		ParaCon e1 = new ParaCon("mhaku", 100);
		System.out.println(e1.name);
        System.out.println(e1.a);        
		System.out.println(e1.a);
                                         //System.out.println(e1.name);

		//ParaCon e2 = new ParaCon("onkar", 200);

		//System.out.println("empoly1....." + e2.name);
		//System.out.println("empoly2.....>>>>" + e2.a);
	}

}
