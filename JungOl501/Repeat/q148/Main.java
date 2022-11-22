package q148;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int k = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("# ");
			}
			k++;
			System.out.println();
		}
		int m = 1;
		int l = N;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < l - 1; j++) {
				System.out.print("# ");
			}
			m++;
			l--;
			System.out.println();
		}
	}
}