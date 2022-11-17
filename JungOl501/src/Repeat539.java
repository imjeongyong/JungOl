/*
import java.util.Scanner;

public class Repeat539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp;
		int i = 0;
		int sum = 0;
		while (true) {
			inp = sc.nextInt();

			if (inp < 100) {
				sum = sum + inp;
				i = i + 1;
			} else if (inp >= 100) {
				sum = sum + inp;
				double avg = (double) sum / (i + 1);

				System.out.printf("%d\n%.1f\n", sum, avg);
				break;
			}
		}
		sc.close();
	}
}
*/

import java.util.Scanner;

public class Repeat539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;

		for (;;) {
			int n = sc.nextInt();
			sum = sum + n;
			count = count + 1;

			if (n >= 100) {
				System.out.printf("%d\n%.1f\n", sum, sum / (double) count);
				sc.close();
				break;
			}
		}
	}
}