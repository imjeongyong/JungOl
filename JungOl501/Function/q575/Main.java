package q575;

import java.util.Scanner;

public class Main {

	public int multi(int n1, int n2) {
		int result = 1;
		for (int i = 0; i < n2; i++) {
			result *= n1; // result = result * n1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.print(m.multi(n1, n2));
	}
}