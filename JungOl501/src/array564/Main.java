package array564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] counter = new int[26];

		while (true) {
			char C = sc.next().charAt(0);

			if ((int) C < 65 || (int) C > 90) {
				break;
			}
			int c = (int) C - 65;
			counter[c] = counter[c] + 1;
		}
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.println((char) (i + 65) + " : " + counter[i]);
			}
		}
	}
}