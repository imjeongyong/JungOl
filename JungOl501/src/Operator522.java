import java.util.Scanner;

public class Operator522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int a = (n1 == n2) ? 1 : 0;
		System.out.println(a);
		int b = (n1 != n2) ? 1 : 0;
		System.out.println(b);
	}
}