package function1.q574;

import java.util.Scanner;

public class Main1 {
	Scanner sc = new Scanner(System.in);
	int[] ar;

	public void arrMake2() {
		for (int i = 0; i < ar.length; i++) { // 배열 초기화
			ar[i] = sc.nextInt();
		}
	}

	public int max() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Main1 main = new Main1();

		System.out.print("비교할 정수의 개수를 입력하세요.");
		int N = main.sc.nextInt();
		main.ar = new int[N];

		System.out.print("비교할 정수를 입력하세요.");
		main.arrMake2();
		int result = main.max();
		System.out.print(result);
	}
}