package q568;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("first array");
		int[][] ar1 = new int[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}

		System.out.println("second array");
		int[][] ar2 = new int[2][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar1[i][j] * ar2[i][j] + " ");
			}
			System.out.println();
		}
	}
}