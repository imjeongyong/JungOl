import java.util.Scanner;

public class tjsxor123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int n = sc.nextInt();
		sc.close();

//		System.out.println(n);

		switch (n) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
	}
}