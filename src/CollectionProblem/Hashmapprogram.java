package CollectionProblem;

import java.util.HashSet;
import java.util.TreeSet;

public class Hashmapprogram {
	public static void main(String[] args) {

		HashSet<Double> li = new HashSet<>();
		li.add(12.23);
		li.add(99.12);
		li.add(23.2);
		li.add(87.1);
		li.add(12.23);// Dublicated are not Allowed
		System.out.println(li);

		HashSet h = new HashSet();
		h.add("Nexwave");
		h.add("Oneable");
		h.addAll(li);
		System.out.println(h);

		TreeSet<Double> tre = new TreeSet<>();// order are maintened....
		tre.add(188.12);
		tre.add(11.1);
		tre.addAll(li);
		System.out.println(tre);

	}
}
