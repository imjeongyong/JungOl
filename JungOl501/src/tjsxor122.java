import java.util.Scanner;

public class tjsxor122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();

//		System.out.println(y);

		if (y % 400 == 0) {
			System.out.println("leap year");
		} else if (y % 4 == 0 && y % 100 != 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}
}