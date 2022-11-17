package array561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int max = -1;
		int min = 9999;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 100 && ar[i] > max) { // <- 이중 if문 -> && 조건 사용!!!
				max = ar[i];
			}
			if (ar[i] >= 100 && ar[i] < min) {
				min = ar[i];
			}
		}
		if (max == -1) {
			max = 100;
		}
		if (min == 9999) {
			min = 100;
		}
		System.out.print(max + " " + min);
	}
}