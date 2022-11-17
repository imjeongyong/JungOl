/*
import java.util.Scanner;

public class Operator523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.printf("%d > %d --- %b\n", a, b, (a > b));
		System.out.printf("%d < %d --- %b\n", a, b, (a < b));
		System.out.printf("%d >= %d --- %b\n", a, b, (a >= b));
		System.out.printf("%d <= %d --- %b\n", a, b, (a <= b));
	}
}
*/

/*
import java.util.Scanner;

public class Operator523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		System.out.print(a + " > " + b + " --- ");
		if (a > b)	System.out.println("1");
		else 		System.out.println("0");
		System.out.print(a + " < " + b + " --- ");
		if (a < b)	System.out.println("1");
		else		System.out.println("0");
		System.out.print(a + " >= " + b + " --- ");
		if (a >= b)	System.out.println("1");
		else		System.out.println("0");
		System.out.print(a + " <= " + b + " --- ");
		if (a <= b)	System.out.println("1");
		else		System.out.println("0");
	}
}
*/

import java.util.Scanner;

public class Operator523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = (a > b) ? 1 : 0;
		System.out.print(a + " > " + b + " --- " + c);
		System.out.println();
		c = (a < b) ? 1 : 0;
		System.out.print(a + " < " + b + " --- " + c);
		System.out.println();
		c = (a >= b) ? 1 : 0;
		System.out.print(a + " >= " + b + " --- " + c);
		System.out.println();
		c = (a <= b) ? 1 : 0;
		System.out.print(a + " <= " + b + " --- " + c);
		System.out.println();
	}
}