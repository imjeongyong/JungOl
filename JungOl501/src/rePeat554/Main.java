package rePeat554;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int num = 0;
		int ch = 64;
		int k = N;
		int l = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k; j++) {
				num++;
				System.out.print(num + " ");
			}
			for (int j = 0; j < l; j++) {
				ch++;
				System.out.printf("%c ", ch);
			}
			System.out.println();
			k--;
			l++;
		}

	}
}