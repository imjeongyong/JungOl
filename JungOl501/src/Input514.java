import java.util.Scanner;

public class Input514 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("height = ");
		double height = sc.nextDouble();
		sc.close();

//		System.out.printf("Your height is %.0f", height);
//		System.out.println("cm.");

		System.out.printf("Your height is %.0fcm.", height);
	}
}