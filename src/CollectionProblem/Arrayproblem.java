package CollectionProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class Arrayproblem {
public static void main(String[] args) {
	
// Array List  only String object can be store in the in The Array List
	
	ArrayList<String> list=new ArrayList<>();
	list.add("mhaku");
	list.add("onkar");
	list.add("sachin");
	list.add("onkar"); // duplicate are Allowed
	list.add("123");
	list.set(1, "Sudeer");
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(0));
	System.out.println(list.clone());
	System.out.println(list.isEmpty());
	System.out.println(list.toString());
	
	
	//unSafe Array list
	LinkedList l=new LinkedList();
	l.addAll(list);
	l.add(123);
	l.add("don");
	System.out.println(l);
	
	Vector v=new Vector<>();
	v.add("Hyderabad");
	v.add(120000);
	v.add(l);
	System.out.println(v);
	
	
	//HashMap<>hash=new HashMap<>();
}
}
