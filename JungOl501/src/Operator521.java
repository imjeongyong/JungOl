/*
import java.util.Scanner;

public class Operator521 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int a = num1++;
		int b = --num2;
		System.out.printf("%d %d %d", num1, b, a * b);
	}
}
*/

import java.util.Scanner;

public class Operator521 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		int result = num1++ * --num2;
		System.out.printf("%d %d %d", num1, num2, result);
	}
}
