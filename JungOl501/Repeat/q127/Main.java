package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int counter = 0;
		while (true) {
			int inp = sc.nextInt();
			if (inp < 0 || inp > 100) {
				break;
			}
			sum += inp;
			counter++;
		}
		sc.close();

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / counter);
	}
}