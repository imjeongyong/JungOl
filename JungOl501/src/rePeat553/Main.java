package rePeat553;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int output = 64;
		int i = 0;
		while (true) {
			i++;
			output++;
			System.out.printf("%c", output);

			if (i == N) {
				System.out.println();
				i = 0;
				N = N - 1;
			}
			if (N == 0)
				break;
		}
	}
}