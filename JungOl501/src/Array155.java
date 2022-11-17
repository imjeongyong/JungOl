import java.util.Scanner;

public class Array155 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		switch (c) {
		case 'J':
			System.out.print("0");
			break;
		case 'U':
			System.out.print("1");
			break;
		case 'N':
			System.out.print("2");
			break;
		case 'G':
			System.out.print("3");
			break;
		case 'O':
			System.out.print("4");
			break;
		case 'L':
			System.out.print("5");
			break;
		default:
			System.out.print("none");
			break;
		}
		sc.close();
	}
}