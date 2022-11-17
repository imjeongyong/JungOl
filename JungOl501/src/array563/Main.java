/*
package array563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int max = -9999;
		for (int j = 0; j < ar.length; j++) {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == max) {
					ar[i] = -9999;
					max = -9999;
				}
			}
			for (int i = 0; i < ar.length; i++) {
				if (max < ar[i]) {
					max = ar[i];
				}
			}
			System.out.print(max + " ");
		}
	}
}
*/

package array563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			int max = -1, idx = -1;
			for (int j = 0; j < ar.length; j++) {
				if (ar[j] > max) {
					max = ar[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
			ar[idx] = -1;
		}
	}
}
