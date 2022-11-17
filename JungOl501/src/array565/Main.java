package array565;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] counter = new int[10];

		while (true) {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			}
			counter[(inp / 10)]++;
		}
		sc.close();

		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.println(i + " : " + counter[i]);
			}
		}
	}
}