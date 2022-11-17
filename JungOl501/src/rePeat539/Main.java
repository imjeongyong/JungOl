package rePeat539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int i = 0;
		for (i = 0;; i++) {
			int inp = sc.nextInt();
			sum = sum + inp;

			if (inp >= 100) {
				sc.close();
				break;
			}
		}

		System.out.print(sum);
		System.out.println();
		System.out.printf("%.1f", (double) sum / (i + 1));
	}
}