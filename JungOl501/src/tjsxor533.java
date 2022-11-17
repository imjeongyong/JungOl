/*
import java.util.Scanner;

public class tjsxor533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int a = sc.nextInt();
		sc.close();

//		System.out.println(s);
//		System.out.println(a);

		switch (s) {
		case "M":
			if (a >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
			break;
		case "F":
			if (a >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
			break;
		}
	}
}
*/

import java.util.Scanner;

public class tjsxor533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char s = sc.next().charAt(0);
		int a = sc.nextInt();
		sc.close();

//		System.out.println(s);
//		System.out.println(a);

		if (s == 'M') {
			if (a >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (a >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}
