package q162;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		ar[0] = sc.nextInt();
		ar[1] = sc.nextInt();
		sc.close();

		for (int i = 2; i < ar.length; i++) {
			ar[i] = (ar[i - 2] + ar[i - 1]);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}