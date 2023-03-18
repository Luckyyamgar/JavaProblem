package CollectionProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class TravelasWxample {
	public static void main(String[] args) {

		ArrayList<String> Arr = new ArrayList<>();
		Arr.add("Mhaku");
		Arr.add("Onkar");
		Arr.add("Suraj");
		Arr.add("pradip");
		Arr.add("Surendar");

		// for Each loop
		// System.out.println(Arr);
		for (String str : Arr) {
			System.out.println(str + "\t" + str.length() + "\t");
			StringBuffer buff = new StringBuffer(str);
			System.out.println(buff.reverse());
		}
		System.out.println("______________________________________________");
		// travelling using Iterator :: Forword Direction

		Iterator<String> itr = Arr.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		System.out.println("_________________________________________________________");
		// Backword Direction
           ListIterator<String> lis = Arr.listIterator(Arr.size());// coursers ko pohachana hai last tak
           while(lis.hasPrevious()) {
        	        String sre = lis.previous();
        	        System.out.println(sre);
           }
	System.out.println("######################################################");
	//For each element retreve
           Arr.forEach(e->{
        	   System.out.println(e);
           });
	
           HashMap<Integer, String> map=new HashMap<>();
           map.put(1, "Sidhanath");
           map.put(2, "Sitharth");
           map.put(3, "Savrabh");
           map.put(4, "Sujata");
           map.put(4, "Sujata");
           
           System.out.println(map);
           
           map.forEach((e1,e2)->{
        	   //System.out.println(e1);
        	  // System.out.println(e2);
        	   System.out.println(e1 +"=> "+e2);
           });
           
	}

}
