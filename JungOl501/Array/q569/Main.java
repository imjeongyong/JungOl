package q569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int sum = 0;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				sum += score[i][j];
			}
			if (sum / 4 >= 80) {
				System.out.println("pass");
				counter++;
			} else {
				System.out.println("fail");
			}
			sum = 0;
		}
		System.out.println("Successful : " + counter);
	}
}