package basicjav.aprogramfor;

import javax.swing.DefaultBoundedRangeModel;

public class SwitchProgram2 {
	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; int restore;
		 * 
		 * String num = "1"; switch (num) {
		 * 
		 * case "1": restore = a + b; System.out.println(restore); break; case "2":
		 * restore = a - b; System.out.println(restore); break; case "8": restore = a *
		 * b; System.out.println(restore); break; default
		 * :System.out.println("my name is lucky"); }
		 */
		
		int day=3 ;
		
		switch(day) {
		case 1:{
			System.out.println("Sunday");
			//break;
		}
		case 2:{
			System.out.println("monady");
			//break;
		}
		case 3:{
			System.out.println("tuesady");
		}
		case 4:{
			System.out.println("wensday");
			break;
		}
		case 5:{
			System.out.println("Thirsday");
			break;
		}
		case 6:{
			System.out.println("Friaday");
		}
		case 7:
			System.out.println("Saterday");
			break;
		
		default :{
			System.out.println("WeekEnds");
		}
	}
}
}