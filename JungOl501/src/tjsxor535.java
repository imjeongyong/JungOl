/*
import java.util.Scanner;

public class tjsxor535 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();

//		System.out.println(a);

		int score1 = (int) score;
		
//		System.out.println(score1);

		switch (score1)
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;
		}
	}
}
*/

/*
import java.util.Scanner;

public class tjsxor535 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();

//		System.out.println(score);

		if (score >= 4.0) {
			System.out.println("scholarship");
		} else if (score >= 3.0) {
			System.out.println("next semester");
		} else if (score >= 2.0) {
			System.out.println("seasonal semester");
		} else {
			System.out.println("retake");
		}
	}
}
*/

import java.util.Scanner;

public class tjsxor535 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();

//		System.out.println(a);

//		System.out.println(score1);

		switch ((int) score) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
			break;
		}
	}
}