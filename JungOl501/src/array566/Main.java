package array566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[1000];

		ar[0] = 100;
		ar[1] = sc.nextInt();
		sc.close();
		for (int i = 0; i < ar.length; i++) {
			ar[i + 2] = ar[i] - ar[i + 1];
			System.out.print(ar[i] + " ");
			if (ar[i] < 0)
				break;
		}
	}
}