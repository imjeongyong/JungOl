/*
import java.util.Scanner;

public class Operator524 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
//		System.out.print(x);
//		System.out.print(y);
		
		boolean a = (x !=0);
		boolean b = (y !=0);
		
		System.out.printf("%s", a & b);
		System.out.print(" ");
		System.out.printf("%s", a || b);
	}
}
*/

import java.util.Scanner;

public class Operator524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		boolean b1 = (inp1 != 0);
		boolean b2 = (inp2 != 0);

		System.out.printf("%b %b", b1 && b2, b1 || b2); // && , || <- 논리 연산자, &, |<- 비트 연산자
	}
}
