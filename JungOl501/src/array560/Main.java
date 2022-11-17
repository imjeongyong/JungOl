package array560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int min = ar[0]; // 최소값을 저장하는 변수 생성 -> 최대값으로 저장하거나 배열의 첫번째 값으로 저장, Integer.MAX_VALUE 또는 1000도 가능
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.print(min);
	}
}