/*
import java.util.Scanner;

public class tjsxor632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		sc.close();

//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);

		if (n1 > n2) {
			if (n2 > n3) {
				System.out.println(n3);
			} else if (n2 < n3) {
				System.out.println(n2);
			}
		} else if (n1 < n2) {
			if (n1 > n3) {
				System.out.println(n3);
			} else if (n1 < n3) {
				System.out.println(n1);
			}
		}
	}
}
*/

import java.util.Scanner;

public class tjsxor632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		sc.close();

//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);

		int min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;

		System.out.println(min);
	}
}
