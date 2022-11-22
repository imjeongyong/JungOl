package q161;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scoAr = new int[11];

		while (true) {
			int score = sc.nextInt();
			if (score >= 10) {
				scoAr[score / 10]++;
			} else if (score > 0 && score < 10) {
				scoAr[0]++;
			} else if (score == 0) {
				sc.close();
				break;
			}
		}
		for (int i = 10; i >= 0; i--) {
			if (scoAr[i] != 0) {
				System.out.println((i * 10) + " : " + scoAr[i] + " person");
			}
		}
	}
}