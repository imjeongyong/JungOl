package q504;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean eq = false;
		do {
			int inp = sc.nextInt();
			if (inp % 3 == 0) {
				System.out.println(inp / 3);
			}
			if (inp == -1) {
				eq = true;
			}
		} while (!eq); // <-eq == false; 와 같은 표현!!
		sc.close();
	}
}