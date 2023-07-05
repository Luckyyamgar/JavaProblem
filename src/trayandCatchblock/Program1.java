package trayandCatchblock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fil = new FileInputStream("d:abc.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(" hello how are you");

	}

}
