package q147;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int k = 0;
		int l = N;
		int num = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < l; j++) {
				System.out.print(num++ + " ");
			}
			l--;
			k++;
			System.out.println();
		}
	}
}