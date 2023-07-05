package logical.program;

public class Devided {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 || i % 4 == 0)
				count = count + 1;
			// System.out.println(i);

		}

		System.out.println(count);
	}
}
