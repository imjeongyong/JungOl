package rePeat546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		double sum = 0.0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}

//		System.out.println(sum);

		double avg = (double) sum / n;
		System.out.printf("avg : %.1f\n", avg);
		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}