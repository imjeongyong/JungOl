import java.util.Scanner;

public class tjscor121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();

//		System.out.println(i);

		if (i > 0) {
			System.out.println("plus");
		} else if (i == 0) {
			System.out.println("zero");
		} else {
			System.out.println("minus");
		}
	}
}