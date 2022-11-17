import java.util.Scanner;

public class Input109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		System.out.println("sum = " + (n1 + n2 + n3));
	}
}