package _02_nested_loops._3_for_loop_gauntlet;

public class Nested {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}

		for (int j = 2; j <= 100; j += 2) {
			System.out.println(j);
		}
		for (int j = 1; j <= 99; j += 2) {
			System.out.println(j);
		}
		for (int j = 1; j <= 500; j++) {
			if (j % 2 == 0) {
				System.out.println(j + " is even");

			} else {
				System.out.println(j + " is odd");

			}

		}
		for (int j = 0; j <= 777; j += 7) {
			System.out.println(j);

		}
		for (int j = 0; j <= 13; j++) {
			System.out.println((2009 + j) + " I was " + j);
		}
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(j + " " + i);
			}
		
		}
		int v = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(v + " " );
				v++;
			}
			System.out.println();
		}
		int f = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(f + "\t");
				f++;
			}
			System.out.println();
		}
		for(int j = 0; j < 6; j++) {
			for(int i = 0; i < j; i++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
	}
}
