package function1.q571;

import java.util.Scanner;

public class Main {

	public static void printstr() { // printstr 메서드 선언부
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) { // 메인 클래스의 시작
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			printstr(); // printstr 메서드 호출
		}
	}
}