import java.util.Scanner;

public class Operator525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

//		System.out.print(n1 + " " + n2 + " " + n3);

		if (n1 > n2 && n1 > n3) {
			System.out.print("1" + " ");
		} else {
			System.out.print("0" + " ");
		}

		if (n1 == n2 && n1 == n3) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}