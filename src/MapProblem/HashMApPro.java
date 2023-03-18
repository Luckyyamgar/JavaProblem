package MapProblem;

import java.util.HashMap;

public class HashMApPro {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put(106, "Mhaku");
		map.put(10, "Somnath");
		map.put(103, "Lakhan");
		map.put(10, "kolekar");// replacing Somnath to kolekar
		map.put(106, "Mhaku");// duplicate value are allowed
		map.put(500, "Ram");
		System.out.println(map);// {101=Mhaku, 102=Somnath, 103=Lakhan}
		System.out.println(map.put(500, "Laxman"));// {500=Ram, 101=Mhaku, 103=Lakhan, 10=kolekar, 106=Mhaku}Ram
		System.out.println(map.entrySet());
		
		System.out.println("########################################");
		HashMap<Integer, String>hash=new HashMap<>();
		hash.put(1, "sunday");
		hash.put(2,"Monday");
		hash.put(3,"tuesday");
		hash.put(4,"wensday");
		hash.put(5,"Monday");
		System.out.println(hash);
		System.out.println(hash.values()+""+hash.keySet());
		//System.out.println(hash.keySet());
	}
}
