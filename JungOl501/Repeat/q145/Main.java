package q145;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int k = N;
		int l = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= l; j++) {
				System.out.print(j+" ");
			}
			k--;
			l++;
			System.out.println();
		}
	}
}