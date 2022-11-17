import java.util.Scanner;

public class Repeat538 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println(n);
		while (true) {
			System.out.print("number? ");
			int n = sc.nextInt();
			if (n > 0) {
				System.out.println("positive integer");
			} else if (n < 0) {
				System.out.println("negative number");
			}
			if (n == 0) {
				sc.close();
				break;
			}

		}

	}
}