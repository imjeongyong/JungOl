/*
package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				System.out.printf("%c", c);
			} else if (c >= 97 && c <= 122) {
				System.out.printf("%c", c - 32);
			}
		}
		sc.close();
	}
}
*/

package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				System.out.print((char)str.charAt(i));
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				System.out.print((char)(str.charAt(i) - 32));
			}
		}
		sc.close();
	}
}