package logical.program;

public class SwapNumber {
	// using Third variable
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 0;

		c = a; // c=20
		a = b; // a=20
		b = c; // 20
		System.out.println("print a:" + a);
		System.out.println("print b:" + b);
		System.out.println("__________________________________________________________________");
		// without using Third variable

		long j = 5;
		long k = 10;

		j = j * k; // j=50

		k = j / k;// 50/10=5
		j = j / k;// 50/5=10

		System.out.println("print K:" + k);
		System.out.println("print j:" + j);
		System.out.println("_____________________________________________________________");
		// second method without using third variable

		int y = 10;
		int z = 100;

		y = y + z;
		z = y - z;
		y = y - z;
		System.out.println("print z:" + z);
		System.out.println("print y:" + y);
System.out.println("_________________________________");
		// fourth method
		int d=500;
		int e=100;
		//e=d+e-(d=e);
		e=d+e-(d=e);
		System.out.println("print d:"+d);
		System.out.println("print e:"+e);

	}
}