/*
import java.util.Scanner;

public class Array562 { // 배열 사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) { // 홀수 인덱스 -> 짝수 입력값
				sum1 = sum1 + arr[i];
			} else if (i % 2 == 0) { // 짝수 인덱스 -> 홀수번째 입력값
				sum2 = sum2 + arr[i];
			}
		}
		System.out.printf("sum : %d\navg : %.1f", sum1, sum2 / (double) 5);
	}
}
*/

import java.util.Scanner;

public class Array562 { // 배열 미사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < 10; i++) {
			int inp = sc.nextInt();
			if (i % 2 != 0) { // 짝수번째 입력값
				sum1 = sum1 + inp;
			} else if (i % 2 == 0) { // 홀수번째 입력값
				sum2 = sum2 + inp;
			}
		}
		sc.close();
		System.out.printf("sum : %d\navg : %.1f", sum1, (double) sum2 / 5);
	}
}