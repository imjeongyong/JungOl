import java.util.Scanner;

public class Operator115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mh = sc.nextInt();
		int mw = sc.nextInt();
		int kh = sc.nextInt();
		int kw = sc.nextInt();
		sc.close();

		int a = (mh > kh && mw > kw) ? 1 : 0;
		System.out.println(a);
	}
}