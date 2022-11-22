package q599;

import java.util.Scanner;

public class Main1 { // String 클래스, Character 클래스 사용 풀이!!!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		String str2 = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str2.charAt(i);
			if (Character.isAlphabetic(c)) {
				System.out.print(c);
			}
		}
	}
}