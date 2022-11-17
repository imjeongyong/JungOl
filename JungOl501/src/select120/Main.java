package select120;

import java.util.Scanner;

public class Main {
	public int bigger(int n1, int n2) {
		int result = Math.abs(n1 - n2); // Math.abs <- 절댓값 사용하는 클래스
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		Main main = new Main();
		int big = main.bigger(a, b);
		System.out.print(big);
	}
}