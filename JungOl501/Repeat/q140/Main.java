package q140;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 20; i++) {
			int inp = sc.nextInt();
			sum = sum + inp;

			if (inp == 0) {
				sc.close();
				break;
			}
			count++;
		}
		System.out.print(sum + " " + sum / count);
	}
}