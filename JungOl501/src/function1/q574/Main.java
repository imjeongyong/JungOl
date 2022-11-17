package function1.q574;

import java.util.Scanner;

public class Main {

	public int maxfunc(int[] ar) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		Main m = new Main();
		int result = m.maxfunc(ar);
		System.out.print(result);
	}
}