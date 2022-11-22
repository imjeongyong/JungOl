package q146;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int k = N;
		int c = 0;
		int l = 0;
		int n = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k; j++, c++) {
				System.out.printf("%c ", c + 65);
			}
			for (int j = 0; j < l; j++, n++) {
				System.out.print(n + " ");
			}
			k--;
			l++;
			System.out.println();
		}
	}
}