import java.util.Scanner;

public class tjsxor124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.close();

//		System.out.println(m);

		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println(28);
		}
	}
}

// 31일 - 1, 3, 5, 7, 8, 10, 12
// 30일 - 4, 6, 9, 11
// 28일 - 2