package rePeat543;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 2; i <= inp; i += 2) {
			System.out.print(i + " ");
		}
	}
}