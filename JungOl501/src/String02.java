/*
import java.util.Scanner;

public class String02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // next();<-공백 전까지 입력, nextLine();<-공백 포함 입력
		sc.close();

		for (int i = 0; i < 2; i++) {
			System.out.print(str);
		}
	}
}
*/

import java.util.Scanner;

public class String02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		System.out.print(str);
		System.out.print(str);
	}
}