/*

import java.util.Scanner;

public class tjsxor534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.nextLine();
		sc.close();

//		System.out.println(C);
		
		switch (C) {
		case "A" :
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C" :
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;
		case "F" :
			System.out.println("Failure");
			break;
		default :
			System.out.println("error");
			break;
		}
	}
}

*/

/*
import java.util.Scanner;

public class tjsxor534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();

//		System.out.println(C);
		if (a == 'A') {
			System.out.println("Excellent");
		} else if (a == 'B') {
			System.out.println("Good");
		} else if (a == 'C') {
			System.out.println("Usually");
		} else if (a == 'D') {
			System.out.println("Effort");
		} else if (a == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
*/

import java.util.Scanner;

public class tjsxor534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();

//		System.out.println(C);

		if (a.equals("A")) {
			System.out.println("Excellent");
		} else if (a.equals("B")) {
			System.out.println("Good");
		} else if (a.equals("C")) {
			System.out.println("Usually");
		} else if (a.equals("D")) {
			System.out.println("Effort");
		} else if (a.equals("F")) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
