package rePeat545;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}

		int m3 = 0;
		int m5 = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 3 == 0) {
				m3 = m3 + 1;
			}
			if (ar[i] % 5 == 0) {
				m5 = m5 + 1;
			}
		}

		System.out.println("Multiples of 3 : " + m3);
		System.out.println("Multiples of 5 : " + m5);
	}
}