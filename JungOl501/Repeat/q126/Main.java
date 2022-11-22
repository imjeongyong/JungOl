package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int evenCounter = 0;
		int oddCounter = 0;
		while (true) {
			int inp = sc.nextInt();

			if (inp == 0) {
				sc.close();
				break;
			} else if (inp % 2 == 0) {
				evenCounter++;
			} else {
				oddCounter++;
			}
		}
		System.out.printf("odd : %d\neven : %d", oddCounter, evenCounter);
	}
}